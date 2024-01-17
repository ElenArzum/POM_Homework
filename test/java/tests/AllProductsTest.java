package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.AllProductsPage;
import pages.CartPage;
import pages.HomePage;

public class AllProductsTest extends BaseTest {
    @Test
    void testCases() {
        WebDriver driver = setupWebDriver("chrome");
        SoftAssert softAssert = new SoftAssert();
        HomePage homepage = new HomePage(driver);
        homepage.openURL();
        homepage.clickOnProducts();

        AllProductsPage allProductsPage = new AllProductsPage(driver);
        allProductsPage.clickOnFirstProduct();
        allProductsPage.getAvailabText();
        allProductsPage.getCondText();
        allProductsPage.getBrandText();
        allProductsPage.searchlist("top");

    }

    @Test
    void testCases2() {
        WebDriver driver = setupWebDriver("chrome");
        SoftAssert softAssert = new SoftAssert();
        HomePage homepage = new HomePage(driver);
        homepage.openURL();
        homepage.clickOnProducts();

        AllProductsPage allProductsPage = new AllProductsPage(driver);

        allProductsPage.searchlist("top");


    }

    @Test
    void testCases3() {
        WebDriver driver = setupWebDriver("chrome");
        SoftAssert softAssert = new SoftAssert();
        HomePage homepage = new HomePage(driver);
        homepage.openURL();
        homepage.clickOnProducts();

        AllProductsPage allProductsPage = new AllProductsPage(driver);
        allProductsPage.clickOnAddToCart_1();
        allProductsPage.clickOnAddToCart_2();
        homepage.clickOnCart();

        CartPage cartPage = new CartPage(driver);
        cartPage.checkInTable();


    }
@Test
    void testCases4() {
        WebDriver driver = setupWebDriver("chrome");
        SoftAssert softAssert = new SoftAssert();
        HomePage homepage = new HomePage(driver);
        homepage.openURL();
        homepage.clickOnProducts();

        AllProductsPage allProductsPage = new AllProductsPage(driver);
        allProductsPage.clickOnFirstProduct();
        allProductsPage.quantity("4");
    }
    @Test
    void testCases5() throws InterruptedException {
        WebDriver driver = setupWebDriver("chrome");
        SoftAssert softAssert = new SoftAssert();
        HomePage homepage = new HomePage(driver);
        homepage.openURL();
        homepage.clickOnProducts();

        AllProductsPage allProductsPage = new AllProductsPage(driver);
        allProductsPage.clickOnAddToCart_1();
        homepage.clickOnCart();

        CartPage cartPage = new CartPage(driver);
        Thread.sleep(2);
        cartPage.setCheckOut();
    }

}
