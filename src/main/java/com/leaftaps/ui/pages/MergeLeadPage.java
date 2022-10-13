package com.leaftaps.ui.pages;

import java.io.IOException;

import com.leaftaps.ui.base.ProjectSpecificMethods;
import com.microsoft.playwright.Locator;

public class MergeLeadPage extends ProjectSpecificMethods {

	public FindMergeLeadPage clickFromLeadIcon() throws IOException {
		try {
			newPage.set(getContext().waitForPage(() -> {
				getPage().locator("(//span[text()='From Lead']/following::a)[1]").click();
			}));
			reportStep("From Lead Icon is clicked successfully", "pass");
		} catch (Exception e) {
			reportStep("Icon is not clicked successfully..." + e, "fail");
		}

		return new FindMergeLeadPage();
	}

	public FindMergeLeadPage clickToLeadIcon() throws IOException {
		try {
			newPage.set(getContext().waitForPage(() -> {
				getPage().locator("(//span[text()='To Lead']/following::a)[1]").click();
			}));
			reportStep("To Lead Icon is clicked successfully", "pass");

		} catch (Exception e) {
			reportStep("Icon is not clicked successfully..." + e, "fail");
		}
		return new FindMergeLeadPage();
	}

	public MergeLeadPage clicMergeButton() throws IOException {
		try {
			Locator locator = getPage().locator(".buttonDangerous");
			locator.click();
			reportStep("Merge is clicked successfully", "pass");
		} catch (Exception e) {
			reportStep("Merge is not clicked successfully..." + e, "fail");
		}
		return this;
	}

}
