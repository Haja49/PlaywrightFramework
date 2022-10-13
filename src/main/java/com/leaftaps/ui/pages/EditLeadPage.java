package com.leaftaps.ui.pages;

import java.io.IOException;

import com.leaftaps.ui.base.ProjectSpecificMethods;

public class EditLeadPage extends ProjectSpecificMethods {

	public EditLeadPage enterCName(String cName) throws IOException {
		try {
			getPage().locator("#updateLeadForm_companyName").fill("");
			getPage().locator("#updateLeadForm_companyName").type(cName);
			reportStep(cName + " Company name is entered successfully", "PASS");
		} catch (Exception e) {
			reportStep("Company name could not be entered..." + e, "FAIL");
		}
		return this;

	}

	public ViewLeadPage clickUpdateButton() throws IOException {
		try {
			getPage().locator("text=Update").click();
			reportStep("Update button clicked successfully", "PASS");
		} catch (Exception e) {
			reportStep("Update button could not be clicked..." + e, "FAIL");
		}
		return new ViewLeadPage();
	}

}
