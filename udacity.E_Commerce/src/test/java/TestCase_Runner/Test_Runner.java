package TestCase_Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.junit.runner.RunWith;

//@RunWith(cucumber.class)
@CucumberOptions (
        features = "src/main/resources/features-stories",
        glue = {"StepDefintions"},
        tags = "@Smoke"

)
public class Test_Runner extends AbstractTestNGCucumberTests
{

}
