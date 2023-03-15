package com.solvd.posteducationtaskscucumber.saucedemo.steps;

import com.qaprosoft.carina.core.foundation.cucumber.CucumberRunner;
import com.solvd.posteducationtaskscucumber.saucedemo.db.domain.Product;
import com.solvd.posteducationtaskscucumber.saucedemo.db.domain.User;
import com.solvd.posteducationtaskscucumber.saucedemo.gui.pages.*;
import com.solvd.posteducationtaskscucumber.saucedemo.db.service.UserService;
import com.solvd.posteducationtaskscucumber.saucedemo.db.service.impl.UserServiceImpl;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class SauceDemoSteps extends CucumberRunner {

    User user = null;

    LogInPage logInPage = null;
    ProductPage productPage = null;
    YourCartPage yourCartPage = null;
    YourInformationPage yourInformationPage = null;
    OverviewPage overviewPage = null;
    CompletePage completePage = null;

    @Given("^I am on Login page$")
    public boolean iAmOnLoginPage() {
        logInPage = new LogInPage(getDriver());
        logInPage.open();
        return logInPage.isPageOpened();
    }

    @When("^I enter user name$")
    public void enterUserName() {
        UserService userService = new UserServiceImpl();
        user = userService.readAll(2L);

        logInPage.enterUserName(user.getUserName());
    }

    @And("^I enter password$")
    public void enterPassword() {
        logInPage.enterPassword(user.getPassword());
    }

    @And("^I click on Login button$")
    public void clickLoginButton() {
        productPage = logInPage.clickLoginButton();
    }

    @Then("^page Product should be open$")
    public void pageProductShouldBeOpen() {
        Assert.assertTrue(productPage.isPageOpened(), "Product page isn't open");
    }

    @When("^I add products in shopping cart according database$")
    public void addProductInShoppingCart() {
        user.getOrders().stream()
                .flatMap(order -> order.getProducts().stream())
                .map(Product::getTitle)
                .forEach(productTitle -> productPage.clickAddToCartButton(productTitle));
    }

    @And("^click Shopping cart button$")
    public void clickShoppingCartButton() {
        yourCartPage = productPage.clickShoppingCartButton();
    }

    @Then("^page Your cart page should be open")
    public void shoppingPageShouldBeOpen() {
        Assert.assertTrue(yourCartPage.isPageOpened(), "Your cart page isn't open");
    }

    @When("^I click Checkout button$")
    public void clickCheckoutButton() {
        yourInformationPage = yourCartPage.clickCheckoutButton();
    }

    @Then("^page Your information page should be open$")
    public void yourInformationPageShouldBeOpen() {
        Assert.assertTrue(yourInformationPage.isPageOpened(), "Your information page isn't open");
    }

    @When("^I enter first name, last name and zip code$")
    public void enterFirstNameLastNameZipCode() {
        yourInformationPage.enterFirstName(user.getFirstName());
        yourInformationPage.enterLastName(user.getLastName());
        yourInformationPage.enterZipCode(user.getZipCode());
    }

    @And("^click Continue button$")
    public void clickContinueButton() {
        overviewPage = yourInformationPage.clickContinueButton();
    }

    @Then("^page Overview should be open$")
    public void pageOverviewShouldBeOpen() {
        Assert.assertTrue(overviewPage.isPageOpened(), "Overview page isn't open");
    }

    @And("^click Finish button$")
    public void clickFinishButton() {
        completePage = overviewPage.clickFinishButton();
    }

    @Then("^page Complete should be open$")
    public void pageCompleteShouldBeOpen() {
        Assert.assertTrue(completePage.isPageOpened(), "Complete page isn't open");
    }

    @And("^I see text Thank you for your order!$")
    public void textThankYouForYourOrderIsPresent() {
        Assert.assertTrue(completePage.isPresentCompleteText(), "Complete text isn't present");
    }

    @Given("^I am on login page$")
    public boolean onLoginPage() {
        logInPage = new LogInPage(getDriver());
        logInPage.open();
        return logInPage.isPageOpened();
    }

    @When("^I enter locked_out_user name$")
    public void enterLockedOutUserName() {
        UserService userService = new UserServiceImpl();
        user = userService.readAll(3L);

        logInPage.enterUserName(user.getUserName());
    }

    @And("^I enter secret_sauce password$")
    public void enterSecretSaucePassword() {
        logInPage.enterPassword(user.getPassword());
    }

    @And("^I click on login button$")
    public void clickOnLoginButton() {
        productPage = logInPage.clickLoginButton();
    }

    @Then("^page product should not be open$")
    public void pageProductShouldNotBeOpen() {
        Assert.assertFalse(productPage.isPageOpened(), "Product page is open");
    }

    @And("^I see text - Sorry, this user has been locked out.$")
    public void seeTextSorryThisUserHasBeenLockedOut() {
        Assert.assertTrue(logInPage.isLockedOutTextPresent(), "Locked out text isn't present");
    }

    @Given("^I am on Login Page$")
    public boolean amOnLoginPage() {
        logInPage = new LogInPage(getDriver());
        logInPage.open();
        return logInPage.isPageOpened();
    }

    @When("^I enter problem_user name$")
    public void enterProblemUserName() {
        UserService userService = new UserServiceImpl();
        user = userService.readAll(4L);

        logInPage.enterUserName(user.getUserName());
    }

    @And("^I enter secret sauce password$")
    public void iEnterSecretSaucePassword() {
        logInPage.enterPassword(user.getPassword());
    }

    @And("^I click on Login Button$")
    public void iClickOnLoginButton() {
        productPage = logInPage.clickLoginButton();
    }

    @Then("^page product should be open$")
    public void productPageShouldBeOpen() {
        Assert.assertTrue(productPage.isPageOpened(), "Product page isn't open");
    }

    @When("^I add products in Shopping cart according database$")
    public void iAddProductsInShoppingCartAccordingDatabase() {
        user.getOrders().stream()
                .flatMap(order -> order.getProducts().stream())
                .map(Product::getTitle)
                .forEach(productTitle -> productPage.clickAddToCartButton(productTitle));
    }

    @And("^Click Shopping cart button$")
    public void iClickShoppingCartButton() {
        yourCartPage = productPage.clickShoppingCartButton();
    }

    @Then("^Page Your cart page should be open$")
    public void pageYourCartPageShouldBeOpen() {
        Assert.assertTrue(yourCartPage.isPageOpened(), "Your cart page isn't open");
    }

    @When("^Click Checkout button$")
    public void iClickCheckoutButton() {
        yourInformationPage = yourCartPage.clickCheckoutButton();
    }

    @Then("^Page Your information page should be open$")
    public void pageYourInformationPageShouldBeOpen() {
        Assert.assertTrue(yourInformationPage.isPageOpened(), "Your information page isn't open");
    }

    @When("^I can enter first name and zip code, but I can't enter last name$")
    public void iCanEnterFirstNameAndZipCodeButICanTEnterLastName() {
        yourInformationPage.enterFirstName(user.getFirstName());
        yourInformationPage.enterLastName(user.getLastName());
        yourInformationPage.enterZipCode(user.getZipCode());
        Assert.assertEquals(yourInformationPage.getLastNameText(), "",
                "Last name enter in Last name field");
    }
}
