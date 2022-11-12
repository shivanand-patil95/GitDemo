package commonfunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
import locators.AllLocators;

public class Base {
	
	public WebDriver driver;
	
	public WebDriver getDriver() {
		
		return driver;
	}
	public WebDriver setDriver() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver(options);
		return driver;
	}
	public void waitForElement(By element) {
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(element));
	}

}
