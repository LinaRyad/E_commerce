package StepDefintions;

import io.cucumber.java.bs.A;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.L01_homepage;

public class D11_addToCompareList {
    L01_homepage homepage= new L01_homepage();

    @When("5_user click on compare button")
    public void compareButton() {
    homepage.htcMobileAddToCompareButton().click();
    }

    @Then("6_verification message of compareList appears")
    public void verificationMsg() {
        Assert.assertEquals(homepage.verificationMsgCompareList().getText(),"The product has been added to your product comparison");
    }
}
