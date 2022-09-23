package testrunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"C:\\Users\\admin\\OneDrive\\Desktop\\LatestCucumber6WithPOM-master\\src\\test\\resources\\parallel"},
		glue = {"stepdefinitions", "AppHooks"},
		monochrome = true,
		plugin = {"pretty",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"timeline:test-output-thread/"
		},
		
		tags = ""
		)

public class MyTestRunner {
//	src/test/resources/AppFeatures
}
