package com.leaftaps.ui.pages;

import java.io.IOException;

import com.leaftaps.ui.base.ProjectSpecificMethods;

public class FindLeadPage extends ProjectSpecificMethods {

	public FindLeadPage enterFirstName(String fName) throws IOException {
		try {
			getPage().locator("(//span[text()='Advanced']/following::input)[2]").type(fName);
			reportStep(fName + " Username is entered successfully", "pass");
		} catch (Exception e) {
			reportStep("Username is not entered successfully..." + e, "fail");
		}
		return this;
	}

	public FindLeadPage clickFindLeadButton() throws IOException {
		try {
			getPage().locator("//button[text()='Find Leads']").click();
			reportStep("Findlead button is clicked", "pass");
		} catch (Exception e) {
			reportStep("Findlead button is not clicked..." + e, "fail");
		}
		return this;
	}

	public ViewLeadPage clickLeadIDLink() throws IOException {
		try {
			getPage().locator("(//td[contains(@class,'x-grid3-col x-grid3-cell')]//div/a)[1]").click();
			reportStep("LeadId button is clicked", "pass");
		} catch (Exception e) {
			reportStep("LeadID button is clicked", "pass");
		}
		return new ViewLeadPage();
	}

}
