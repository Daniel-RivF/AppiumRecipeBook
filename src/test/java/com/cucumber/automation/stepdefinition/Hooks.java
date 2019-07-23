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
import org.apache.commons.io.FileUtils;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.glassfish.tyrus.core.wsadl.model.Application;
import org.junit.runner.notification.Failure;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
//import com.cucumber.automation.utils.AllureHistoryFiles;
import javax.xml.ws.WebFault;


public class Hooks {
    AppiumBase appiumBase = new AppiumBase();

    @Before
    public void beforeHookfunction() throws
            MalformedURLException, InterruptedException {
        appiumBase.createDriver();

    }

    @After
    public void afterFunction(Scenario scenario) {
        if (scenario.isFailed()) {
            try {
                File screenshot = ((TakesScreenshot) appiumBase.getDriver()).getScreenshotAs(OutputType.FILE);
                FileUtils.copyFile(screenshot, new File("/home/drf/f1.png"));
                byte[] embed2 = ((TakesScreenshot) appiumBase.getDriver()).getScreenshotAs(OutputType.BYTES);
                scenario.embed(embed2, "image/png");
                appiumBase.teardown();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}


