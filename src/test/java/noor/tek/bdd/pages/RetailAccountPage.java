package noor.tek.bdd.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import noor.tek.bdd.base.BaseSetup;

public class RetailAccountPage extends BaseSetup{
	public RetailAccountPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	@FindBy(xpath ="//img[@id='profileImage']")
	public WebElement profileImage;
	
	@FindBy(xpath = "//input[@id='nameInput']")
	public WebElement nameInput;
	
	@FindBy(xpath = "//input[@id='personalPhoneInput']")
	public WebElement phoneNumberInput;
	
	@FindBy(xpath = "//button[@id='personalUpdateBtn']")
	public WebElement updateButton;
	
	@FindBy(xpath = "//div[text()='Personal Information Updated Successfully']")
	public WebElement personelInfoUpdateSuccessMessage;
	
	@FindBy(xpath = "//input[@name='previousPassword']")
	public WebElement previousPasswordField;
	
	@FindBy(xpath = "//input[@name='newPassword']")
	public WebElement newPasswordField;
	
	@FindBy(xpath = "//input[@name='confirmPassword']")
	public WebElement confirmPasswordField;
	
	@FindBy(xpath = "//button[@id='credentialsSubmitBtn']")
	public WebElement changePasswordButton;
	
	@FindBy(xpath = "//div[text()='Password Updated Successfully']")
	public WebElement passwordUpdatedSuccessfullyMessage;

}
