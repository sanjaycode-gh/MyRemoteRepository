package stepDefinitions;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import objectRepository.FlipkartObjects;

public class Flipkart {
	WebDriver driver;
	FlipkartObjects element;
	WebDriverWait wait;
	
	
	public Flipkart() {
		CommonSteps cs = new CommonSteps();
		cs.setProperty();
		driver = cs.getDriver();
		element = new FlipkartObjects(driver);
		wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.manage().window().maximize();
	}
	
	
	@Given("User Navigates to Fipkart URL {string}")
	public void user_navigates_to_fipkart_url(String flipkartUrl) throws Exception {
	    driver.get(flipkartUrl);
	    Thread.sleep(1000);
	}

	@When("User search for {string}")
	public void user_search_for(String mobileName) {
		element.welcomeScreen().click();
		wait.until(ExpectedConditions.elementToBeClickable(element.searchBar()));
	    element.searchBar().click();
	    wait.until(ExpectedConditions.elementToBeClickable(element.searchBar()));
		element.searchBar().sendKeys(mobileName);
	    wait.until(ExpectedConditions.elementToBeClickable(element.submit()));
	    element.submit().click();
	}

	@When("User clicks on {string}")
	public void user_clicks_on_samsung_z_fold_phantom_black_gb(String product_size) {
		
//		wait.until(ExpectedConditions.visibilityOfAllElements(element.searchResults()));
//	    List<WebElement> li = element.searchResults();
//	    int webelementSize = li.size();
//	    System.out.println("Number of webelements found:"+webelementSize);
//	    for (int i=0; i<li.size();i++)
//	    {
//	    	System.out.println(li.get(i).getText());
//	    	if(product_size.contains(li.get(i).getText()))
//	    	{
//	    		li.get(i).click();
//	    	}
//	    }
//		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//a[@class='_1fQZEK']"))));
	    
//	    boolean st = driver.findElement(By.xpath("//a[@class='_1fQZEK']")).isEnabled();
//	    driver.switchTo().activeElement();
//	    System.out.println(st);
//	    if(st=true)
//	    driver.findElement(By.xpath("//a[@class='_1fQZEK']")).click();
		
//		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
//		String javaScript = "document.getElementsByClassName('_4rR01T')";
//		List<WebElement> jsElement = (List<WebElement>) jsExecutor.executeScript(javaScript);
//		System.out.println(jsElement.size());
//		for(int i=0; i<jsElement.size();i= i+jsElement.size())
//	    {
//	    	System.out.println(jsElement.get(i).getText());
//	    	jsElement.get(i).click();
//	    }
//		
		try
		{
			wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//a[@class='_1fQZEK']")));
			
			System.out.println("element found");
			
			List<WebElement> li = element.searchResults();
		    int webelementSize = li.size();
		    System.out.println("Number of webelements found:"+webelementSize);
		    for (int i=0; i<li.size();i++)
		    {
		    	if(product_size.contains(li.get(i).getText()))
		    	{
		    		li.get(i).click();
		    		String mainWindow = driver.getWindowHandle();
		    		Set<String> browserTabs = driver.getWindowHandles();
		    		Iterator<String> it = browserTabs.iterator();
		    		while(it.hasNext())
		    		{
		    			String childWindow = it.next();
		    			if(!mainWindow.equalsIgnoreCase(childWindow))
		    			{
		    				driver.switchTo().window(childWindow);
		    			}
		    		}
		    		break;
		    	}
		    }
		}
		catch(NoSuchElementException e)
		{
			System.out.println("No element found");
		}
	}

	@Then("User validate the specifications and price")
	public void user_validate_the_specifications_and_price() {
		
	   String mobilePrice = element.mobilePrice().getText();
	   System.out.println(mobilePrice);
	   element.specificationsReadMore().click();
	   wait.until(ExpectedConditions.visibilityOf(element.specifications()));
	   String specifications = element.specifications().getText();
	   System.out.println(specifications);
	}

}
