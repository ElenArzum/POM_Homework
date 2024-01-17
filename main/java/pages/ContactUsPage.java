package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactUsPage extends BasePage{
    public ContactUsPage(WebDriver driver){
        this.driver = driver;
    }
    private static final By NAME_FIELD=By.cssSelector("[data-qa=name]");
    private static final By EMAIL_FIELD=By.cssSelector("[data-qa=email]");
    private static final By SUBJECT_FIELD=By.cssSelector("[data-qa=subject]");
    private static final By MESSAGE_FIELD=By.cssSelector("[data-qa=message]");
    private static final By UPLOAD_BUTTON=By.name("upload_file");
    private static final By SUBMIT_BUTTON=By.name("submit");
    private static final By GETINTOUCH_TEXT=By.xpath("//*[contains(text(),'Get In')]");
    private static final By SUCCESS_TEXT=By.className("status");
    private static final By HOME_BUTTON=By.id("form-section > a");
    @Override
    public void openURL() {
        driver.get("https://automationexercise.com/contact_us");
    }
    public void fillName(String name){
        sendKeysOnElement(NAME_FIELD,name);
    }
    public void fillEmail(String email){
        sendKeysOnElement(EMAIL_FIELD,email);
    }
    public void fillSubject(String subject){
        sendKeysOnElement(SUBJECT_FIELD,subject);
    }
    public void fillMessage(String message){
        sendKeysOnElement(MESSAGE_FIELD,message);
    }
    public void visibleGetIntouch(){
        displayedElement(GETINTOUCH_TEXT);
    }
    public void clickOnUpload(){
        sendKeysOnElement(UPLOAD_BUTTON,"C:\\Users\\User\\OneDrive\\Рабочий стол");

    }
    public void clickonSubmit(){
        clickOnElement(SUBMIT_BUTTON);

    }
    public void fillContacts(String name, String email, String subject,String message){
        fillName(name);
        fillEmail(email);
        fillSubject(subject);
        fillMessage(message);
        //clickOnUpload();
        clickonSubmit();
        Alert alerts1 = driver.switchTo().alert();
        System.out.println(alerts1.getText());
        alerts1.accept();
    }
    public void visibleSuccess(){
        displayedElement(SUCCESS_TEXT);
    }
    public void clickHomeButton(){
        clickOnElement(HOME_BUTTON);
    }
}
