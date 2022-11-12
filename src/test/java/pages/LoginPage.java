package pages;

import org.jboss.aerogear.security.otp.Totp;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import commonfunctions.Base;
//import io.github.bonigarcia.wdm.WebDriverManager;
import locators.AllLocators;

public class LoginPage {
	WebDriver driver;
	Base base;
	
	public LoginPage(Base base) {
		this.base= base;
	}
	public void enterUsername(String username) {		
		base.getDriver().navigate().to("https://kite.zerodha.com");
		base.getDriver().findElement(AllLocators.username).sendKeys(username);	
	}
	public void enterPassword(String password) {
		base.getDriver().findElement(AllLocators.password).sendKeys(password);
	}

	public void clickLogin() {
		base.getDriver().findElement(AllLocators.submit).click();
	}
	public void enterTOTP(String otpKeyStr) {
		 // <- this 2FA secret key.
		Totp totp = new Totp(otpKeyStr);
		String twoFactorCode = totp.now();
		System.out.println(twoFactorCode);
		base.waitForElement(AllLocators.pin);
				base.getDriver().findElement(AllLocators.pin).sendKeys(twoFactorCode);
	}
	public void clickSubmit() {
		base.getDriver().findElement(AllLocators.submit).click();
	}
}

