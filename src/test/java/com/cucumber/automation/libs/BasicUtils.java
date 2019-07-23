package com.cucumber.automation.libs;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BasicUtils {

    //Take as parameter By el = MobileBy.xxxx(locator)

    public static void clickElementWithId(WebDriver driver, By el) {
        driver.findElement(el).click();
    }

    public static void clickElementWithXpath(WebDriver driver, By el) {
        driver.findElement(el).click();
    }

    public static void putTextElement(WebDriver driver, By el, String text) {
        driver.findElement(el).sendKeys(text);
    }

    public static void validateWithRegexp2(WebDriver driver, By el, String validatewith) {
        //By el = MobileBy.xpath(locator);
        Pattern pattern = Pattern.compile(validatewith);
        String textElement = driver.findElement(el).getText();
        Matcher matcher = pattern.matcher(textElement);
        Assert.assertTrue("ERROR: Element with xpath " + " did not match with regex " + validatewith, matcher.matches());
    }

}
