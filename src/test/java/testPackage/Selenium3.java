package testPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class Selenium3 {
	
	WebDriver browser;
	String URL="https://www.junifersystems.com/";
	
	JuniferMainPage junifer;
	JUniferVPNPage VPN;

		@Before
		public void openBrowser(){
			System.setProperty("webdriver.gecko.driver","C:\\Users\\Annamaria\\Downloads\\geckodriver-v0.11.1-win64\\geckodriver.exe");
			browser = new FirefoxDriver();
		}

		@Given("^Junifer page open$")
		public void junifer_page_open() throws Throwable {	
			browser.get(URL);
		 
		}

		@When("^Click on Secure VPN link$")
		public void click_on_Secure_VPN_link() throws Throwable {
			junifer = new JuniferMainPage(browser);
			VPN = junifer.clickVPN();
		    
		}
		
		@After
		public void closeBrowser() {
			browser.quit();
		}
		

		

}
