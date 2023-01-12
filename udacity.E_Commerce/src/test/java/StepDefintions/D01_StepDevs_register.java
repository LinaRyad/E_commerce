package StepDefintions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.L02_register;
import pages.L01_homepage;
import org.openqa.selenium.support.ui.Select;

public class D01_StepDevs_register {

    L01_homepage homepage= new L01_homepage();
    L02_register register=new L02_register();

    @Given("1_go to register page")
    public void register() {
        homepage.register().click();
    }

    @And("2_user select gender type")
    public void gender(){
    register.GenderFemale().click();
    }

    @And("3_user enter firstname \"tester\" and lastname \"automation\"")
    public void name(){
        register.Firstname().sendKeys("tester");
        register.Lastname().sendKeys("automation");
    }


    @And("4_user enter day of birth")
    public void DateOfBirthDay(){
        Select selectDay=new Select(register.DateOfBirthDay());
        selectDay.selectByValue("6");
    }
    @And("4_user enter month of birth")
    public void DateOfBirthMonth(){
        Select selectMonth=new Select(register.DateOfBirthMonth());
        selectMonth.selectByValue("5");
    }
    @And("4_user enter year of birth")
    public void DateOfBirthYear(){
        Select selectYear=new Select(register.DateOfBirthYear());
        selectYear.selectByValue("1999");
    }


    @And("5_user enter Gmail \"tester@example.com\"")
    public void Email(){
        register.Email().sendKeys("tester@example.com");
    }

    @And("6_user enter password \"P@ssw0rd\"")
    public void password(){
        register.password().sendKeys("P@ssw0rd");
    }

    @And("7_user confirm password \"P@ssw0rd\"")
    public void ConfirmPassword(){
        register.ConfirmPassword().sendKeys("P@ssw0rd");
    }

    @When("8_user click on register button")
    public void RegisterButton(){
        register.RegisterButton().click();
    }

    @Then("9_confirmation massage appears")
    public void Confirmationmessage(){
        register.Confirmationmessage().isDisplayed();
    }
}
