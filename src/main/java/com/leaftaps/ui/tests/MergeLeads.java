package com.leaftaps.ui.tests;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leaftaps.ui.base.ProjectSpecificMethods;
import com.leaftaps.ui.pages.LoginPage;

public class MergeLeads extends ProjectSpecificMethods {

	@BeforeTest
	public void setData() {
		testcaseName = "MergeLead";
		testDescription = "Merge Lead - 2 Unique Leads";
		category = "Functional";
		authors = "Haja";
		dataFileName = "TC004";
	}

	@Test(dataProvider = "getData")
	public void mergeLead(String username, String password, String fromLead, String toLead) throws IOException {
		new LoginPage()
		.typeUsername(username)
		.typePassword(password)
		.clickLoginButton()
		.clickCRMSFA()
		.clickLeads()
		.clickMergeLead()
		.clickFromLeadIcon()
		.typeLeadName(fromLead)
		.clickFindLeadButton()
		.clickFirstSearchLink()
		.clickToLeadIcon()
		.typeLeadName(toLead)
		.clickFindLeadButton()
		.clickFirstSearchLink()
		.clicMergeButton();
	}
}
