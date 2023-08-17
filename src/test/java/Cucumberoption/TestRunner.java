package Cucumberoption;


//
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "Stepdefinitions", stepNotifications = true,
        dryRun = false,
        monochrome = true)

public class
TestRunner {


}
