package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Util;


import static org.junit.Assert.assertTrue;


/**
 * Created by RaviK on 06/10/2017.
 */

public class LoginPage {

    @FindBy(css = "#pageHeader > div.shHeader > div.loginContainer > div > a:nth-child(1)")
    WebElement LoginLink;

    @FindBy(name = "username")
    WebElement Username;

    @FindBy(name = "j_password")
    WebElement Password;

    @FindBy(className = "regButton")
    WebElement LoginButton;

    @FindBy(css = "#searchTerm")
    WebElement SearchText;

    @FindBy(css = "#btnSearch")
    WebElement SearchButton;

    protected WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickLogin() {
        LoginLink.click();
    }

    public void loginWithDetails(String UserText, String PasswordText) {
        Username.clear();
        Username.sendKeys(UserText);
        Password.clear();
        Password.sendKeys(PasswordText);
        LoginButton.sendKeys(Keys.RETURN);
    }

    public SearchPage enterSearch(String text) {
        assertTrue("SearchText element not found", Util.checkWebElement(driver, SearchText));
        SearchText.sendKeys(text);
        SearchButton.sendKeys(Keys.RETURN);
        return new SearchPage(driver);
    }
}