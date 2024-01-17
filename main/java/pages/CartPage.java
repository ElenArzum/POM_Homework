package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CartPage extends BasePage{
    public CartPage(WebDriver driver) {
        super.driver = driver;
    }
    private static final By CHECK_OUT = By.className("btn btn-default check_out");
    private static final By CHECK_OUT_MODAL=By.xpath("//*[contains(text(),' proceed')]");
    private static final By CHECK_REGISTER = By.cssSelector("a[href='/login'] u");
    @Override
    public void openURL() {

    }
    public void checkInTable(){
        List<WebElement> cartProducts = driver.findElements(By.id("cart_info_table"));
        if (cartProducts.size() == 2) {
            System.out.println("Both products are added to the cart");
        } else if (cartProducts.size() < 2) {
            System.out.println("Both products are not added to the cart");
        } else {
            System.out.println("Additional product");
        }
    }
    public void setCheckOut() throws InterruptedException {
        clickOnElement(CHECK_OUT);
        getClickableElement(CHECK_OUT_MODAL);
        Thread.sleep(2);
        clickOnElement(CHECK_OUT_MODAL);
        Thread.sleep(5);
        clickOnElement(CHECK_REGISTER);
    }


}
