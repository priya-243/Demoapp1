package com.leaftaps.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

import io.cucumber.java.en.When;

public class CreateLeadPage  extends ProjectSpecificMethods{
	@When("enter company name as {string}")
	public CreateLeadPage enterCompanyName(String comName) {
		clearAndType(locateElement(Locators.XPATH, "//input[@id='createLeadForm_companyName']"), comName);
		reportStep(comName+" company name is entered successfully","pass");
		return this;
	}
	@When("enter first name as {string}")
	public CreateLeadPage enterFirstName(String fName) {
		clearAndType(locateElement(Locators.ID, "createLeadForm_firstName"), fName);
		reportStep(fName+" first name is entered successfully","pass");
		return this;
	}
	@When("enter last name as {string}")
	public CreateLeadPage enterLastName(String lName) {
		clearAndType(locateElement(Locators.ID, "createLeadForm_lastName"), lName);
		reportStep(lName+" last name is entered successfully","pass");
		return this;
	}
	
	@When("click on create button in leadpage")
	public ViewLeadPage clickCreateLeadButton() {
		click(locateElement(Locators.NAME, "submitButton"));
		reportStep("Create Lead button is clicked successfully", "pass");
		return new ViewLeadPage();
	}

}
