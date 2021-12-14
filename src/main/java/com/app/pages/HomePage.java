package com.app.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	public WebDriver driver;
	
	@FindBy(xpath = "//div[@class='product-cards-wrapper--click']//a[@title='Automate']")
	private WebElement automateCard;
	
	@FindBy(xpath = "//div[@class='product-cards-wrapper--click']//a[@title='Live']")
	private WebElement liveCard;
	
	@FindBy(id = "product-menu-toggle")
	private WebElement productsMenu;
	
	@FindBy(xpath = "//div[@id='product-menu-dropdown']//li//a[@aria-label='Automate']")
	private WebElement automateInProductsMenu;

	@FindBy(xpath = "accept-cookie-notification")
	private WebElement acceptAllCookies;

	@FindBy(xpath = "//nav[@id='primary-menu-container']//li//a[@title='Sign In']")
	private WebElement signInLink;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void acceptCookies() {
		acceptAllCookies.click();
		System.out.println("[INFO] Accept Cookies clicked successfully");
	}
	
	public void navigateToAutomateViaCard() {
		automateCard.click();
		System.out.println("[INFO] Automate Card clicked successfully");
	}
	
	public void navigateToAutomateViaProductsMenu() {
		productsMenu.click();
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
		}
		automateInProductsMenu.click();
		System.out.println("[INFO] Clicked Automate successfully from Products Menu");
	}

	public SignInPage navigateToSignInPage() {
		signInLink.click();
		System.out.println("[INFO] Clicked Automate successfully from Products Menu");
		return new SignInPage(driver);
	}

}
