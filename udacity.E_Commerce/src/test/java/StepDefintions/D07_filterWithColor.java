package StepDefintions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import pages.L01_homepage;

import java.lang.annotation.Target;

public class D07_filterWithColor {

    L01_homepage homepage= new L01_homepage();
    WebDriver driver;


    @When("5_user hover on apparel")
    public void filterByColor() {
        Actions actions= new Actions(Hooks.driver);
        actions.moveToElement(homepage.apparel()).perform();
    }

    @When("6_user click shoes")
    public void shoesSubCategory() {
        homepage.apparelShoes().click();
    }
    @Then("7_user click on red color")
    public void redColor() {
        homepage.redCheckBox().click();
    }
}
