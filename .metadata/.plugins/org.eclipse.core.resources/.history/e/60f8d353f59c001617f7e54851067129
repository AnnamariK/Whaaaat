package testPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import pagePackage.ClearScorePage;
import pagePackage.RegisterPage;
import pagePackage.SignUpPage;

public class ClearScore {
	
	WebDriver browser;
	String URL = "https://www.clearscore.com/";
	
	ClearScorePage clearscore;
	SignUpPage signup;
	RegisterPage register;
	
	
	@Before
	public void openBrowser(){
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Annamaria\\Downloads\\geckodriver-v0.11.1-win64\\geckodriver.exe");
		browser = new FirefoxDriver();
	
	}
	
	@Given("^ClearScore page open$")
     public void account_Register_page_open() throws Throwable {
		browser.get(URL);
	}
	

	@When("^Customer clicks on the Sign Up button$")
	public void customer_clicks_on_the_Sign_Up_button() throws Throwable {
		clearscore = new ClearScorePage(browser);
		signup = clearscore.clickSignUp();	   
	}

	@When("^enters a valid email address \"([^\"]*)\" and clicks on Continue button$")
	public void enters_a_valid_email_address_and_clicks_on_Continue_button(String email) throws Throwable {
		signup.typeEmail(email);
		register = signup.clickContinue();   
	
	}

//	@When("^Customer enters the full name \"([^\"]*)\"$")
//	public void customer_enters_the_full_name(String arg1) throws Throwable {
//	    
//	}
//
//	@When("^Enters the date of birth \"([^\"]*)\"$")
//	public void enters_the_date_of_birth(String arg1) throws Throwable {
//	  
//	}
//
//	@When("^Enters the password \"([^\"]*)\"$")
//	public void enters_the_password(String arg1) throws Throwable {
//	   
//	}
//
//	@When("^Ticks the Yes, I agree radio button and click on Create new account button$")
//	public void ticks_the_Yes_I_agree_radio_button_and_click_on_Create_new_account_button() throws Throwable {
//	    
//	}
//
//	@Then("^Customer will be redirected to page$")
//	public void customer_will_be_redirected_to_page() throws Throwable {
//	    
//	}
//

}



