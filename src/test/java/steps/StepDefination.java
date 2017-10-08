package steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import pages.CheckOutPage;
import pages.LoginPage;
import pages.SearchPage;
import utils.PropertyReader;
import utils.Util;


import java.io.File;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by RaviK on 06/10/2017.
 */
public class StepDefination {

    protected static WebDriver driver;

    protected LoginPage login;

    protected SearchPage search;

    protected CheckOutPage checkout;

    @Before
    public void setUp() {
        driver = Util.getDriver();
        driver.get(PropertyReader.getProperty("RS_URL"));
        driver.manage().window().fullscreen();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @After
    public void tearDown() {
        driver.close();
    }


    @Given("^User open RS component website\\.$")
    public void i_user_open_RS_component_website() throws Throwable {
        login = new LoginPage(driver);
    }


    @Given("^Click on login link and Enter valid username & password\\.$")
    public void Click_on_login_link_and_Enter_valid_username_password() throws Throwable {
        login.clickLogin();
        String UserText = PropertyReader.getProperty("RS_Username");
        String PasswordText = PropertyReader.getProperty("RS_Password");
        login.loginWithDetails(UserText, PasswordText);
        assertTrue(driver.getCurrentUrl().contains("home"));
    }


    @When("^Enter a valid item \"([^\"]*)\" into search field\\.$")
    public void i_user_enter_a_valid_item_details_into_search_field(String text) throws Throwable {
        search = login.enterSearch(text);
    }

    @When("^Select Brand filter & sub filter and Click Apply\\.$")
    public void apply_filter_and_sub_filter_() throws Throwable {
        search.applyFilter();
    }

    @When("^Select Multiple filter & sub filter and Click Apply\\.$")
    public void apply_multiple_filter_and_sub_filter_() throws Throwable {
        search.applyMultipleFilter();
    }

    @When("^Enter Product Quantity \"([^\"]*)\" and click Add product\\.$")
    public void enter_product_and_add_product(String text) throws Throwable {
        checkout = search.selectFirstProduct(text);
    }

    @When("^Select Two Product with Quantity \"([^\"]*)\" each and click Add product\\.$")
    public void select_two_product_and_add_product(String text) throws Throwable {
        checkout = search.selectFirstANDSecondProduct(text,text);
    }
    @Then("^Verify search item \"([^\"]*)\" in search result section\\.$")
    public void verify_search_item_is_result_section(String arg1) throws Throwable {
        assertTrue(search.getProductText().contains(arg1));
    }

    @Then("^Verify zero search result \"([^\"]*)\" in search result section\\.$")
    public void verify_zero_search_result_is_result_section(String arg1) throws Throwable {
        assertTrue(search.getNoSearchResultText().matches(arg1));
    }

    @Then("^Verify Result product page should contain atleast one result record\\.$")
    public void verify_result_product_count() {
        assertTrue(search.getProductResultCount());
    }


    @Then("^Verify Product \"([^\"]*)\" under checkout Page\\.$")
    public void verify_product_details_and_count(String arg1) {
        assertTrue(checkout.getProductdetailText().contains(arg1));
        checkout.checkOutWithoutPayment();
    }
}
