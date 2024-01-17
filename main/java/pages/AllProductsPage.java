package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class AllProductsPage extends BasePage {
    public AllProductsPage(WebDriver driver) {
        this.driver = driver;
    }

    private static final By FIRST_PRODUCT = By.xpath("//a[@href='/product_details/1']");
    private static final By GET_AVAILAB_TEXT = By.xpath("//*[contains(text(),'Availability')]");
    private static final By GET_COND_TEXT = By.xpath("//*[contains(text(),'Condition')]");
    private static final By GET_BRAND_TEXT = By.xpath("//*[contains(text(),'Brand')]");
    private static final By SEARCH_FIELD = By.id("search_product");
    private static final By SEARCH_ICON = By.id("submit_search");
    private static final By ADD_TO_CART_1 = By.xpath("//a[@class='btn btn-default add-to-cart' and @data-product-id='1']");
    static final By ADD_TO_CART_2 = By.xpath("//a[@class='btn btn-default add-to-cart' and @data-product-id='2']");
    private static final By MODAL_CONTINUE = By.xpath("//button[@class='btn btn-success close-modal btn-block' and @data-dismiss='modal']");
    private static final By QUANTITY_PRODUCT = By.id("quantity");
    @Override
    public void openURL() {
    }

    public void clickOnFirstProduct() {
        clickOnElement(FIRST_PRODUCT);
    }

    public void getAvailabText() {
        getVisibleElement(GET_AVAILAB_TEXT);
    }

    public void getCondText() {
        getVisibleElement(GET_COND_TEXT);
    }

    public void getBrandText() {
        getVisibleElement(GET_BRAND_TEXT);
    }

    public void searchField(String searchkey) {

        sendKeysOnElement(SEARCH_FIELD, searchkey);
    }

    public void clickOnSearch() {
        clickOnElement(SEARCH_ICON);
    }

    public void searchlist(String searchKey) {
        searchField(searchKey);
        clickOnSearch();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        List<WebElement> products = driver.findElements(By.xpath("//div[@class='product']"));

        // Verify the visibility of each product
        for (WebElement product : products) {
            if (product.isDisplayed()) {
                System.out.println("visible" + product.getText());
            } else {
                product.getText();
            }

        }
    }
    public void clickOnAddToCart_1(){
        clickOnElement(ADD_TO_CART_1);
        clickOnElement(MODAL_CONTINUE);
    }
    public void clickOnAddToCart_2(){
        clickOnElement(ADD_TO_CART_2);
        clickOnElement(MODAL_CONTINUE);
    }

    public void quantity(String quantity){
        clearElement(QUANTITY_PRODUCT);
        sendKeysOnElement(QUANTITY_PRODUCT,"4");

    }


}

