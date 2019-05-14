package com.cucumber.automation.stepdefinition;

import com.cucumber.automation.pages.android.HomePage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertTrue;

public class iOSTestAppSD {
    HomePage homePage = new HomePage();

    @When("^user clicks on button with locator \"([^\"]*)\"$")
    public void user_click(String arg) {
        homePage.clickElement(arg);
    }

    @When("^user enters \"([^\"]*)\" in element with locator \"([^\"]*)\"$")
    public void user_enters_text(String arg1, String arg2) {
        homePage.putText(arg1, arg2);
    }

    @Then("^element with name \"([^\"]*)\" should be present$")
    public void elementText(String arg1) {
        homePage.f1(arg1);
    }

    /*@Given("^user is on Application Home Page$")


    @When("^user enters \"([^\"]*)\" in first field$")
    public void user_enters_in_first_field(String arg1) {
        homePage.typeTextField1(arg1);
    }

    @When("^user enters \"([^\"]*)\" in second field$")
    public void user_enters_in_second_field(String arg1) {
        homePage.typeTextField2(arg1);
    }

    @When("^clicks in Compute Sum$public void user_is_on_Application_Home_Page() {
        assertTrue(homePage.isHomePage());
        // Write code here that turns the phrase above into concrete action
    }")
    public void clicks_in_Compute_Sum() {
        homePage.clickButton();
    }



    /*@Then("^user sees computed sum as \"([^\"]*)\"$")
    public void user_sees_computed_sum_as(String arg1) {
    }*/
}
