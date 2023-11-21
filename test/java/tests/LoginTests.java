package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.Deleted_AccountPage;
import pages.HomePage;
import pages.Signup_LoginPage;

public class LoginTests extends BaseTest {
    @Test
    void LoginTestWithCorrectDate() {
        WebDriver driver = setupWebDriver("chrome");
        Signup_LoginPage signupLoginPage = new Signup_LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        signupLoginPage.openURL();
        homePage.clickonSignUpLoginbutton();
        signupLoginPage.sendLoginEmail("John@a4c1.com");
        signupLoginPage.sendLoginPassword("4525444s");
        signupLoginPage.clickOnLoginSubmit();
        homePage.displayedSignedIcon();
        homePage.logOutElement();
        driver.getTitle();
        driver.quit();
    }
@Test
    void LoginTestWithIncorrectDate() {
        WebDriver driver = setupWebDriver("chrome");
        Signup_LoginPage signupLoginPage = new Signup_LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        signupLoginPage.openURL();
        homePage.clickonSignUpLoginbutton();
        signupLoginPage.sendLoginEmail("John@abc.com");
        signupLoginPage.sendLoginPassword("pass12");
        signupLoginPage.clickOnLoginSubmit();
        signupLoginPage.displayedIncorrectText();
        driver.quit();
    }
    @Test
    void DeleteLoggedAccount() {
        WebDriver driver = setupWebDriver("chrome");
        Signup_LoginPage signupLoginPage = new Signup_LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        Deleted_AccountPage deletedAccountPage = new Deleted_AccountPage(driver);
        signupLoginPage.openURL();
        homePage.clickonSignUpLoginbutton();
        signupLoginPage.sendLoginEmail("John@a4c1.com");
        signupLoginPage.sendLoginPassword("4525444s");
        signupLoginPage.clickOnLoginSubmit();
        homePage.deleteAccount();
        deletedAccountPage.displayText();
        deletedAccountPage.clickonContinue();
        driver.getTitle();
        driver.quit();
    }


}
