package StepDefintions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import pages.L01_homepage;
import pages.L03_login;
import org.testng.asserts.SoftAssert;

public class D02_StepDevs_login {

    L01_homepage homepage =new L01_homepage();
    L03_login login =new L03_login();


    @Given("1_user go to login page")
    public void homepage(){
        homepage.login().click();
    }

    @And("2_user enter valid email \"tester@example.com\"")
    public void email(){
        login.Email().sendKeys("tester@example.com");
    }

    @And("3_user enter valid password \"P@ssw0rd\"")
    public void password(){
        login.Password().sendKeys("P@ssw0rd");
    }

    @When("4_user click on login button")
    public void loginButton(){
        login.loginButton().click();
    }

    @Then("5_user login successfully")
    public void loginsuccessfuly(){

        SoftAssert softAssert=new SoftAssert();
        softAssert.assertTrue(homepage.logout().getText().contains("Log out"));
        softAssert.assertAll();

    }



}
