package com.leaftaps.ui.base;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Playwright;

public class DriverInstance {

	private static final ThreadLocal<Browser> driver = new ThreadLocal<Browser>();
	public static Playwright playwright;

	public void setDriver(String browser, boolean headless) {
		playwright = Playwright.create();

		switch (browser) {
		case "chrome":
			driver.set(playwright.chromium()
					.launch(new BrowserType.LaunchOptions().setChannel("chrome").setHeadless(false)));
			break;
		case "egde":
			driver.set(playwright.chromium()
					.launch(new BrowserType.LaunchOptions().setChannel("msedge").setHeadless(false)));
			break;
		case "firefox":
			driver.set(playwright.firefox().launch(new BrowserType.LaunchOptions().setHeadless(false)));
		default:
			break;
		}
	}

	public Browser getDriver() {
		return driver.get();
	}

}
