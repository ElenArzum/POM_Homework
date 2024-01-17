package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import pages.TestCasesPage;

public class TestCasesTest extends BaseTest {
    @Test
    void testCases() {
        WebDriver driver = setupWebDriver("chrome");
        SoftAssert softAssert = new SoftAssert();
        HomePage homepage = new HomePage(driver);
        homepage.openURL();
        homepage.clickOnTestCases();
        TestCasesPage testCasesPage = new TestCasesPage(driver);
        testCasesPage.visibleTextCases();
        softAssert.assertEquals(testCasesPage.getText(), "TEST CASES");
    }

}
