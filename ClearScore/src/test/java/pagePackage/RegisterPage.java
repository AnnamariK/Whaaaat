package pagePackage;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegisterPage {
	
	private WebDriver browser;
	private String title = "Create your account";
	
	@FindBy (id = "full_name") private WebElement nameField;
	@FindBy (id = "dob") private WebElement DOBField;
	@FindBy (id = "password") private WebElement passwordField;
	@FindBy (css = "label[for='dataprocessing']") private WebElement agreeCheckbox;
	@FindBy (id = "ui-register-account-submit2") private WebElement createAccountButton;
	
	public RegisterPage(WebDriver browser) {
		new WebDriverWait(browser,10).until(ExpectedConditions.titleContains(title));
		Assert.assertEquals(title, browser.getTitle());
		this.browser=browser;
		PageFactory.initElements(browser, this);
	}

	public void typeFullName(String fullName) {
		new WebDriverWait(browser,10).until(ExpectedConditions.elementToBeClickable(nameField));
		nameField.sendKeys(fullName);
		
	}

	public void typeDOB(String dOB) {
		DOBField.sendKeys(dOB);
		
	}

	public void typePassword(String password) {
		passwordField.sendKeys(password);
		
	}

	public void tickCheckBox() {
		new WebDriverWait(browser,10).until(ExpectedConditions.elementToBeClickable(agreeCheckbox));
		agreeCheckbox.click();
		
	}

	public AddressPage clickCreateNewAccountButton() {
		createAccountButton.click();
		return new AddressPage(browser);
		
	}



	

}
