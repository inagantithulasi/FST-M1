package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(      
		features ="Src/test/java/Features",
		glue = {"StepDefinations"},
		tags = "@activity2",
		publish =true,
		plugin = {
				"pretty",
				"html:src/reports/html_report.html",
				"json:src/reports/json_report.json",
				"junit:src/reports/xml_report.xml",
		}
		
		)

 public class TestRunner {
	//Empty
}
