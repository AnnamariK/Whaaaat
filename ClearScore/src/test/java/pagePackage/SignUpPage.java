package pagePackage;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignUpPage {


	WebDriver browser;
	String title = "Create your account";
	
	@FindBy (id = "email") private WebElement emailField;
	@FindBy (css ="button[class='btn-secondary text-mid']") private WebElement continueButton;
	

	public SignUpPage(WebDriver browser) {
		new WebDriverWait(browser,10).until(ExpectedConditions.titleContains(title));
		Assert.assertEquals(title, browser.getTitle());
		this.browser = browser;
		PageFactory.initElements(browser, this);
	}

	public void typeEmail(String email) {
		emailField.sendKeys(email);		
		
	}

	public RegisterPage clickContinue() {
		new WebDriverWait(browser,10).until(ExpectedConditions.elementToBeClickable(continueButton));
		continueButton.click();
		return new RegisterPage(browser);
		
	}
}
