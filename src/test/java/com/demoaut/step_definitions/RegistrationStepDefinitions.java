package com.demoaut.step_definitions;

import com.demoaut.pages.RegistrationPage;
import cucumber.api.java.en.*;

import java.util.Map;

public class RegistrationStepDefinitions {
    RegistrationPage registrationPage = new RegistrationPage();

    @Given("user is on the landing page")
    public void user_is_on_the_landing_page() {

    }

    @When("user clicks on the {string} link")
    public void user_clicks_on_the_link(String string) {

    }

    @Then("user enters registration information:")
    public void user_enters_registration_information(Map<String, String> dataTable) {

    }

    @Then("clicks {string} button")
    public void clicks_button(String string) {

    }
}
