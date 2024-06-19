package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(
		features = "featurefiles/AddUser.feature",
		glue= {"stepdefinitions","hooks"},
		dryRun = false,
		plugin="html:target/report.html"
		)
public class RunnerClass extends AbstractTestNGCucumberTests{
}