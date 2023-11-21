package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super.driver = driver;
    }

    private static final By SIGNUPLOGIN = By.xpath("//*[contains(text(),'Signup / Login')]");
    private static final By USERSIGNEDICON = By.xpath("//*[contains(text(),'Logged')]");
    private static final By LOGOUTUSER = By.xpath("//*[contains(text(),'Logout')]");
    private static final By DELETEACCOUNT = By.xpath("//*[contains(text(),'Delete Account')]");

    @Override
    public void openURL() {
        driver.get("https://automationexercise.com/");
    }

    public void clickonSignUpLoginbutton() {
        clickOnElement(SIGNUPLOGIN);
    }

    public void displayedSignedIcon() {
        displayedElement(USERSIGNEDICON);
    }

    public void logOutElement() {
        clickOnElement(LOGOUTUSER);
    }

    public void deleteAccount() {
        clickOnElement(DELETEACCOUNT);
    }

}
