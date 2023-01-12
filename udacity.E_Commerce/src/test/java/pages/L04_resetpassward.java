package pages;

import StepDefintions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class L04_resetpassward {

    WebDriver driver;

    public L04_resetpassward() {
        this.driver = Hooks.driver;
    }



    public WebElement YourEmailAddress() {
        return driver.findElement(By.id("Email"));
    }

    public WebElement recoverButton() {
        return driver.findElement(By.xpath("//button[@name=\"send-email\"]"));
    }

    public String getConfirmationMessage() {
        return driver.findElement(By.xpath("//p[@class=\"content\"]")).getText();
    }


}
