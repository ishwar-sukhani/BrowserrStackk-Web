package com.app.util;

import java.time.Duration;

import com.app.config.Constants;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumUtil {

    WebDriverWait wait;

    public boolean waitForElement(WebDriver driver, WebElement element) {
        wait = new WebDriverWait(driver, Duration.ofSeconds(Constants.MAX_WAIT_TIME));
        return true;
    }

    public boolean enterText(WebDriver driver, WebElement element, String keysToEnter) {
        if (waitForElement(driver, element)){
            element.sendKeys(keysToEnter);
            System.out.println("[ERROR] Sendkeys successful");
            return true;
        }
        else {
            System.out.println("[ERROR] EnterText failed");
            return false;
        }
    
    }

}
