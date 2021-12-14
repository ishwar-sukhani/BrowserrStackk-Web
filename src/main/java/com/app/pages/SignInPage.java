package com.app.pages;

import com.app.util.SeleniumUtil;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {

    public WebDriver driver;
    public SeleniumUtil seleniumUtil;
    
    @FindBy(id = "user_email_login")
    private WebElement emailText;

    @FindBy(id = "user_password")
    private WebElement passwordText;

    @FindBy(id = "user_submit")
    private WebElement signMeInBtn;

    @FindBy(xpath = "//div//a[@class='sign-up-link hide-in-os-page']")
    private WebElement signUpLink;

    @FindBy(xpath = "//div//a[@class='forgot-password-link']")
    private WebElement forgotPaswordLink;

    public SignInPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

    public void login(String username, String password) {
        seleniumUtil.enterText(driver, emailText, username);
        seleniumUtil.enterText(driver, passwordText, password);
        signMeInBtn.click();
        System.out.println("[INFO] Entered Email, Password and clicked on Sign Me In successfully");
    }

}
