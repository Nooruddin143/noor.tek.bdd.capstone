package noor.tek.bdd.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import noor.tek.bdd.pages.POMFactory;
import noor.tek.bdd.utilities.CommonUtility;
import noor.tek.bdd.utilities.DataGeneratorUtility;

public class SignInSteps extends CommonUtility {
	private POMFactory factory = new POMFactory();

	@Given("User is on retail website")
	public void userIsOnTekRetailWebsite() {
		String actualTitle = getTitle();
		String expectedTitle = "React App";
		Assert.assertEquals(actualTitle, expectedTitle);
		Assert.assertTrue(isElementDisplayed(factory.homePage().tekSchoolLogo));
		logger.info("User is on tek retail website");
		logger.info("Actual Title " + actualTitle + " equals expected title " + expectedTitle);
	}

	@When("User click on Sign in option")
	public void userClickOnSignInOption() {
		click(factory.homePage().signInButton);
		logger.info("user clicked on sign in option");

	}

	@When("User enter email {string} and password {string}")
	public void userEnterEmailAndPassword(String email, String password) {
		sendText(factory.signInPage().emailField, email);
		sendText(factory.signInPage().passwordField, password);
		logger.info("user entered email " + email + " and password " + password);

	}

	@When("User click on login button")
	public void UserClickOnLogInOption() {
		click(factory.signInPage().logInButton);
		logger.info("user clicked on log in button");
	}

	@Then("User should be logged in into account")
	public void userShouldBeLoggedInIntoAccount() {
		Assert.assertTrue(isElementDisplayed(factory.homePage().accountOption));
	}

	@When("User click on Create New Account button")
	public void userClickOnCreateNewAccountButton() {
		click(factory.signInPage().createNewAccountButton);
		logger.info("User clicked on create account button");
	}

	@When("User fill the signUp information with below data")
	public void userFillTheSignUpInformationWithBelowData(DataTable dataTable) {
		List<Map<String, String>> signUpInformation = dataTable.asMaps(String.class, String.class);
		sendText(factory.signInPage().nameSignUpField, DataGeneratorUtility.data(signUpInformation.get(0).get("name")));
		sendText(factory.signInPage().emailSignUpField, DataGeneratorUtility.data(signUpInformation.get(0).get("email")));
		sendText(factory.signInPage().passwordSignUpField, signUpInformation.get(0).get("password"));
		sendText(factory.signInPage().confrimPasswordField, signUpInformation.get(0).get("confirmPassword"));
		logger.info("user filled the sign up information form");
		
		

	}

	@When("User click on SignUp button")
	public void userClickOnSignUpButton() {
		click(factory.signInPage().signUpButton);
		logger.info("user clicked on sign up button");

	}

	@Then("User should be logged into account page")
	public void userShouldBeLoggedIntoAccountPage() {
		Assert.assertTrue(isElementDisplayed(factory.accountPage().profileImage));
		logger.info("user logged in into account");

	}
}
