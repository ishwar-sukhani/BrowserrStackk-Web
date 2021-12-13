package com.app.sanity;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.app.pages.HomePage;
import com.app.util.DriverUtil;

public class HomepageTest {
	
	WebDriver driver;
	DriverUtil obj = new DriverUtil();
	
	@BeforeTest
	public void startTest() {
		driver = obj.createDriver("chrome");
	}
	
	@Test
	public void verifyAutomateLinkViaAutomateCard() {
		HomePage homepage = new HomePage(driver);
		homepage.navigateToAutomateViaCard();
		Assert.assertTrue(driver.getTitle()
				.equals("Automated Selenium Testing On A Grid of 3000+ Browsers & Mobile Devices | BrowserStack"));
	}
	
	@Test
	public void verifyAutomateLinkViaProductsMenu() {
		HomePage homepage = new HomePage(driver);
		homepage.navigateToAutomateViaProductsMenu();
		Assert.assertTrue(driver.getTitle()
				.equals("Automated Selenium Testing On A Grid of 3000+ Browsers & Mobile Devices | BrowserStack"));
	}
	
	@AfterSuite
	public void tearDown() {
		driver.quit();
	}

}
