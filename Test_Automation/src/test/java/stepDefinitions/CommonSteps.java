package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class CommonSteps {
	private WebDriver driver;
	//@Before
	public void setProperty()
	{
		System.setProperty("driver.chrome.driver", "drivers/chromedriver.exe");
		driver = new ChromeDriver();
	}
	public WebDriver getDriver()
	 {
		 return driver;
	 }
	//@After
	public void tearDown()
	{
		driver.quit();
	}

}

