package com.cucumber.automation.pages.android;
import com.cucumber.automation.utils.AppiumBase;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import org.junit.Assert;


public class HomePage extends AppiumBase {
    // All the locators for Home page will be defined here
    // Example:
    //By textField1 = By.id("com.carrefour.tablet.local.debug:id/login");
    // Check the book to find a way to use mobulefind (Appium) instead of By.id (Selenium).
    By textField1 = MobileBy.id("com.carrefour.tablet.local.debug:id/login");
    By textfield2 = By.id("com.carrefour.tablet.local.debug:id/password");
    By computeSum = By.id("com.carrefour.tablet.local.debug:id/submit");
    //By tabCategories = By.id("");

    public void pressBack() {
        driver.navigate().back();
    }

    public void putText(String text, String locator) {
        By el = MobileBy.id(locator);
        waitVar.until(ExpectedConditions.presenceOfElementLocated(el));
        driver.findElement(el).sendKeys(text);
    }

    public void clickElement(String locator) {
        By buttonEl = MobileBy.id(locator);
        waitVar.until(ExpectedConditions.presenceOfElementLocated(buttonEl));
        driver.findElement(buttonEl).click();
    }

    public void clickElementWithXpath(String locator) {
        By el = MobileBy.xpath(locator);
        waitVar.until(ExpectedConditions.presenceOfElementLocated(el));
        driver.findElement(el).click();
    }

    public void validElementWithClassText(String textclass, Integer i, String text) {
        By el = MobileBy.className(textclass);
        String a = driver.findElements(el).get(i).getText();
        Assert.assertTrue("Found element with class " + textclass + " and index " +
                i.toString() + " does not match with " + text , a.toLowerCase().contains(text.toLowerCase()));
    }

    public void validateWithRegexpXpath(String locator, String validatewith) {
        By el = MobileBy.xpath(locator);
        waitVar.until(ExpectedConditions.presenceOfElementLocated(el));
        Pattern pattern = Pattern.compile(validatewith);
        String textElement = driver.findElement(el).getText();
        Matcher matcher = pattern.matcher(textElement);
        Assert.assertTrue("ERROR: Element with xpath " + locator + " did not match with regex " + validatewith, matcher.matches());
    }

    public void validateWithRegexp(String locator, String validatewith) {
        By el = MobileBy.id(locator);
        waitVar.until(ExpectedConditions.presenceOfElementLocated(el));
        Pattern pattern = Pattern.compile(validatewith);
        String textElement = driver.findElement(el).getText();
        Matcher matcher = pattern.matcher(textElement);
        Assert.assertTrue("ERROR: Element with id " + locator + " did not match with regex " + validatewith + ". Found: " + textElement , matcher.matches());
    }



}

