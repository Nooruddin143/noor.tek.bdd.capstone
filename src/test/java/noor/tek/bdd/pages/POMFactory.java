package noor.tek.bdd.pages;

import noor.tek.bdd.base.BaseSetup;

public class POMFactory extends BaseSetup {
	private RetailHomePage homePage;

	public POMFactory() {
		this.homePage = new RetailHomePage();
	
	}
	public RetailHomePage homePage() {
		return this.homePage;
	}

}
