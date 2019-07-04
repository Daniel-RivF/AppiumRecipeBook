package com.cucumber.automation.cucumberoptions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/com/cucumber/automation/features",
        glue = "com.cucumber.automation.stepdefinition",
        plugin = { "pretty", "html:target/cucumber-html-reports", "io.qameta.allure.cucumber4jvm.AllureCucumber4Jvm",
                "json:target/cucumber-html-reports/cucumber.json","rerun:target/failed_scenarios.txt" },
        monochrome = true
)

public class RunCukeTest {
}
