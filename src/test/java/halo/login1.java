package halo;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class login1 {
	WebDriver driver;
	@Given("^user is in the login page$")
	public void user_is_in_the_login_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		WebDriverManager.chromedriver().setup();
	
		
	    
	}

	@Given("^go to the url \"([^\"]*)\"$")
	public void go_to_the_url(String arg1) throws Throwable {
		driver = new ChromeDriver();
		driver.get(arg1);
	}

	@Given("^user enters \"([^\"]*)\" and \"([^\\\"]*)\"$")
	public void user_enters_and_password(String arg1,String arg2) throws Throwable {
	    driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys(arg1);
	    driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys(arg2);
	    
	}
	//txtPassword

	@When("^the user clicks submit button$")
	public void the_user_clicks_submit_button() throws Throwable {
	    driver.findElement(By.id("btnLogin")).click();
	    
	}

	@Then("^the user shoulb be able to enter$")
	public void the_user_shoulb_be_able_to_enter() throws Throwable {
		boolean b = false;
	    // Write code here that turns the phrase above into concrete actions
	  String urlori= driver.getCurrentUrl();
	   String url = "https://opensource-demo.orangehrmlive.com/index.php/dashboard";
	   if(urlori.equals(url))
	   {
		    b = true;
	   }
	   Assert.assertTrue(b);
	}



}
