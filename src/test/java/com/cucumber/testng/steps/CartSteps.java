package com.cucumber.testng.steps;

import It_academy_cucumberProject.driver.DriverManager;
import It_academy_cucumberProject.pageobject.CatalogPage;
import It_academy_cucumberProject.pageobject.ProductPage;
import com.codeborne.selenide.WebDriverRunner;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.After;

import static org.assertj.core.api.Assertions.*;

import static com.codeborne.selenide.Selenide.open;

public class CartSteps {
    private String productTitleOnProductPage;
    private final ProductPage productPage = new ProductPage();
    private final CatalogPage catalogPage = new CatalogPage();

    @Given("the user opened onliner catalog page")
    public void userOpenedOnlinerCatalogPage() {
        DriverManager.initDriver("chrome");
        open("https://catalog.onliner.by/");
    }


    @When("the user clicks on catalog {string}")
    public void userClicksOnCatalog(String button) {
        catalogPage.clickOnCatalogClassifierButton(button);
    }


    @And("the user clicks on section {string}")
    public void userClicksOnSection(String section) {
        catalogPage.clickOnCatalogClassifierCategoryLink(section);
    }

    @And("the user clicks on product {string}")
    public void userClicksOnProduct(String product) {
        catalogPage.clickOnProductLink(product);
    }

    @And("the user clicks on first product Title")
    public void userClicksOnFirstProductTitle() {
        productPage.clickOnProductTitle();
    }

    @And("the user clicks on В корзину")
    public void userClicksOnAddToCart() {
        productTitleOnProductPage = productPage.getProductTitle().text();
        productPage.clickOnAddToCartButton();
    }

    @And("the user clicks on Перейти в корзину")
    public void userClicksOnGoToCart() {
        productPage.clickOnGoToCartButton();
    }

    @Then("page with chosen product in cart is opened")
    public void pageWithChosenProductInCartIsOpened() {
        assertThat(WebDriverRunner.url()).isEqualTo("https://cart.onliner.by/");

    }

    @And("produt name is the same as at product page")
    public void productNameIsTheSameAsAtProductPage() {
        assertThat(productPage.getProductTitleInCart().text()).isEqualTo(productTitleOnProductPage);
    }

    @And("the user clicks on Продолжить покупки")
    public void theUserClicksOnПродолжитьПокупки() {
        productPage.clickOnContinueShopping();
    }

    @And("the user clicks on cart icon")
    public void theUserClicksOnCartIcon() {
        productPage.clickOnCartIcon();
    }
}
