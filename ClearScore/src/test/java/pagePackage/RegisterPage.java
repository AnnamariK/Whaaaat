package pagePackage;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	
	private WebDriver browser;
	private String title = "";
	
	@FindBy (id = "full_name") private WebElement nameField;
	@FindBy (id = "dob") private WebElement DOBField;
	@FindBy (id = "password") private WebElement passwordField;
	@FindBy (id = "dataprocessing") private WebElement agreeCheckbox;
	@FindBy (id = "ui-register-account-submit2") private WebElement createAccountButton;
	
	public RegisterPage(WebDriver browser) {
		Assert.assertEquals(title, browser.getTitle());
		this.browser=browser;
		PageFactory.initElements(browser, this);
	}


}
