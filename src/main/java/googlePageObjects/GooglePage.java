package googlePageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GooglePage {

	
	
	public WebDriver driver;
	
	@FindBy(css="input[type='text']")
	public WebElement searchtext;
	
	
	@FindBy(css=".FPdoLc.VlcLAe>center>input:nth-child(1)")
	public WebElement searchbutton;

	@FindBy(css="#rso > div:nth-child(4) > div > div:nth-child(2) > div > div > h3 > a") 
	public WebElement clkLink;
		
	
	public GooglePage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	public void searchGoogleText(String arg2) throws InterruptedException{
		
		System.out.print("Animal is " + arg2);
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		searchtext.sendKeys(arg2);
	}
	
	
	public String validateGoogleHomePage(){
		return driver.getTitle();
	}

	
	public void clickSearchBtn(){
		searchbutton.click();
	}
	

	
	
}
