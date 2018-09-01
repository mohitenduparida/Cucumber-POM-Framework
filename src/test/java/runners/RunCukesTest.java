package runners;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.CucumberOptions;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		plugin = { "pretty", "json:target/json/chrome/cucumber.json", "html:target/html/chrome" }, 
		features = "src/test/resources/Features/", 
		glue = "stepDefinitions",
		tags = {"@tag1"}
		)


public class RunCukesTest extends AbstractTestNGCucumberTests {
	
}
