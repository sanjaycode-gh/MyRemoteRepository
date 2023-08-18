package objectRepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FlipkartObjects 
{
	protected WebDriver driver;
	public FlipkartObjects(WebDriver driver)
	{
		this.driver = driver;
	}
	
	By welcomeScreen = By.xpath("//button[@class='_2KpZ6l _2doB4z']");
//	By searchBar = By.xpath("//form[@action='/search']");
	By searchBar = By.xpath("//input[@class='_3704LK']");
	By submit = By.xpath("//button[@type='submit']");
	By searchResults = By.xpath("//div[@class='_4rR01T']");
//	By searchResults = By.xpath("//div[contains(text(),'SAMSUNG Galaxy Z Fold4 5G ')]");
//	By searchResults = By.xpath("div[@class='_3pLy-c row']/descendant::div[2]");
//	By searchResults = By.xpath("//div[@class='col col-7-12']");
//	By searchResults = By.xpath("//a[@class='_1fQZEK']");
	By samsungFoldPrice = By.xpath("//div[@class='_30jeq3 _16Jk6d']");
	By specificationsReadMore = By.xpath("//div[@class='_3dtsli']/descendant::button");
	By specifications = By.xpath("//div[@class='_3dtsli']");
	By mobilePrice = By.xpath("(//div[@class='_25b18c'])[1]/child::div[1]");
	
	
	public WebElement welcomeScreen()
	{
		return driver.findElement(welcomeScreen);
	}
	public WebElement searchBar()
	{
		return driver.findElement(searchBar);
	}
	public WebElement submit()
	{
		return driver.findElement(submit);
	}
	public List<WebElement> searchResults()
	{
		return driver.findElements(searchResults);
	}
	public WebElement samsungFoldPrice()
	{
		return driver.findElement(samsungFoldPrice);
	} 
	public WebElement specificationsReadMore()
	{
		return driver.findElement(specificationsReadMore);
	}
	public WebElement specifications()
	{
		return driver.findElement(specifications);
	}
	public WebElement mobilePrice()
	{
		return driver.findElement(mobilePrice);
	}
	
}
