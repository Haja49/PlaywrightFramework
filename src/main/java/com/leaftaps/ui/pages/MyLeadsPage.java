package com.leaftaps.ui.pages;

import java.io.IOException;

import com.leaftaps.ui.base.ProjectSpecificMethods;

public class MyLeadsPage extends ProjectSpecificMethods {

	public CreateLeadPage clickCreateLead() throws IOException {
		try {
			getPage().locator("//a[text()='Create Lead']").click();
			reportStep("CreateLead button is clicked", "pass");
		} catch (Exception e) {
			reportStep("CreateLead button is not clicked..." + e, "fail");
		}
		return new CreateLeadPage();
	}

	public FindLeadPage clickFindLead() throws IOException {
		try {
			getPage().locator("//a[text()='Find Leads']").click();
			reportStep("FindLead button is clicked", "pass");
		} catch (Exception e) {
			reportStep("Find Lead button is not clicked..." + e, "fail");
		}
		return new FindLeadPage();

	}

	public MergeLeadPage clickMergeLead() throws IOException {
		try {
			getPage().locator("//a[text()='Merge Leads']").click();
			reportStep("MergeLead button is clicked", "pass");
		} catch (Exception e) {
			reportStep("Merge Lead button is not clicked..." + e, "fail");
		}
		return new MergeLeadPage();

	}

}
