package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.CartPage;
import pages.HomePage;

public class SubscriptionTest extends BaseTest{
    @Test
    void subscription(){
        WebDriver driver = setupWebDriver("chrome");
        SoftAssert softAssert = new SoftAssert();
        HomePage homepage = new HomePage(driver);
        homepage.openURL();
        homepage.scrollDown();
        homepage.addSubscrib();
        homepage.appearsSuccess();

    }
    @Test
    void subscriptionFromCart(){
        WebDriver driver = setupWebDriver("chrome");
        SoftAssert softAssert = new SoftAssert();
        HomePage homepage = new HomePage(driver);
        homepage.openURL();
        homepage.clickOnCart();
        homepage.scrollDown();
        homepage.addSubscrib();
        homepage.appearsSuccess();

    }


}
