package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super.driver = driver;
    }

    private static final By SIGNUP_LOGIN = By.xpath("//*[contains(text(),'Signup / Login')]");
    private static final By CONTACT_US = By.xpath("//*[contains(text(),' Contact us')]");
    private static final By USER_SIGNED_ICON = By.xpath("//*[contains(text(),'Logged')]");
    private static final By LOG_OUT_USER = By.xpath("//*[contains(text(),'Logout')]");
    private static final By DELETE_ACCOUNT = By.xpath("//*[contains(text(),'Delete Account')]");
    private static final By TEST_CASES = By.xpath("//*[contains(text(),' Test Cases')]");
    private static final By CART = By.xpath("//*[contains(text(),' Cart')]");
    private static final By PRODUCTS = By.xpath("//a[contains(@href, '/products')]");
    private static final By SUBSCRIP_EMAIL = By.id("susbscribe_email");
    private static final By SUBSCRIP_BUTTON = By.id("subscribe");
    private static final By SUCCESS_ALERT = By.xpath("//*[@id=\"success-subscribe\"]/div");

    @Override
    public void openURL() {
        driver.get("https://automationexercise.com/");
    }

    public void clickonSignUpLoginbutton() {
        clickOnElement(SIGNUP_LOGIN);
    }

    public void clickOnContactUs(){
        clickOnElement(CONTACT_US);
    }

    public void displayedSignedIcon() {
        displayedElement(USER_SIGNED_ICON);
    }

    public void logOutElement() {
        clickOnElement(LOG_OUT_USER);
    }

    public void deleteAccount() {
        clickOnElement(DELETE_ACCOUNT);
    }
    public void clickOnTestCases(){
        clickOnElement(TEST_CASES);
    }
    public void clickOnProducts(){
        clickOnElement(PRODUCTS);
    }
    public void clickOnCart(){
        clickOnElement(CART);
    }
}
