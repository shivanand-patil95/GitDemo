package stepdefinitions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import commonfunctions.Base;
import io.cucumber.java.en.*;
import locators.AllLocators;
import pages.Homepage;
import pages.LoginPage;

public class HomepageSteps {
	WebDriver driver;
	Base base;
	Homepage home;
	public HomepageSteps(Homepage home) {
		this.home= home;
	}
	
	LoginPage login;
	@Given("Verify UIElements are present")
	public void verify_UIElements_are_present() throws InterruptedException {
		Thread.sleep(3000);
		home.dashboard("dashboard");
	    home.dashboard("holdings");
	    home.dashboard("positions");
	    home.dashboard("orders");
	    home.dashboard("funds");
	    home.dashboard("apps");
	}
	@Given("Buy a share from watchlist")
	public void buy_a_share_from_watchlist() throws InterruptedException {
//		String allStocks1="//*[@id='app']/div[2]/div[1]/div/div[2]/div[2]/div[";
//		String allStocks2="]/div/div/span[1]/span/span";
////		
		Thread.sleep(5000);
//		List list= new ArrayList();
//		List watchlist =driver.findElements(AllLocators.watchlist);
//		List stocks= base.getDriver().findElements(AllLocators.allStocks);
//	
//		System.out.println(watchlist);
//		System.out.println(stocks);
//		
		home.buyStock();
	}

	@When("Get text from Toast Message")
	public void get_text_from_Toast_Message() {
	    
	}

}
