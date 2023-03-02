package noor.tek.bdd.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import noor.tek.bdd.base.BaseSetup;

public class RetailHomePage extends BaseSetup {
	public RetailHomePage() {
		PageFactory.initElements(getDriver(), this);
	}

	@FindBy(xpath = "//a[@class='top-nav__btn']")
	public WebElement signInButton;

	@FindBy(xpath = "//a[@class='top-nav__logo active']")
	public WebElement tekSchoolLogo;

	@FindBy(xpath = "//a[@id='accountLink']")
	public WebElement accountOption;
}
