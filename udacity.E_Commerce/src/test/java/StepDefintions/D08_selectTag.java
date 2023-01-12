package StepDefintions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.L01_homepage;

public class D08_selectTag {

    L01_homepage homepage= new L01_homepage();

    @When("5_user click on any category")
    public void apparel() {
        homepage.apparel().click();
    }

    @When("6_user click on any Tag")
    public void tagLocator() {
        homepage.coolTagLocator().click();
    }

    @Then("7_verify that tag window will open")
    public void tagWindow() {
        homepage.coolTagWindow().isDisplayed();
    }


}
