package com.leaftaps.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

import io.cucumber.java.en.When;

public class LoginPage extends ProjectSpecificMethods {
	@When("the user enters the username as {string}")
	public LoginPage enterUsername(String uName) {
		clearAndType(locateElement("username"), uName);
		reportStep(uName+" username is entered successfully", "pass");
		
		return this;
	}
	@When("the user enters the password as {string}")
	public LoginPage enterPassword(String passWord) {
		clearAndType(locateElement("password"),passWord);
		reportStep(passWord+" password is entered successfully", "pass");
		return this;

	}
	@When("the user clicks the login button")
	public HomePage clickLogin() {
		click(Locators.CLASS_NAME, "decorativeSubmit");
		reportStep("Login button is clicked successfully", "pass");
		return new HomePage();

	}

}
