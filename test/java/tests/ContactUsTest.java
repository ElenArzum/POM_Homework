package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.ContactUsPage;
import pages.HomePage;

public class ContactUsTest extends BaseTest{
    @Test
    void contactUs(){
        WebDriver driver = setupWebDriver("chrome");
        HomePage homepage = new HomePage(driver);
        homepage.openURL();
        homepage.clickOnContactUs();

        ContactUsPage contactUsTest = new ContactUsPage(driver);
        contactUsTest.visibleGetIntouch();
        contactUsTest.fillContacts("usee","d@jj.mail.com","sj","message");
        contactUsTest.visibleSuccess();
       // contactUsTest.clickHomeButton();
    }
}

