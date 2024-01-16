package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "D:\\2023\\selenium\\Sel@8AM(EST)\\workspace\\CucumberWithMaven\\src\\main\\java\\features"
		,glue={"stepDefinitions"}
		,dryRun=false
		,plugin = {"pretty","json:target/myReports/report.json",
				"junit:target/myReports/report.xml"}
		)


public class TestRunner {

}
