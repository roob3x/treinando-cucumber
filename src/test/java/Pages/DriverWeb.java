package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static Pages.Constants.CHROME_DRIVER_PATH;
import static Pages.URL.MAIN_PAGE;

public class DriverWeb {
    static WebDriver driver;
    public static WebDriver getDriver(){
        if (driver == null) {
            System.setProperty("webdriver.chrome.driver", CHROME_DRIVER_PATH);
            System.setProperty("webdriver.chrome.silentOutput", "true");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
        }
        return driver;
    }

    public static void abrirURL(){
        driver.get(MAIN_PAGE);
    }
    public static void endSession() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }




}
