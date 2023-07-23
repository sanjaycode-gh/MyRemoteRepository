package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import objectRepository.LinkedInObjects;

public class LinkedinLogin {
	WebDriver driver;
	LinkedInObjects element;
	public LinkedinLogin(CommonSteps common_steps) {
		common_steps.setProperty();
		this.driver = common_steps.getDriver();
		this.element = new LinkedInObjects(this.driver);
		
	}
	
	
	@Given("User is on Linkedin URL {string}")
	public void user_is_on_linkedin_url(String url) throws Exception {
	        	    
	    driver.get(url);
	    Thread.sleep(2000);
	}

	@When("User enters username {string}")
	public void user_enters_username(String mail) throws InterruptedException {
		
		element.username().sendKeys(mail);	
		 Thread.sleep(1000);
		
	}

	@When("User enters password {string}")
	public void user_enters_password(String password) throws InterruptedException {
	    element.password().sendKeys(password);
	    Thread.sleep(1000);
	}

	@When("User logs in")
	public void user_logs_in() throws InterruptedException {
	    element.signin().click();
	    Thread.sleep(1000);
	}

	@Then("User should be on the linkedin home page")
	public void user_should_be_on_the_linkedin_home_page() throws InterruptedException {
		String loggedInUsername = element.loogedUserName().getText();
		 Thread.sleep(1000);
		 System.out.println(loggedInUsername);
	   Assert.assertTrue(loggedInUsername.equalsIgnoreCase("SanjayY Yerrolla")); 
	}
}
