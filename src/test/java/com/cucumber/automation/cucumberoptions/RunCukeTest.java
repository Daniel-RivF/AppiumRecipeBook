package com.cucumber.automation.cucumberoptions;


import org.junit.AfterClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
//import static com.cucumber.automation.utils.AllureHistoryFiles.copyHistoryFolder;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/com/cucumber/automation/features",
        glue = "com.cucumber.automation.stepdefinition",
        plugin = {"io.qameta.allure.cucumber4jvm.AllureCucumber4Jvm", "pretty", "rerun:target/failed_scenarios.txt","html:target/cucumber-html-reports"},
        monochrome = true
)

public class RunCukeTest {

    /*@AfterClass
    public static void allurehist() {
        copyHistoryFolder();
    }*/
}
