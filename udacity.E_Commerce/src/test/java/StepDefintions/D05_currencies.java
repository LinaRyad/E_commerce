package StepDefintions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.support.ui.Select;
import pages.L01_homepage;

public class D05_currencies {

    L01_homepage homepage= new L01_homepage();

    @And("5_user click on currency select list")
    public void selectCurrency() {
       Select selectCurrencyEuro= new Select(homepage.currenciesLocator());
       selectCurrencyEuro.selectByVisibleText("Euro");
    }




}
