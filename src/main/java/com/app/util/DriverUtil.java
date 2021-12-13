package com.app.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.app.config.Constants;

public class DriverUtil {
	
	public WebDriver driver;
	
	public WebDriver createDriver(String browserName) {
		switch (browserName.toLowerCase()) {
		case "chrome":
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--start-maximized");
			System.setProperty(Constants.CHROME_PROPERTY_KEY, Constants.CHROME_EXE_PATH);
			driver = new ChromeDriver(options);
			driver.get(Constants.URL);
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		default:
			throw new RuntimeException("Please provide correct browser parameter");
		}
		return driver;
	}
	
}
