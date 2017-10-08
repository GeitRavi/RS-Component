package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Util;


import java.util.List;

import static org.junit.Assert.assertTrue;

/**
 * Created by RaviK on 06/10/2017.
 */
public class SearchPage {

    @FindBy(css = "#zeroResultBody > h2:nth-child(1)")
    WebElement noSearchResultText;

    @FindBy(css = "#pagecell > section > div:nth-child(1) > h1")
    WebElement ProductText;

    @FindBy(css = "#filters > div > div > rs-facets > a:nth-child(1)")
    WebElement MainBrandFilter;

    @FindBy(css = "#filters > div > div > rs-facets > div > div.popover-inner > div > div.clearfix > div > span > div:nth-child(10) >label >input")
    WebElement SubBrandFilter;

    @FindBy(css = "#bread-box > div.matches > div:nth-child(2) > span > rs-apply-button > button")
    WebElement ApplyFilterButton;

    @FindBy(css = "#sticky-results-header > rs-pagination > div > div > div:nth-child(2) > ul > li:nth-child(3) > a.pageNumber.currentPage")
    WebElement PageResultCount;

    @FindBy(css = "#results-table > tbody > tr")
    List<WebElement> ProductResultCount;

    @FindBy(css = "#results-table > tbody > tr:nth-child(1) > td.priceCol > div:nth-child(3) > div > input.quantity-field")
    WebElement FirstProductQuantityText;

    @FindBy(css = "#results-table > tbody > tr:nth-child(1) > td.priceCol > div:nth-child(3) > div > button")
    WebElement FirstProductAddButton;
    // #results-table > tbody > tr.resultRow button.btn.btn-danger.addToBasketBtn")

    @FindBy(css = "#results-table > tbody > tr:nth-child(2) > td.priceCol > div:nth-child(3) > div > input.quantity-field")
    WebElement SecondProductQuantityText;

    @FindBy(css = "#results-table > tbody > tr:nth-child(2) > td.priceCol > div:nth-child(3) > div > button")
    WebElement SecondProductAddButton;

    @FindBy(css = "#miniBasketId > i")
    WebElement BasketLink;

    @FindBy(css = "#filters > div > div > rs-facets > div > div.popover-inner > div > div.col-xs-1 > span")
    WebElement CloseFilter;


    @FindBy(css = "#filters > div > div > rs-facets > a:nth-child(4)")
    WebElement MainThermometerTypeFilter;

    @FindBy(css = "#filters > div > div > rs-facets > div > div.popover-inner > div > div.clearfix > div > span > div:nth-child(3)")
    WebElement SubThermometerTypeFilter;


    protected WebDriver driver;

    public SearchPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String getNoSearchResultText() {
        return noSearchResultText.getText();
    }

    public String getProductText() {
        return ProductText.getText();
    }

    public void applyFilter() {
        assertTrue("MainBrandFilter is not found", Util.checkWebElement(driver, MainBrandFilter));
        MainBrandFilter.click();
        SubBrandFilter.click();
        ApplyFilterButton.click();
    }

    public void applyMultipleFilter() {
        assertTrue("MainBrandFilter is not found", Util.checkWebElement(driver, MainBrandFilter));
        MainBrandFilter.click();
        SubBrandFilter.click();
        CloseFilter.click();
        Util.waitForOneSecond();
        MainThermometerTypeFilter.click();
        Util.waitForOneSecond();
        SubThermometerTypeFilter.click();

        ApplyFilterButton.click();
    }

    public Boolean getProductResultCount() {
        boolean count = ProductResultCount.size() > 0;
        return count;
    }

    public CheckOutPage selectFirstProduct(String text) throws Exception {
        addFirstProduct(text);
        BasketLink.click();
        return new CheckOutPage(driver);

    }

    public CheckOutPage selectFirstANDSecondProduct(String firstText, String secondText) throws Exception {
        addFirstProduct(firstText);
        addSecondProduct(secondText);
        BasketLink.click();
        return new CheckOutPage(driver);

    }

    public void addFirstProduct(String text) {
        assertTrue("FirstProductQuantityText is not found", Util.checkWebElement(driver, FirstProductQuantityText));
        Util.waitForOneSecond();
        FirstProductQuantityText.click();
        Util.waitForOneSecond();
        FirstProductQuantityText.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        FirstProductQuantityText.sendKeys(Keys.BACK_SPACE);
        FirstProductQuantityText.sendKeys(text);
        FirstProductAddButton.click();
    }

    public void addSecondProduct(String text) {
        assertTrue("SecondProductQuantityText is not found", Util.checkWebElement(driver, SecondProductQuantityText));
        Util.waitForOneSecond();
        SecondProductQuantityText.click();
        Util.waitForOneSecond();
        SecondProductQuantityText.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        SecondProductQuantityText.sendKeys(Keys.BACK_SPACE);
        SecondProductQuantityText.sendKeys(text);
        SecondProductAddButton.click();
    }

}
