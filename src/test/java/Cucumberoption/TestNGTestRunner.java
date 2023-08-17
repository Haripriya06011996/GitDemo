package Cucumberoption;


import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.junit.runner.RunWith;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features = "src/test/resources/features",
        glue = "Stepdefinitions"
)

public class TestNGTestRunner extends AbstractTestNGCucumberTests {


}
