package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class CreatedAccountPage extends BasePage {
    public CreatedAccountPage(WebDriver driver) {
        super.driver = driver;
    }

    private static final By ACC_CREATED_TEXT = By.cssSelector("[data-qa='account-created']");
    private static final By CONTINUE_BUTTON = By.cssSelector("[data-qa=continue-button]");

    @Override
    public void openURL() {
        driver.get("https://automationexercise.com/");
    }

    public void accountCreatedVisib() {
        getVisibleElement(ACC_CREATED_TEXT);
        System.out.println("Account Created text is displayed ");
    }

    public void clickOnContinueButton() {
        clickOnElement(CONTINUE_BUTTON);
    }

    public boolean isCreatedTextShown() {
        System.out.println("Account Created text is displayed ");
        return isElementVisible(ACC_CREATED_TEXT, Duration.ofSeconds(5));
    }
}