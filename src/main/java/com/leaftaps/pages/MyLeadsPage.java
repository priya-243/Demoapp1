package com.leaftaps.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

import io.cucumber.java.en.When;

import io.cucumber.java.en.When;


public class MyLeadsPage extends ProjectSpecificMethods {

@When("click on create lead button")	
	public CreateLeadPage clickCreateLeadLink() {
		click(locateElement(Locators.LINK_TEXT, "Create Lead"));
		reportStep("Create Lead link is clicked", "pass");
		return new CreateLeadPage();
	}
	
	
	public FindLeadPage clickFindLead(){
		click(locateElement(Locators.LINK_TEXT,"Find Leads"));	
		reportStep("Find Lead link is clicked", "pass");
		return new FindLeadPage();
	}
	
	
	
	public MergeLeadPage clickMergeLead(){
		click(locateElement(Locators.LINK_TEXT,"Merge Leads"));	
		reportStep("Merge Lead link is clicked", "pass");
		return new MergeLeadPage();
	}
	
}
