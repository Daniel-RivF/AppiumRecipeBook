package com.cucumber.automation.pages.android;

import com.cucumber.automation.utils.AppiumBase;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends AppiumBase {
    // All the locators for Home page will be defined here
    // Example:
    By textField1 = By.id("com.carrefour.tablet.local.debug:id/login");
    By textfield2 = By.id("com.carrefour.tablet.local.debug:id/password");
    By computeSum = By.id("com.carrefour.tablet.local.debug:id/submit");

    public boolean isHomePage() {
        waitVar.until(ExpectedConditions.presenceOfElementLocated(computeSum));
        return driver.findElement(computeSum).isDisplayed();
    }

    public void typeTextField1(String text) {
        waitVar.until(ExpectedConditions.presenceOfElementLocated(textField1));
        driver.findElement(textField1).sendKeys(text);
    }

    public void typeTextField2(String text) {
        waitVar.until(ExpectedConditions.presenceOfElementLocated(textfield2));
        driver.findElement(textfield2).sendKeys(text);
    }

    public void clickButton() {
        waitVar.until(ExpectedConditions.presenceOfElementLocated(computeSum));
        driver.findElement(computeSum).click();
    }

    /*public void clickComputeSum() {
        waitVar.until(ExpectedConditions.presenceOfElementLocated(result))
    }*/

}

