package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.DeletedAccountPage;
import pages.HomePage;
import pages.SignupLoginPage;

import static tests.SignupTests.email;
import static tests.SignupTests.password;

public class LoginTest extends BaseTest {
   /* @BeforeTest
    void setupTest() {
        WebDriver driver = setupWebDriver("chrome");
        HomePage homePage = new HomePage(driver);
        homePage.openURL();
        homePage.clickonSignUpLoginbutton();
    }*/

    @Test(priority = 2) //TestCas2
    void LoginWithCorrectDate() {
        SoftAssert softAssert = new SoftAssert();
        WebDriver driver = setupWebDriver("chrome");
        SignupLoginPage signupLoginPage = new SignupLoginPage(driver);
        signupLoginPage.openURL();
        //signupLoginPage.fillSignInForm("el@gmail.com", "123456");
        signupLoginPage.fillSignInForm(email, password);
        HomePage homePage = new HomePage(driver);
        homePage.displayedSignedIcon();

        softAssert.assertEquals(driver.getTitle(), "Automation Exercise");

        softAssert.assertAll();
    }

    @Test(priority = 1) //TestCas3
    void LoginWithInCorrectDate() {
        SoftAssert softAssert = new SoftAssert();
        WebDriver driver = setupWebDriver("chrome");
        SignupLoginPage signupLoginPage = new SignupLoginPage(driver);
        signupLoginPage.openURL();
        signupLoginPage.fillSignInForm("ghfhgn@gmail.com", "kjhgb");
        signupLoginPage.getText();
        softAssert.assertEquals(signupLoginPage.getText(), "Your email or password is incorrect!");

        softAssert.assertAll();
    }

    @Test(priority = 3)
    void DeleteLoggedAccount() {
        SoftAssert softAssert = new SoftAssert();

        WebDriver driver = setupWebDriver("chrome");
        SignupLoginPage signupLoginPage = new SignupLoginPage(driver);
        signupLoginPage.openURL();
        signupLoginPage.fillSignInForm(email, password);

        HomePage homePage = new HomePage(driver);
        homePage.deleteAccount();

        DeletedAccountPage deletedAccountPage = new DeletedAccountPage(driver);
        deletedAccountPage.displayText();
        softAssert.assertEquals(deletedAccountPage.getText(), "ACCOUNT DELETED!");
        deletedAccountPage.clickonContinue();

        softAssert.assertAll();

    }

    /*@AfterTest
    void closingTest() {
        WebDriver driver = setupWebDriver("chrome");
        closeDriver(driver);
    }*/
}

