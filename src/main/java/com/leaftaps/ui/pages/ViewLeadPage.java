package com.leaftaps.ui.pages;

import java.io.IOException;

import com.leaftaps.ui.base.ProjectSpecificMethods;

public class ViewLeadPage extends ProjectSpecificMethods {

	public ViewLeadPage verifyLeadId() throws IOException {
		try {
			String leadID = getPage().locator("#viewLead_companyName_sp").innerText().replaceAll("[^0-9]", "");
			System.out.println(leadID);
			reportStep("LeadId is verified successfully", "pass");
		} catch (Exception e) {
			reportStep("LeadId is not verified successfully..." + e, "fail");
		}
		return this;
	}

	public EditLeadPage clickEditButton() throws IOException {
		try {
			getPage().locator("//a[text()='Edit']").click();
			reportStep("Edit button is clicked", "pass");
		} catch (Exception e) {
			reportStep("Edit button is not clicked..." + e, "fail");
		}
		return new EditLeadPage();

	}

	public ViewLeadPage verifyCompName() throws IOException {
		try {
			String innerText = getPage().locator("#viewLead_companyName_sp").innerText();
			System.out.println(innerText);
			reportStep("InnerText is verified successfully", "pass");
		} catch (Exception e) {
			reportStep("InnerText is not verified successfully..." + e, "fail");
		}
		return this;
	}
}
