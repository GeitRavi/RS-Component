package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.PropertyReader;
import utils.Util;


import static org.junit.Assert.assertTrue;

/**
 * Created by RaviK on 07/10/2017.
 */
public class CheckOutPage {

    @FindBy(css = "#checkoutSecurelyAndPuchBtn")
    WebElement CheckOutButton;

    @FindBy(css = "#loginForm\\3a LoginWidgetAction_username_decorate\\3a LoginWidgetAction_username")
    WebElement UserNameText;

    @FindBy(css = "#loginForm\\3a LoginWidgetAction_password_decorate\\3a LoginWidgetAction_password")
    WebElement PasswordText;

    @FindBy(css = "#loginForm\\3a login")
    WebElement LoginButton;

    @FindBy(css = "#shoppingBasketForm\\3a WebBasketLineWidgetActionVALIDATION_ERROR_EVENT > table > tbody > tr.dataRow.lineRow > td.descriptionTd")
    WebElement ProductDetails;

    @FindBy(css = "#deliveryCollectionForm\\3a j_idt1030 > span")
    WebElement AddDeliveryAddress;

    @FindBy(css = "#listAddressListId > div.manageListItem.manageListItemSelected > table > tbody > tr > td.listAddressItemdataTd")
    WebElement ExistDeliveryAddress;

    @FindBy(css = "#deliveryCollectionForm\\3a AddDeliveryAddressWidgetAction_companyNameOne_decorate\\3a AddDeliveryAddressWidgetAction_companyNameOne")
    WebElement CompanyNameOne;

    @FindBy(css = "#deliveryCollectionForm\\3a AddDeliveryAddressWidgetAction_addressLineOne_decorate\\3a AddDeliveryAddressWidgetAction_addressLineOne")
    WebElement AddressLineOne;

    @FindBy(css = "#deliveryCollectionForm\\3a AddDeliveryAddressWidgetAction_addressLineThree_decorate\\3a AddDeliveryAddressWidgetAction_addressLineThree")
    WebElement TownText;

    @FindBy(css = "#deliveryCollectionForm\\3a AddDeliveryAddressWidgetAction_postCode_decorate\\3a AddDeliveryAddressWidgetAction_postCode")
    WebElement PostCodeText;

    @FindBy(css = "#deliveryCollectionForm\\3a j_idt1390 > span")
    WebElement SaveAddressButton;

    @FindBy(css = "#checkoutSecurelyBtn")
    WebElement ContinuePaymentButton;

    @FindBy(css = "#acsMainInvite > a")
    WebElement SurveyPopUP;

    protected WebDriver driver;


    public CheckOutPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickCheckOut() {
        Util.waitForOneSecond();
        try {
            Util.checkWebElement(driver, CheckOutButton);
            //CheckOutButton.isDisplayed();
            Util.waitForOneSecond();
            CheckOutButton.click();
        } catch (Exception e) {
            SurveyPopUP.click();
            Util.waitForOneSecond();
            CheckOutButton.click();
        }
    }

    public String getProductdetailText() {
        assertTrue("ProductDetails Element not found", Util.checkWebElement(driver, ProductDetails));
        return ProductDetails.getText();
    }

    public void checkExistOrAddNewDeliveryAddress() {
        Util.waitForOneSecond();
        if (!Util.checkWebElement(driver, ExistDeliveryAddress)) {
            AddDeliveryAddress.click();
            CompanyNameOne.sendKeys("Test");
            AddressLineOne.sendKeys("Queens Road");
            TownText.sendKeys("Nottingham");
            PostCodeText.sendKeys("NG2 3BX");
            SaveAddressButton.click();
            ContinuePaymentButton.click();
        } else {
            ContinuePaymentButton.click();
        }
    }

    public void enterLoginDetails() {
        UserNameText.sendKeys(PropertyReader.getProperty("RS_Username"));
        PasswordText.sendKeys(PropertyReader.getProperty("RS_Password"));
        LoginButton.click();
        Util.waitForOneSecond();
    }

    public void checkOutWithoutPayment() {
        clickCheckOut();
        enterLoginDetails();
        Util.waitForOneSecond();
        clickCheckOut();
        checkExistOrAddNewDeliveryAddress();
    }
}






