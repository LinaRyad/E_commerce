package StepDefintions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.L01_homepage;

public class D04_search {
    L01_homepage homepage=new L01_homepage();
    String itemName="Flower Girl Bracelet";

    @And("5_user enter productName \"Flower Girl Bracelet\"")
    public void userEnterProductName() {
        homepage.searchingbox().sendKeys(itemName);
    }

    @And("6_use click on searching button")
    public void clickOnSearchingButton() {
        homepage.searchingbutton().click();
    }

    @Then("7_user find items with productName")
    public void validateSearch() {
        Assert.assertEquals(homepage.flowerItemLocator().getText(),itemName);
    }



}
