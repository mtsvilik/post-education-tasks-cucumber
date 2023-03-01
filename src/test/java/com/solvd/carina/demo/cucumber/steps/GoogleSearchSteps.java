package com.solvd.carina.demo.cucumber.steps;

import com.qaprosoft.carina.core.foundation.webdriver.IDriverPool;
import com.solvd.carina.demo.gui.page.GoogleHomePage;
import com.solvd.carina.demo.gui.page.SearchResultPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class GoogleSearchSteps implements IDriverPool {

    GoogleHomePage googleHomePage = null;

    SearchResultPage searchResultPage = null;

    @Given("Google home page is open")
    public void homePageIsOpen() {
        googleHomePage = new GoogleHomePage(getDriver());
        googleHomePage.open();
        Assert.assertTrue(googleHomePage.showLogo(), "Home page isn't open");
    }

    @When("user enters a text a google search box")
    public void enterText() {
        googleHomePage.inputText("iphone");
        searchResultPage = googleHomePage.clickEnter();
    }

    @Then("user is navigated to the Search Result page")
    public void navigateToSearchResultPage() {
        SoftAssert softAssert = new SoftAssert();
        searchResultPage.getSearchResultElements()
                .forEach(searchResultElement -> softAssert.assertTrue(searchResultElement.getTitleText()
                                .toLowerCase().contains("iphone"),
                        "searchResultElement.getTitleText() doesn't contain text 'iphone' "));

        softAssert.assertAll();
    }
}
