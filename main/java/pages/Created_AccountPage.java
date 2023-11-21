package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Created_AccountPage extends BasePage {
    public Created_AccountPage(WebDriver driver) {
        super.driver = driver;
    }

    private static final By ACC_CREATEDTEXT = By.cssSelector("[data-qa='account-created']");
    private static final By CONTINUEBUTTON = By.cssSelector("[data-qa=continue-button]");

    @Override
    public void openURL() {
        driver.get("https://automationexercise.com/");
    }

    public void accountCreatedVisib() {
        getVisibleElement(ACC_CREATEDTEXT);
        System.out.println("Account Created text is displayed ");
    }

    public void clickOnContinueButton() {
        clickOnElement(CONTINUEBUTTON);
    }
}
