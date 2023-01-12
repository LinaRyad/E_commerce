package StepDefintions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import pages.L01_homepage;

import java.util.List;
import java.util.Random;

public class D06_selectDifferentCategories {
    L01_homepage homepage = new L01_homepage();
    List<WebElement> mainCategories = homepage.main_Categories(Hooks.driver);
    Random random = new Random();
    int selectedMainCat = random.nextInt(7);
    boolean isSub;
    String maincatTitle;
    String subcatTitle;

    @When("select one of the three main categories to hover randomly")
    public void hover_on_main_category() {
        Actions action = new Actions(Hooks.driver);
        action.moveToElement(mainCategories.get(selectedMainCat)).perform();
        maincatTitle = mainCategories.get(selectedMainCat).getText();
    }

    @And("select one of the three subcategories to hover randomly")
    public void hover_on_sub_category() {

        List<WebElement> subCategories = homepage.sub_Categories(Hooks.driver, (selectedMainCat + 1));

        if (!subCategories.isEmpty()) {
            isSub = true;
            Random random1 = new Random();
            int selectedSubCat = random1.nextInt(3);
            subcatTitle = subCategories.get(selectedSubCat).getText();
            subCategories.get(selectedSubCat).click();
        } else {
            isSub = false;
            mainCategories.get(selectedMainCat).click();
        }
    }

    @Then("the page title should be the same as the selected one")
    public void check_Page()
    {
        String pageTitle = homepage.page_Title(Hooks.driver).getText();

        if (!isSub)
        {
            System.out.println("It is Main Category: ");
            System.out.println("page title is: " + pageTitle);
            System.out.println("mainCategory is: " + maincatTitle);
            Assert.assertEquals(pageTitle , maincatTitle);
        }
        else
        {
            System.out.println("It is Sub Category of: "+ maincatTitle);
            System.out.println("page title is: " + pageTitle);
            System.out.println("subCategory is: " + subcatTitle);
            Assert.assertEquals(pageTitle, subcatTitle);
        }
    }
}
