package pages;

import StepDefintions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class L01_homepage {

    WebDriver driver;

    public L01_homepage() {
        this.driver = Hooks.driver;
    }

    public WebElement register() {
        return driver.findElement(By.className("ico-register"));
    }

    public WebElement login() {
        return driver.findElement(By.className("ico-login"));
    }
    public WebElement logout() {
        return driver.findElement(By.xpath("//a[@class=\"ico-logout\"]"));
    }

    public WebElement searchingbox() {
        return driver.findElement(By.id("small-searchterms"));
    }

    public WebElement searchingbutton() {
        return driver.findElement(By.xpath("//form[@id=\"small-search-box-form\"]/button[@type=\"submit\"]"));
    }

    public WebElement flowerItemLocator() {
        return driver.findElement(By.xpath("//h2/a[@href=\"/flower-girl-bracelet\"]"));
    }

    public WebElement currenciesLocator() {
        return driver.findElement(By.id("customerCurrency"));
    }

    public List<WebElement> main_Categories (WebDriver driver)
    {
        List<WebElement> main_categories = driver.findElements(By.xpath("//ul[@class=\"top-menu notmobile\"]/li"));
        return main_categories;
    }

    public WebElement page_Title (WebDriver driver)
    {
        WebElement page_title = driver.findElement(By.className("page-title"));
        return page_title;
    }

    public List<WebElement> sub_Categories (WebDriver driver ,int selectedMainCat)
    {
        List<WebElement> sub_categories = driver.findElements(By.xpath("(//ul[@class='top-menu notmobile']//ul)["+selectedMainCat+"]/li"));
        return sub_categories;
    }
    public WebElement shoppingCartLocator() {
        return driver.findElement(By.xpath("//a/span[@class=\"cart-label\"]"));
    }

    public WebElement apparel() {
        return driver.findElement(By.xpath("//ul[@class=\"top-menu notmobile\"]/li/a[@href=\"/apparel\"]"));
    }

    public WebElement apparelShoes() {
        return driver.findElement(By.xpath("//ul[@class=\"top-menu notmobile\"]/li/ul/li/a[@href=\"/shoes\"]"));
    }

    public WebElement redCheckBox() {
        return driver.findElement(By.id("attribute-option-15"));
    }

    public WebElement coolTagLocator() {
        return driver.findElement(By.xpath("//a[@href=\"/cool\"]"));
    }

    public WebElement coolTagWindow() {
        return driver.findElement(By.xpath("//div[@class=\"page-title\"]"));
    }

     public WebElement htcMobileAddToCartButton() {
        return driver.findElement(By.xpath("//div[@data-productid=\"18\"]//button[@class=\"button-2 product-box-add-to-cart-button\"]"));
    }

    public WebElement verificationMsgCartList() {
        return driver.findElement(By.xpath("//p[@class=\"content\"]"));
    }


    public WebElement htcMobileAddToWishListButton() {
        return driver.findElement(By.xpath("//div[@data-productid=\"18\"]//button[@class=\"button-2 add-to-wishlist-button\"]"));
    }

    public WebElement verificationMsgWishList() {
        return driver.findElement(By.xpath("//p[@class=\"content\"]"));
    }

    public WebElement htcMobileAddToCompareButton() {
        return driver.findElement(By.xpath("//div[@data-productid=\"18\"]//button[@class=\"button-2 add-to-compare-list-button\"]"));
    }

    public WebElement verificationMsgCompareList() {
        return driver.findElement(By.xpath("//p[@class=\"content\"]"));
    }



}
