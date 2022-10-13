package com.leaftaps.ui.tests;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leaftaps.ui.base.ProjectSpecificMethods;
import com.leaftaps.ui.pages.LoginPage;

public class CreateLead extends ProjectSpecificMethods {

	@BeforeTest
	public void setData() {
		testcaseName = "CreateLead";
		testDescription = "Create Lead - Mandatory Fields";
		category = "Functional";
		authors = "Haja";
		dataFileName = "TC001";
	}

	@Test(dataProvider = "getData")
	public void tc001(String username, String password, String cName, String fName, String lName) throws IOException {

		new LoginPage()
		.typeUsername(username)
		.typePassword(password)
		.clickLoginButton()
		.clickCRMSFA()
		.clickLeads()
		.clickCreateLead()
		.typeCompanyName(cName)
		.typeFirstName(fName)
		.typeLastName(lName)
		.clickCreateLeadButton()
		.verifyLeadId();
		

	}
}
