package StepDefintions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.L01_homepage;

public class D09_addToShoppingCart {
    L01_homepage homepage=new L01_homepage();

    @When("5_user click on add to cart button of HTCMobile")
    public void addToCartHTCMobile() {
        homepage.htcMobileAddToCartButton().click();
    }

    @Then("6_verification message of shoppingCart appears")
    public void verificationMsg() {
        Assert.assertEquals(homepage.verificationMsgCartList().getText(),"The product has been added to your shopping cart");
    }
}
