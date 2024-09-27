package org.example.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.HomePage;
import org.junit.Assert;

public class HomePageSteps {
    private final HomePage homePage = new HomePage();

    @Given("I am on the home page")
    public void iAmOnTheHomePage() {
        homePage.navigateTo("https://example.com");
    }
}