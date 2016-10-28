package testPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import pagePackage.AddressPage;
import pagePackage.ClearScorePage;
import pagePackage.RegisterPage;
import pagePackage.SignUpPage;

public class ClearScore {
	
	WebDriver browser;
	String URL = "https://www.clearscore.com/";
	
	ClearScorePage clearscore;
	SignUpPage signup;
	RegisterPage register;
	AddressPage addressPage;
	
	
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

	@When("^enters full name \"([^\"]*)\", and enters DOB \"([^\"]*)\", and enters pasword \"([^\"]*)\", and ticks Yes, I agree checkbox, and clicks Create new account button$")
	public void enters_full_name_and_enters_DOB_and_enters_pasword_and_ticks_Yes_I_agree_checkbox_and_clicks_Create_new_account_button(String fullName, String DOB, String password) throws Throwable {
		register.typeFullName (fullName);
		register.typeDOB (DOB);
		register.typePassword (password);
		register.tickCheckBox();
		addressPage = register.clickCreateNewAccountButton();	
	    
	}

	@When("^enters the postcode \"([^\"]*)\", and selects the correct address$")
	public void enters_the_postcode_and_selects_the_correct_address(String postcode) throws Throwable {
		addressPage.typePostCode(postcode);
		addressPage.selectAddress();
	   
	}

//	@Then("^Customer will be redirected to page$")
//	public void customer_will_be_redirected_to_page() throws Throwable {
//	    
//	}
//

}



