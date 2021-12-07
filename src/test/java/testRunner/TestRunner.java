package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(

		features = { "/Users/yemioluv/eclipse-workspace/HCA/src/test/resources/features/HarleyStreetClinic.feature" },
		//features = {"/Users/yemioluv/eclipse-workspace/HCA/src/test/resources/features/Facilities.feature" },

		glue = { "stepDefinitions", "appHooks" }, dryRun = false, tags = "not @skip", // if you want to skip a scenario

		plugin = { "pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"timeline:test-output-thread/", "rerun:target/rerun.txt" }, monochrome = true
				
				

)

public class TestRunner {

}
