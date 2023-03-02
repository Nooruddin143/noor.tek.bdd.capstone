package noor.tek.bdd.steps;

import java.util.List;

import org.junit.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import noor.tek.bdd.pages.POMFactory;
import noor.tek.bdd.utilities.CommonUtility;

public class RetailAccountSteps extends CommonUtility {
	POMFactory factroy = new POMFactory();

	@When("User click on Account option")
	public void userClickOnAccountOption() {
		click(factroy.homePage().accountOption);
		logger.info("user clicked on account option");
	}

	@When("User update Name {string} and Phone {string}")
	public void userUpdateNameAndPhone(String name, String phoneNumber) {
		clearTextUsingSendKeys(factroy.accountPage().nameInput);
		sendText(factroy.accountPage().nameInput, name);
		clearTextUsingSendKeys(factroy.accountPage().phoneNumberInput);
		sendText(factroy.accountPage().phoneNumberInput, phoneNumber);
		logger.info("user entered name and phone number");

	}

	@When("User click on Update button")
	public void userClickOnUpdateButton() {
		waitTillPresence(factroy.accountPage().updateButton);
		click(factroy.accountPage().updateButton);
		logger.info("user clicked on update button");

	}

	@Then("user profile information should be updated")
	public void userProfileInformationShouldBeUpdated() {
		waitTillPresence(factroy.accountPage().personelInfoUpdateSuccessMessage);
		Assert.assertTrue(isElementDisplayed(factroy.accountPage().personelInfoUpdateSuccessMessage));
		logger.info("user profile information updated");

	}

	@When("User enter below information")
	public void userEnterBelowInformation(DataTable dataTable) {
		List<List<String>> passwordInfo = dataTable.asLists(String.class);

	}

	@When("User click on Change Password button")
	public void userClickOnChangePasswordButton() {

	}

	@Then("a message should be displayed {string}")
	public void aMessageShouldBeDisplayed(String string) {

	}

}
