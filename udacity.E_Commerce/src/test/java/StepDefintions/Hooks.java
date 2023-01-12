package StepDefintions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class Hooks {
    //define before and after annotation for your driver (open browser and close it) (cucmber)
   public static WebDriver driver ;

    @Before
    public void OpenBrowser(){

        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(9, TimeUnit.SECONDS);

        driver.navigate().to("https://demo.nopcommerce.com/");
    }

    @After
    public void close_browser(){
        driver.quit();
    }


}
