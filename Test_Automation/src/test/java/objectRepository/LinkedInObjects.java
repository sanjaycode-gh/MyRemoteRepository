package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LinkedInObjects {
	protected WebDriver driver;
	
	public LinkedInObjects(WebDriver driver)
	{
		this.driver=driver;
	}
	
		By username = By.xpath("//input[@id='session_key']");
		By password = By.xpath("//input[@id='session_password']");
		By signin = By.xpath("//button[@data-id='sign-in-form__submit-btn']");
		By loggedUserName = By.xpath("//a[contains(@id,'ember')]/child::div[2]");
	
	public WebElement username()
	{
		return driver.findElement(username);
	}
	public WebElement password()
	{
		return driver.findElement(password);
	}
	public WebElement signin()
	{
		return driver.findElement(signin);
	}
	public WebElement loogedUserName()
	{
		return driver.findElement(loggedUserName);
	}
	
	

}
