package pagePackage;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClearScorePage {

	
		
		private WebDriver browser;
		String title = "Free Credit Scores | Credit Reports | Free Credit Check UK";
		
		@FindBy (css = "span[class='nav-item--signup-underline']") private WebElement signUpButton;
		
		public ClearScorePage(WebDriver browser){
			Assert.assertEquals(title, browser.getTitle());
			this.browser= browser;
			PageFactory.initElements(browser, this);
		
		}
		public SignUpPage clickSignUp() {
			signUpButton.click();
			return new SignUpPage(browser);
			
		}

}