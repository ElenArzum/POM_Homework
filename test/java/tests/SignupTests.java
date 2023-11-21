package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.Created_AccountPage;
import pages.HomePage;
import pages.Signup_LoginPage;
import pages.SignupPage;

public class SignupTests extends BaseTest{
    @Test
    void SignupTest() throws InterruptedException {
        WebDriver driver = setupWebDriver("chrome");
        HomePage homePage = new HomePage(driver);
        Signup_LoginPage loginPage = new Signup_LoginPage(driver);
        loginPage.openURL();
        homePage.clickonSignUpLoginbutton();
        loginPage.sendNameSignup("John");
        loginPage.sendEmailSignup("John@a435.com");
        loginPage.clickOnSignUpSubmit();
        SignupPage signupPage = new SignupPage(driver);
        Created_AccountPage createdAccountPage = new Created_AccountPage(driver);
        signupPage.chooseRadio();
        signupPage.clearName();
        signupPage.setFirstName("Johnik");
        signupPage.setPassword("4525444s");
        signupPage.selectDayofBirt();
        signupPage.selectMonthofBirt();
        signupPage.selectYearofBirt();
        signupPage.clickOnSignupNewsletter();
        signupPage.clickOnSignupNewsletter();
        signupPage.setFirstName("John");
        signupPage.setLastName("Smith");
        signupPage.setCompanyName("amazon");
        signupPage.setAddress("California");
        signupPage.setAddress2("newli");
        signupPage.selectCountry();
        signupPage.setState("abcsd");
        signupPage.setCity("hwgs");
        signupPage.setZipcode("1244A6");
        signupPage.setMobNumb("1124245");
        Thread.sleep(5000);
        signupPage.clickCreateSubmit();
        createdAccountPage.accountCreatedVisib();
        createdAccountPage.clickOnContinueButton();
    }

}
