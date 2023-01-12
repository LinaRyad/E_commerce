package pages;

import StepDefintions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class L03_login {
    WebDriver driver;

    public L03_login() {

        this.driver = Hooks.driver;
    }

    public WebElement Email(){
        return driver.findElement(By.id("Email"));
    }

    public WebElement Password(){
        return driver.findElement(By.id("Password"));
    }

    public WebElement loginButton(){
        return driver.findElement(By.className("login-button"));
    }

    public WebElement forgetPassword() {
        return driver.findElement(By.xpath("//a[@href=\"/passwordrecovery\"]"));
    }

}
