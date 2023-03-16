package com.solvd.posteducationtaskscucumber.saucedemo;

import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.solvd.posteducationtaskscucumber.saucedemo.db.domain.Product;
import com.solvd.posteducationtaskscucumber.saucedemo.db.domain.User;
import com.solvd.posteducationtaskscucumber.saucedemo.db.service.UserService;
import com.solvd.posteducationtaskscucumber.saucedemo.db.service.impl.UserServiceImpl;
import com.solvd.posteducationtaskscucumber.saucedemo.gui.pages.*;
import org.openqa.selenium.Cookie;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SauceDemoProxyManTest extends AbstractTest {

    User user = null;

    @Test
    public void sampleProxyManTest() {
        LogInPage logInPage = new LogInPage(getDriver());
        logInPage.open();
        logInPage.addCookie(new Cookie("session-username", "standard_user"));

        ProductPage productPage = new ProductPage(getDriver());
        productPage.open();
        Assert.assertTrue(productPage.isPageOpened(), "Product page isn't open");

        UserService userService = new UserServiceImpl();
        user = userService.readAll(1L);

        user.getOrders().stream()
                .flatMap(order -> order.getProducts().stream())
                .map(Product::getTitle)
                .forEach(productPage::clickAddToCartButton);

        YourCartPage yourCartPage = productPage.clickShoppingCartButton();

        YourInformationPage yourInformationPage = yourCartPage.clickCheckoutButton();
        yourInformationPage.enterFirstName(user.getFirstName());
        yourInformationPage.enterLastName(user.getLastName());
        yourInformationPage.enterZipCode(user.getZipCode());

        OverviewPage overviewPage = yourInformationPage.clickContinueButton();

        CompletePage completePage = overviewPage.clickFinishButton();
        Assert.assertTrue(completePage.isPresentCompleteText(), "Complete text isn't present");
    }
}
