package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignupLoginPage extends BasePage {
    public SignupLoginPage(WebDriver driver) {
        super.driver = driver;
    }

    private static final By SIGNUP_NAME = By.cssSelector("[data-qa='signup-name']");
    private static final By SIGNUP_EMAIL = By.cssSelector("[data-qa='signup-email']");
    private static final By SIGNUP_BUTTON = By.cssSelector("[data-qa='signup-button']");
    private static final By LOGIN_PASSWORD = By.cssSelector("[data-qa='login-password']");
    private static final By LOGIN_EMAIL = By.cssSelector("[data-qa='login-email']");
    private static final By LOGIN_BUTTON = By.cssSelector("[data-qa='login-button']");
    public static final By INCORRECT_TEXT = By.xpath("//*[contains(text(),'incorrect')]");

    @Override
    public void openURL() {
        driver.get("https://automationexercise.com/login");
    }

    public void sendLoginEmail(String name) {
        sendKeysOnElement(LOGIN_EMAIL, name);
    }

    public void sendLoginPassword(String name) {
        sendKeysOnElement(LOGIN_PASSWORD, name);
    }

    public void sendNameSignup(String name) {
        sendKeysOnElement(SIGNUP_NAME, name);

    }

    public void sendEmailSignup(String name) {
        sendKeysOnElement(SIGNUP_EMAIL, name);
    }

    public void clickOnLoginSubmit() {
        clickOnElement(LOGIN_BUTTON);
    }

    public void clickOnSignUpSubmit() {
        clickOnElement(SIGNUP_BUTTON);
    }

    public String getText(){
      return getTextfromElement(INCORRECT_TEXT);

    }

    public void fillSignInForm(String email, String password){
        sendLoginEmail(email);
        sendLoginPassword(password);
        clickOnLoginSubmit();
    }
    public void fillSignUpForm(String name, String email){
        sendEmailSignup(email);
        sendNameSignup(name);
        clickOnSignUpSubmit();

    }
}

