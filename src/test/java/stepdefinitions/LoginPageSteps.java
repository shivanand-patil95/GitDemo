package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import commonfunctions.Base;
import io.cucumber.java.en.*;
import locators.AllLocators;
import pages.Homepage;
import pages.LoginPage;

public class LoginPageSteps {
	
	
	LoginPage login;
	
	WebDriver driver;
	Base base;
	
	public LoginPageSteps(LoginPage login) {
		this.login= login;
	}
	
	Homepage home;
	
	@Given("^User enters1 (.*)$")
	public void userentersusername(String username1) {
		login.enterUsername("VC6189");
	}

	@When("^User enters2 (.*)$")
	public void user_enters_password(String password) {
		login.enterPassword("Pooja@2127");
	}

	@When("User click on Login")
	public void user_click_on_login() {
	   login.clickLogin();
	}

	@When("^User enters3 (.*)$")
	public void user_enters_totp(String key) throws InterruptedException {	
		login.enterTOTP("EHJX3HVSOF4PRSEWJPCOTSQHVWNG7KXC");
	}

	@And("User click on submit")
	public void user_click_on_submit() {
	login.clickSubmit();;
	}
}
