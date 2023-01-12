package pages;

import StepDefintions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class L02_register {
WebDriver driver;

    public L02_register() {
        this.driver = Hooks.driver;
    }

    public WebElement GenderFemale() {
        return driver.findElement(By.id("gender-female"));
    }

    public WebElement Firstname() {
        return driver.findElement(By.id("FirstName"));
    }

    public WebElement Lastname() {
        return driver.findElement(By.id("LastName"));
    }


    public WebElement DateOfBirthDay() {
        return driver.findElement(By.name("DateOfBirthDay"));
    }

    public WebElement DateOfBirthMonth() {
        return driver.findElement(By.name("DateOfBirthMonth"));
    }

    public WebElement DateOfBirthYear() {
        return driver.findElement(By.name("DateOfBirthYear"));
    }

    public WebElement Email() {
        return driver.findElement(By.id("Email"));
    }

    public WebElement password() {
        return driver.findElement(By.id("Password"));
    }

    public WebElement ConfirmPassword() {
        return driver.findElement(By.id("ConfirmPassword"));
    }

    public WebElement RegisterButton(){
        return driver.findElement(By.id("register-button"));
    }

    public WebElement Confirmationmessage(){
        return driver.findElement(By.xpath("//div[@class=\"buttons\"]"));
    }

}
