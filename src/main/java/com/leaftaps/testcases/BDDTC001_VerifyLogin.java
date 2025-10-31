package com.leaftaps.testcases;

import org.testng.annotations.BeforeTest;

import com.framework.testng.api.base.ProjectSpecificMethods;

import io.cucumber.testng.CucumberOptions;
@CucumberOptions(features = {"src/main/java/com/leaftaps/features/CreateLead.feature"},
glue = {"com.leaftaps.pages"},dryRun = false, publish = true , monochrome = true)

public class BDDTC001_VerifyLogin extends ProjectSpecificMethods {
	
	@BeforeTest
	public void setValues() {
		testcaseName = "VerifyLogin";
		testDescription ="Verify Login functionality with positive data";
		authors="Bhuvanesh";
		category ="Smoke";
	}

}
