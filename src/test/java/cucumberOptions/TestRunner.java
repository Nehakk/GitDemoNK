package cucumberOptions;
//Feature
//StepDefinations



import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)

@CucumberOptions(features="src/test/java/features",
glue="stepDefinitions",monochrome=true,
plugin={"pretty", "html:target/cucumber-htmlreport.html","json:target/cucumber.json"})

public class TestRunner {
 
	
}
//junit Test Runner / TestNG Test Runner