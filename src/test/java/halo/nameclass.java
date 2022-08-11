package halo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class nameclass {
	WebDriver webdriver;
	@Given("^if the driver is not opned$")
	public void if_the_driver_is_not_opned() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		  WebDriverManager.chromedriver().setup();
	         webdriver= new ChromeDriver();
	
	}

	@When("^I click submit button$")
	public void i_click_submit_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@When("^enter username as'priya' and password as 'cksnc'$")
	public void enter_username_as_priya_and_password_as_cksnc() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   webdriver.get("https://google.com");
	}

	@Then("^I should enter the url$")
	public void i_should_enter_the_url() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    webdriver.close();
	    
	}



}
