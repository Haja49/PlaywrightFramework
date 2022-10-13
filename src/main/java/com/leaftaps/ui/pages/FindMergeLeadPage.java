package com.leaftaps.ui.pages;

import java.io.IOException;

import com.leaftaps.ui.base.ProjectSpecificMethods;

public class FindMergeLeadPage extends ProjectSpecificMethods {

	public FindMergeLeadPage typeLeadName(String fName) throws IOException {
		try {
			getNewPage().locator("(//label[text()='First name:']/following::input)[1]").type(fName);
			reportStep(fName + "First Name is entered successfully", "pass");
		} catch (Exception e) {
			reportStep("First Name is not entered successfully..." + e, "FAIL");
		}
		return this;
	}

	public FindMergeLeadPage clickFindLeadButton() throws IOException {
		try {
			getNewPage().locator("//button[text()='Find Leads']").click();
			reportStep("Find Lead button is clicked", "pass");
		} catch (Exception e) {
			reportStep("Find Lead button is not clicked..." + e, "FAIL");
		}
		return this;
	}

	public MergeLeadPage clickFirstSearchLink() throws IOException {
		try {
			getNewPage().locator("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a)[1]").click();
			reportStep("First resulting lead is clicked", "pass");
		} catch (Exception e) {
			reportStep("First resulting lead could not be clicked", "FAIL");
		}
		return new MergeLeadPage();
	}

}
