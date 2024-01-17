package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.time.Instant;

import static org.openqa.selenium.support.ui.ExpectedConditions.alertIsPresent;



public abstract class BasePage {
    WebDriver driver;
    Duration timeout = Duration.ofSeconds(10);

    public abstract void openURL();

    public WebElement getElement(By locator) {
        return driver.findElement(locator);
    }

    public void clearElement(By locator) {
        getElement(locator).clear();
    }

    public void displayedElement(By locator) {
        getElement(locator).isDisplayed();
    }

    public void clickOnElement(By locator) {
        getClickableElement(locator).click();
    }

    public void sendKeysOnElement(By locator, String name) {
        getElement(locator).sendKeys(name);
    }
    public String getTextfromElement(By locator) {
        return getElement(locator).getText();
    }
    public String getAttribute(By locator) {
        return getElement(locator).getAttribute("value");
    }

    public void setValues(By locator,String name){
        clickOnElement(locator);
        sendKeysOnElement(locator,name);
    }
    public void selectOptionByText(By locator, String text) {
        Select drop = new Select(getElement(locator));
        drop.selectByVisibleText(text);
    }

    WebElement getVisibleElement(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
    WebElement getClickableElement(By locator){
        WebDriverWait wait = new WebDriverWait(driver,timeout);
        return wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    boolean isElementVisible(By locator,Duration duration){
        WebDriverWait wait = new WebDriverWait(driver,duration);
        return wait.until(ExpectedConditions.visibilityOf(getElement(locator))).isDisplayed();
    }

    public boolean isCheckboxSelected(By locator){

        return getVisibleElement(locator).isSelected();
    }

    public void setCheckboxState(By locator,boolean check) {
        if(isCheckboxSelected(locator) != check){
            clickOnElement(locator);
        }
    }
    private static final By SUBSCRIP_EMAIL = By.id("susbscribe_email");
    private static final By SUBSCRIP_BUTTON = By.id("subscribe");
    private static final By SUCCESS_ALERT = By.xpath("//*[@id=\"success-subscribe\"]/div");
    public void subsrib(){
        setValues(SUBSCRIP_EMAIL,"abc@gmail.com");
    }
    public void addSubscrib(){
        subsrib();
        clickOnElement(SUBSCRIP_BUTTON);
    }
    public void appearsSuccess(){
        getVisibleElement(SUCCESS_ALERT);
    }
    public void scrollDown(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 8500);");
    }
    public void acceptAlert(){
        Alert alerts1 = driver.switchTo().alert();
        System.out.println(alerts1.getText());
        alerts1.accept();
    }
    public void manageModal(By locator){
        //WebDriverWait wait = new WebDriverWait(driver,10);

    }

}
