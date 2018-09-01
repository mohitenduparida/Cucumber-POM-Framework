package stepDefinitions;

import googlePageObjects.GooglePage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;


public class stepDefs {

	WebDriver driver;
	public String title;
	public static Properties config = null;
		
	
	@After
	public void afterStep()
	{
		driver.quit();
	}
	
	
	
	@Given("^User launches browser and opens Google$")
	public void user_launches_browser_and_opens_Google() throws Throwable {
	 	driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to("https://www.google.com");
				
	}

	
	@Then("^User is in Google Home page$")
	public void user_is_in_Google_Home_page() throws Throwable {
	 
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		title = driver.getTitle();
		System.out.println("Google page title:" +title);
		Assert.assertEquals("Google", title);
	    
	}

	
	@Then("^Enters the search text \"([^\"]*)\"$")
	public void enters_the_search_text(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		{
			GooglePage homepage = new GooglePage(driver);
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			homepage.searchtext.sendKeys(arg1);
		}
	   
	}

	
	@And("^User clicks on search button$")
	public void user_clicks_on_search_button() throws Throwable {
	 
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		GooglePage homepage = new GooglePage(driver);
		homepage.searchbutton.click();
	    
	}

	@Then("^User clicks on third link in search results for \"([^\"]*)\"$")
	public void user_clicks_on_third_link_in_search_results_for(String arg2) throws Throwable {
	    
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		GooglePage homepage = new GooglePage(driver);
		homepage.clkLink.click();
	}
	
	@And("^User is on the \"([^\"]*)\" page $")
	public void user_is_on_the_page() throws Throwable{
		
		String stext = driver.getTitle();
		if(stext.equals("Dog - " +"Google Search")){
			System.out.println("User is in dog page");
			
		}else if (stext.equals("Cat - " +"Google Search")){
			System.out.println("User is in cat page");
		}
		else {
			System.out.println("User is in Elephant page");
		}
			
		
	}

	
	}


