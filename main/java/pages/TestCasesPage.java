package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestCasesPage extends BasePage {
    public TestCasesPage(WebDriver driver){
        super.driver =driver;
    }
    private static final By TEST_CASES_TEXT=By.className("title");
    @Override
    public void openURL() {
    }
    public void visibleTextCases(){
        displayedElement(TEST_CASES_TEXT);
    }

    public String getText(){
        return getTextfromElement(TEST_CASES_TEXT);

    }
}
