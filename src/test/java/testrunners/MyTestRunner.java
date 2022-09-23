package testrunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"C:/Users/admin/OneDrive/Desktop/Selenium/Selenium/Workspace - Copy/Git/BDD/src/test/resources/parallel"},
		glue = {"parallel", "AppHooks"},
		dryRun = false,
		monochrome = true,
		plugin = {"pretty",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"timeline:test-output-thread/"
		}, 
		tags = "@Login"
		
		)

public class MyTestRunner {
//	src/test/resources/AppFeatures
}
