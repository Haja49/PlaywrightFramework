package com.leaftaps.ui.pages;

import java.io.IOException;

import com.leaftaps.ui.base.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods {

	public LoginPage typeUsername(String username) throws IOException {
		try {
			getPage().locator("#username").type(username);
			reportStep(username + " Username is entered successfully", "pass");
		} catch (Exception e) {
			reportStep("Username is not entered successfully..." + e, "fail");
		}
		return this;
	}

	public LoginPage typePassword(String password) throws IOException {
		try {
			getPage().locator("#password").type(password);
			reportStep(password + " password is entered successfully", "pass");
		} catch (Exception e) {
			reportStep("Password is not entered successfully..." + e, "fail");
		}
		return this;
	}

	public WelcomePage clickLoginButton() throws IOException {
		try {
			getPage().locator("//*[@class='decorativeSubmit']").click();
			reportStep("Login button is clicked", "pass");
		} catch (Exception e) {
			reportStep("Login button is not clicked..." + e, "fail");
		}
		return new WelcomePage();
	}
}
