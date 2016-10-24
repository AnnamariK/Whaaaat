package testPackage;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class JUniferVPNPage {
	
	WebDriver browser;
	String title = "Junifer Systems – Contact Us";


		public JUniferVPNPage(WebDriver browser) {
			Assert.assertEquals(title, browser.getTitle());
			this.browser = browser;
			PageFactory.initElements(browser,this);
	}

}
