package com.cucumber.automation.stepdefinition;

import java.io.File;
import java.net.MalformedURLException;

import com.cucumber.automation.utils.AppiumBase;

import cucumber.api.Scenario;
import cucumber.api.java.AfterStep;
import cucumber.api.java.Before;
import cucumber.api.java.After;
import io.qameta.allure.Allure;
import io.qameta.allure.Attachment;
import io.qameta.allure.Step;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.glassfish.tyrus.core.wsadl.model.Application;
import org.junit.runner.notification.Failure;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import javax.xml.ws.WebFault;


public class Hooks {
    AppiumBase appiumBase = new AppiumBase();

    @Before
    public void beforeHookfunction() throws
            MalformedURLException, InterruptedException {
        appiumBase.createDriver();

    }

    @After
    public void tearDown(Scenario scenario) {
        try {
            if (scenario.isFailed()) {
                final byte[] screenshot = ((TakesScreenshot) appiumBase.getDriver())
                        .getScreenshotAs(OutputType.BYTES);
                scenario.embed(screenshot, "image/png");
            }
        } finally {
            appiumBase.teardown();
        }
    }





}
