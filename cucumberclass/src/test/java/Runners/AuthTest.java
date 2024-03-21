package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src\\test\\resources\\Features\\Login.feature"
,glue = "StepDefinitions"
,monochrome = true
,dryRun = false
,plugin = {"pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)


public class AuthTest extends AbstractTestNGCucumberTests {

}	
	
