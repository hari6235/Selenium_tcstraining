package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src\\test\\resources\\Features\\Login.feature"
,glue = "StepDefinitions"
)


public class AuthTest extends AbstractTestNGCucumberTests {

}	
	
