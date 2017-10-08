package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.util.concurrent.TimeUnit;

/**
 * Created by RaviK on 07/10/2017.
 */
public class Util {

    protected static WebDriver driver;

    public static boolean checkWebElement(WebDriver driver, WebElement Element) {

        WebDriverWait wait = new WebDriverWait(driver, 20);
        return wait.until(ExpectedConditions.not(ExpectedConditions.invisibilityOf(Element)));
    }


    public static void waitForOneSecond() {

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static WebDriver getDriver() {

        String OS_name = System.getProperty("os.name").toLowerCase().substring(0, 3);

        switch (OS_name) {
            case "mac":
                System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + File.separator + "src" + File.separator + "test" + File.separator + "resources" + File.separator + "chromedriver");
                break;
            case "win":
                System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + File.separator + "src" + File.separator + "test" + File.separator + "resources" + File.separator + "chromedriver.exe");
                break;
            default:
                System.out.println("Please Check Browser client setting base on OS");
                break;
        }

       String BrowserName = PropertyReader.getProperty("Browser").toLowerCase();
        switch (BrowserName) {
            case "chrome":
                driver = new ChromeDriver();
                break;
            default:
                System.out.println("Please enter valid Browser details");
                break;
        }

        return driver;
    }
}
