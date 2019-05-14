package com.cucumber.automation.pages.android;

import com.cucumber.automation.utils.AppiumBase;
import com.sun.org.apache.xpath.internal.operations.Bool;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;
import java.util.NoSuchElementException;
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

    public void f1(String text) {
        By el = MobileBy.className(text);
        String a = driver.findElements(el).get(0).getText();
        Assert.assertTrue("aaaa", a.toLowerCase().contains("Datos de acceso".toLowerCase()));


    }

    /*public boolean checkElement(WebElement el, String text) {
        try {
            //waitVar.until(ExpectedConditions.presenceOfElementLocated(el));
            String foundText = driver.findElement(el).getText();
            return foundText.toLowerCase().contains(text.toLowerCase());

            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public void findTextView(String text) {
        //By el = MobileBy.className(text);
        By el = driver.findElements(By.className(text)).get(0);
        boolean found = checkElement(el, text);

        //waitVar.until(ExpectedConditions.presenceOfElementLocated(el));
        boolean found = checkElement(el);
        Assert.assertTrue("ERROR: Element with text " + text + "not found", found );
    }/*


    /*public void validateRegex(String locator, String re) {
        By el = MobileBy.id(locator);

    }*/

    }










    /*public void clickComputeSum() {
        waitVar.until(ExpectedConditions.presenceOfElementLocated(result))
    }*/


