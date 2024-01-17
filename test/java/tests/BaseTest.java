package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseTest {
    @BeforeSuite
    void beforeSuite(){
        System.out.println("Before suite ");
    }
    @AfterSuite
    void afterSuite(){
        System.out.println("After suite ");
    }

    {
        System.out.println("bn");
    }
    WebDriver setupWebDriver(String browser){
        WebDriver driver = null;
        if (browser.equalsIgnoreCase("chrome")){
            driver = new ChromeDriver();
        }
        return  driver;
    }

    void closeDriver(WebDriver driver){
        driver.quit();
    }
}

