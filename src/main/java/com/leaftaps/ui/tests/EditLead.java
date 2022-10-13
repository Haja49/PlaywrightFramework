package com.leaftaps.ui.tests;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leaftaps.ui.base.ProjectSpecificMethods;
import com.leaftaps.ui.pages.LoginPage;

public class EditLead extends ProjectSpecificMethods {
	@BeforeTest
	public void setData() {
		testcaseName = "EditLead";
		testDescription = "Edit Lead - Mandatory Fields";
		category = "Functional";
		authors = "Haja";
		dataFileName = "TC003";
	}

	@Test(dataProvider = "getData")
	public void editLead(String username, String password, String fName, String cName) throws IOException {
		new LoginPage()
		.typeUsername(username)
		.typePassword(password)
		.clickLoginButton()
		.clickCRMSFA()
		.clickLeads()
		.clickFindLead()
		.enterFirstName(fName)
		.clickFindLeadButton()
		.clickLeadIDLink()
		.clickEditButton()
		.enterCName(cName)
		.clickUpdateButton()
		.verifyCompName();
		
		
			
	}
	

}
