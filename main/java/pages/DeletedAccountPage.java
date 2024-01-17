package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DeletedAccountPage extends BasePage {
    @Override
    public void openURL() {
    }

    public DeletedAccountPage(WebDriver driver) {
        super.driver = driver;
    }

    private static final By DELETED_TEXT = By.cssSelector("[data-qa=account-deleted]");
    private static final By CONTINUE_BUTTON = By.cssSelector("[data-qa=continue-button]");

    public void displayText() {
        displayedElement(DELETED_TEXT);
        System.out.println("Deleted text is displayed ");
    }

    public void clickonContinue() {
        clickOnElement(CONTINUE_BUTTON);
    }
    public String getText(){
        return getTextfromElement(DELETED_TEXT);

    }
}
