package noor.tek.bdd.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import noor.tek.bdd.base.BaseSetup;

public class RetailSignInPage extends BaseSetup {
	public RetailSignInPage() {
		PageFactory.initElements(getDriver(), this);
	}

	@FindBy(id = "signinLink")
	public WebElement signInLogo;

	@FindBy(id = "email")
	public WebElement emailField;

	@FindBy(xpath = "//input[@id='password']")
	public WebElement passwordField;

	@FindBy(xpath = "//button[@id='loginBtn']")
	public WebElement logInButton;

	@FindBy(linkText = "Create New Account")
	public WebElement createNewAccountButton;

	@FindBy(xpath = "//input[@name='name']")
	public WebElement nameSignUpField;

	@FindBy(xpath = "//input[@name='email']")
	public WebElement emailSignUpField;

	@FindBy(xpath = "//input[@name='password']")
	public WebElement passwordSignUpField;

	@FindBy(xpath = "//input[@name='confirmPassword']")
	public WebElement confrimPasswordField;

	@FindBy(id = "signupBtn")
	public WebElement signUpButton;

}
