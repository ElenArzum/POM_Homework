package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignupPage extends BasePage {
    public SignupPage(WebDriver driver) {
        super.driver = driver;
    }

    private static final By ACCOUNT_INF = By.xpath("//*[contains(text(),'Enter')]");
    private static final By RADIO = By.cssSelector("[type=radio][id='id_gender2']");
    private static final By NAME1_FIELD = By.id("name");
    private static final By EMAIL1_FIELD = By.id("email");
    private static final By PASSWORD = By.id("password");
    private static final By DAY_OFF_BIRTH = By.id("days");
    private static final By MONTH_OF_BIRT = By.id("months");
    private static final By YEAR_OF_BIRTH = By.id("years");
    private static final By NEWSLET = By.id("newsletter");
    private static final By OFFERS = By.id("optin");
    private static final By FIRST_NAME = By.id("first_name");
    private static final By LAST_NAME = By.id("last_name");
    private static final By COMPANY = By.id("company");
    private static final By ADDRESS = By.id("address1");
    private static final By ADDRESS2 = By.id("address2");
    private static final By COUNTRY = By.id("country");
    private static final By STATE = By.id("state");
    private static final By CITY = By.id("city");
    private static final By ZIPCODE = By.id("zipcode");
    private static final By MOBILE = By.id("mobile_number");
    private static final By SUBMIT_BUTTON = By.cssSelector("[data-qa=create-account]");

    @Override
    public void openURL() {;
    }
    public void chooseRadio() {
        clickOnElement(RADIO);
    }
    public String getTextFromRadio(){
        return getTextfromElement(RADIO);

    }
    public String getTextFromName(){
        return getTextfromElement(NAME1_FIELD);

    }
    public String getAttrib(){
        return getAttribute(NAME1_FIELD);

    }
    public void setName(String Name) {
        sendKeysOnElement(NAME1_FIELD, Name);
    }

    public void setPassword(String Password) {
        sendKeysOnElement(PASSWORD, Password);
    }

    public void selectDayofBirt(String day) {
        selectOptionByText(DAY_OFF_BIRTH, day);
    }

    public void selectMonthofBirt(String month) {
        selectOptionByText(MONTH_OF_BIRT, month);
    }

    public void selectYearofBirt(String year) {
        selectOptionByText(YEAR_OF_BIRTH, year);
    }

    public void setSignupNewsletterState(boolean check) {
        setCheckboxState(NEWSLET, check);
    }

    public void clickonOffer(boolean check) {
        setCheckboxState(OFFERS, check);
    }

    public void clearName() {
        clearElement(NAME1_FIELD);
    }

    public void setFirstName(String FirstName) {
        sendKeysOnElement(FIRST_NAME, FirstName);
    }

    public void setLastName(String LastName) {
        sendKeysOnElement(LAST_NAME, LastName);
    }

    public void setCompanyName(String Company) {
        sendKeysOnElement(COMPANY, Company);
    }

    public void setAddress(String Adress1) {
        sendKeysOnElement(ADDRESS, Adress1);
    }

    public void setAddress2(String Adress2) {
        sendKeysOnElement(ADDRESS2, Adress2);
    }

    public void selectCountry(String country) {
        selectOptionByText(COUNTRY, country);
    }

    public void setState(String State) {
        sendKeysOnElement(STATE, State);
    }

    public void setCity(String City) {
        sendKeysOnElement(CITY, City);
    }

    public void setZipcode(String Zipcode) {
        sendKeysOnElement(ZIPCODE, Zipcode);
    }

    public void setMobNumb(String Mobile) {
        sendKeysOnElement(MOBILE, Mobile);
    }

    public void clickCreateSubmit() {
        clickOnElement(SUBMIT_BUTTON);
    }

    public void fillSignUpForm(String day, String month,String year,Boolean news,Boolean offer,String first_name, String last_name,String company, String address,String address2,String country,String State,String city,String zipcode,String mobile){
        chooseRadio();
        selectDayofBirt(day);
        selectMonthofBirt(month);
        selectYearofBirt(year);
        setSignupNewsletterState(true);
        clickonOffer(true);
        setFirstName(first_name);
        setLastName(last_name);
        setCompanyName(company);
        setAddress(address);
        setAddress2(address2);
        selectCountry(country);
        setCity(city);
        setState(State);
        setZipcode(zipcode);
        setMobNumb(mobile);
        clickCreateSubmit();



    }

}
