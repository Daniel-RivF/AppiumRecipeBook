package com.cucumber.automation.stepdefinition;

import com.cucumber.automation.pages.android.HomePage;
import com.cucumber.automation.pages.android.ServicesTest;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.Calendar;
import java.util.GregorianCalendar;


public class iOSTestAppSD {
    //Instances:
    HomePage homePage = new HomePage();
    ServicesTest jsontest = new ServicesTest();

    @When("^user taps back button on device$")
    public void userBack() {
        homePage.pressBack();

    }

    @When("^user clicks on button with id \"([^\"]*)\"$")
    public void user_click(String arg) {
        homePage.clickElement(arg);
    }

    @When("user clicks on element with xpath \"([^\"]*)\"$")
    public void user_click_name(String arg) {
        homePage.clickElementWithXpath(arg);
    }

    @When("^wait for \"([^\"]*)\" seconds$")
    public void waitForNseconds(String nsecs) throws InterruptedException {
        int nseconds = Integer.parseInt(nsecs);
        Thread.sleep(nseconds*1000);
    }

    @When("^user enters \"([^\"]*)\" in element with id \"([^\"]*)\"$")
    public void user_enters_text(String arg1, String arg2) {
        homePage.putText(arg1, arg2);
    }

    @Then("^element with id \"([^\"]*)\" validates with regex \"([^\"]*)\"$")
    public void elementId(String id, String regex) {
        homePage.validateWithRegexp(id, regex);
    }

    @Then("^element with classname \"([^\"]*)\" and index \"([^\"]*)\" validates with text \"([^\"]*)\"$")
    public void elementText(String arg1, String arg2, String arg3) {
        int index = Integer.parseInt(arg2);
        homePage.validElementWithClassText(arg1, index, arg3);
    }

    @Then("^element with xpath \"([^\"]*)\" validates with regex \"([^\"]*)\"$")
    public void elementXpath(String locator, String regex) {
        homePage.validateWithRegexpXpath(locator, regex);
    }

    @Then("^response code for endpoint url \"([^\"]*)\" is 200$")
    public void responseCode(String arg1) {
        jsontest.testResponseCode200(arg1);
    }

    /*@Then("^add item to cart in POST with endpoint url xxx$")
    public void addItem() {
        jsontest.postRequestTest();
    }*/



}
