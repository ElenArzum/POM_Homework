package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
    WebDriver setupWebDriver(String browser){
        WebDriver driver = null;
        if (browser.equalsIgnoreCase("chrome")){
            driver = new ChromeDriver();
        }
        return  driver;
    }
}
