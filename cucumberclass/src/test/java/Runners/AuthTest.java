package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src\\test\\resources\\Features\\Login.feature"
,glue = "StepDefinitions"
,monochrome = true
,dryRun = false
,plugin = {"pretty","usage:target\\UsageReport","html:target\\HtmlReport.html","json:target\\JSONReport.json"}
)


public class AuthTest extends AbstractTestNGCucumberTests {

}	
	
