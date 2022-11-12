package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AllLocators {
	
	public static By username= By.xpath("//input[@id='userid']");
	
	public static By password= By.xpath("//input[@type='password']");
	
	public static By submit= By.xpath("//button[@type='submit']");
	
	public static By pin= By.xpath("//input[@type='text']");
	
	public static By nifty= By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[1]/span[1]");
	
	public static By UIelement(String UIelement) {
	return By.xpath("//a[@href=\'/"+UIelement+"\']");	
	}

	public static By toastMessage= By.xpath("//div[@class='message']");
	
	public static By watchlist= By.tagName("li");
	
	public static By allStocks=By.xpath("//span[@class='nice-name']");

	
	
	
	
}
