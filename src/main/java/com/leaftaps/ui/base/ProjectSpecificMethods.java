package com.leaftaps.ui.base;

import java.io.IOException;
import java.nio.file.Paths;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import com.leaftaps.ui.utility.DataLibrary;
import com.leaftaps.ui.utility.Reporter;
import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.Page;

public class ProjectSpecificMethods extends Reporter {

	private static final ThreadLocal<BrowserContext> context = new ThreadLocal<BrowserContext>();
	private static final ThreadLocal<Page> page = new ThreadLocal<Page>();
	protected static final ThreadLocal<Page> newPage = new ThreadLocal<Page>();

	@Override
	public long takeSnap() {

		int snapNumber = (int) (Math.random() * 999999 + 100000);
		getPage().screenshot(new Page.ScreenshotOptions()
				.setPath(Paths.get("./" + Reporter.folderName + "/images/" + snapNumber + ".jpg")).setFullPage(true));
		return snapNumber;
	}

	@Parameters({ "browserName", "URL" })
	@BeforeMethod
	public void startBrowser(String browserName, String url) {
		setDriver(browserName, false);
		setNode();
		context.set(getDriver().newContext(new Browser.NewContextOptions().setRecordVideoDir(Paths.get("videos/"))));
		page.set(getContext().newPage());
		getPage().onDialog(dialog -> {
			System.out.println(dialog.message());
			dialog.accept();
		});
		getPage().navigate(url);
	}

	@AfterMethod
	public void endBrowser() {
		getDriver().close();
		getContext().close(); // video will be saved
	}

	@DataProvider
	public Object[][] getData() throws IOException {
		return DataLibrary.readExcelData(dataFileName);
	}

	public BrowserContext getContext() {
		return context.get();
	}

	public Page getPage() {
		return page.get();
	}

	public Page getNewPage() {
		return newPage.get();
	}
}
