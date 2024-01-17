package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.CreatedAccountPage;
import pages.HomePage;
import pages.SignupLoginPage;
import pages.SignupPage;

import static utils.StringUtil.generateRandomString;

public class SignupTests extends BaseTest{
    static  String email = generateRandomString(6) + "@a435.com";
    static  String password = "4525444s";

    @Test  //Case1_RegisterUser
    void SignupTest() throws InterruptedException {
        SoftAssert softAssert = new SoftAssert();
        WebDriver driver = setupWebDriver("chrome");

        SignupLoginPage loginPage = new SignupLoginPage(driver);
        loginPage.openURL();
        loginPage.fillSignUpForm("john", email);

        SignupPage signupPage = new SignupPage(driver);
        softAssert.assertEquals(driver.getTitle(), "Automation Exercise - Signup");
        //Assert.assertEquals(driver.getTitle(), "Automation Exercise - Signup");
        signupPage.clearName();
        System.out.println(signupPage.getAttrib());
        softAssert.assertEquals(signupPage.getAttrib(),"");
        signupPage.setName("Johnik");
        System.out.println(signupPage.getAttrib());
        softAssert.assertEquals(signupPage.getAttrib(),"Johnik");
        signupPage.setPassword(password);
        signupPage.fillSignUpForm("10","July","1996",true,true,"john","smith","amazon","texas","texas2","Canada","california","la","125a","5555");
        //softAssert.assertEquals(signupPage.getTextFromRadio(),"Mrs.");


        CreatedAccountPage createdAccountPage = new CreatedAccountPage(driver);

        softAssert.assertTrue(createdAccountPage.isCreatedTextShown(), "Created Text was shown");
        createdAccountPage.clickOnContinueButton();

       // closeDriver(driver);

        softAssert.assertAll();
    }
}
