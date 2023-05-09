package com.cucumber.testng.hooks;

import It_academy_cucumberProject.pageobject.ProductPage;
import io.cucumber.java.After;

import static com.codeborne.selenide.Selenide.open;

public class ClearCartHook {
    private final ProductPage productPage = new ProductPage();

    @After
    public void clearCart() {
        open("https://catalog.onliner.by/");
        productPage.clickOnCartIcon();
        productPage.clickOnRemoveIcon();
    }
}
