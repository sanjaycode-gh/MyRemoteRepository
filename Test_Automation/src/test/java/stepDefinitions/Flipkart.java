package stepDefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import objectRepository.FlipkartObjects;

public class Flipkart {
	WebDriver driver;
	
	public Flipkart() {
		CommonSteps cs = new CommonSteps();
		cs.setProperty();
		driver = cs.getDriver();
		FlipkartObjects element = new FlipkartObjects(driver);
	}
	
	@Given("User Navigates to Fipkart URL {string}")
	public void user_navigates_to_fipkart_url(String flipkartUrl) {
	    driver.get(flipkartUrl);
	}

	@When("User search for {string}")
	public void user_search_for(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User clicks on Samsung Z fold	\"Phantom Black {int} GB\"")
	public void user_clicks_on_samsung_z_fold_phantom_black_gb(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("User validate the specifications and price")
	public void user_validate_the_specifications_and_price() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

}
