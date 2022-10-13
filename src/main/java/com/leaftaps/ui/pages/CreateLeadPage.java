package com.leaftaps.ui.pages;

import java.io.IOException;

import com.leaftaps.ui.base.ProjectSpecificMethods;

public class CreateLeadPage extends ProjectSpecificMethods {

	public CreateLeadPage typeCompanyName(String companyName) throws IOException {
		try {
			getPage().locator("#createLeadForm_companyName").type(companyName);
			reportStep(companyName + " CompanyName is entered successfully", "pass");
		} catch (Exception e) {
			reportStep("CompanyName is not entered successfully..." + e, "fail");
		}
		return this;
	}

	public CreateLeadPage typeFirstName(String firstName) throws IOException {
		try {
			getPage().locator("#createLeadForm_firstName").type(firstName);
			reportStep(firstName + " FirstName is entered successfully", "pass");
		} catch (Exception e) {
			reportStep("FirstName is not entered successfully..." + e, "fail");
		}
		return this;
	}

	public CreateLeadPage typeLastName(String lastName) throws IOException {
		try {
			getPage().locator("#createLeadForm_lastName").type(lastName);
			reportStep(lastName + " LastName is entered successfully", "pass");
		} catch (Exception e) {
			reportStep("LastName is not entered successfully..." + e, "fail");
		}
		return this;
	}

	public ViewLeadPage clickCreateLeadButton() throws IOException {
		try {
			getPage().locator("//input[@name='submitButton']").click();
			reportStep("Createlead button is clicked", "pass");
		} catch (Exception e) {
			reportStep("Createlead button is not clicked..." + e, "fail");
		}
		return new ViewLeadPage();
	}
}
