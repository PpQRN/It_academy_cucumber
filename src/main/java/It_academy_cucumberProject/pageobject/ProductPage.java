package It_academy_cucumberProject.pageobject;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class ProductPage extends BasePage {
    private final ElementsCollection productName = $$x("//a[contains(@class, 'js-product-title-link')]");
    private final ElementsCollection productDescription = $$x("//span[contains(@data-bind, 'product.description')]");
    private final ElementsCollection productRating = $$x("//div[contains(@class, 'part_4')]//div[contains(@class, 'rating-group')]//a[contains(@class, 'schema-product')]");
    private final ElementsCollection productPrice = $$x("//div[contains(@class, 'product__price')]/a[contains(@class, 'js-product-price-link') and contains(@href, 'prices')]");
    private final ElementsCollection productImage = $$x("//a[contains(@class, 'image-link')]");
    private final ElementsCollection productCheckBox = $$x("//span[contains(@class, 'i-checkbox i-checkbox_yellow')]");
    private final ElementsCollection productsAll = $$x("//div[@class = 'schema-product__group']");
    private final SelenideElement productTitle = $x("//h1[@class = 'catalog-masthead__title js-nav-header']");
    private final SelenideElement goToCart = $x("//a[contains(text(), 'Перейти в корзину')]");
    private final SelenideElement removeIcon = $x("//a[contains(@class, 'remove')]");
    private final SelenideElement cartIcon = $x("//a[contains(@href, 'cart') and contains(@title, 'Корзина') ]");
    private final SelenideElement continueShopping = $x("//a[contains(@class, 'button') and contains(text(), 'Продолжить')]");
    private final SelenideElement productTitleInCart = $x("//a[contains(@href, 'catalog') and contains(@class, 'cart-form__link cart-form__link_primary cart-form__link_base-alter' )]");

    private static final ElementsCollection addToCartButtons = $$x("//a[@class = " +
            "'button-style button-style_base-alter button-style_primary product-aside__button product-aside__button_narrow " +
            "product-aside__button_cart button-style_expletive']");

    public ElementsCollection getProductNameList() {
        return productName;
    }

    public void clickOnRemoveIcon() {
        productTitleInCart.shouldBe(Condition.visible).hover();
        removeIcon.shouldBe(Condition.visible).click();
    }

    public SelenideElement getProductTitle() {
        return productTitle;
    }

    public void clickOnCartIcon() {
        cartIcon.shouldBe(Condition.visible).click();
    }

    public SelenideElement getProductTitleInCart() {
        return productTitleInCart;
    }

    public void clickOnGoToCartButton() {
        goToCart.shouldBe(Condition.visible).click();
    }

    public void clickOnContinueShopping() {
        continueShopping.shouldBe(Condition.visible).click();
    }

    public ProductPage clickOnAddToCartButton() {
        addToCartButtons.first().shouldBe(Condition.visible).click();
        return this;
    }

    public ProductPage clickOnProductTitle() {
        productName.first().shouldBe(Condition.visible).click();
        return this;
    }


//    public boolean isProductNameDisplayed() {
//        return isElementDisplayed(productName);
//    }

    public ElementsCollection getProductDescriptionList() {
        return productDescription;
    }

//    public boolean isProductDescriptionDisplayed() {
//        return isElementDisplayed(productDescription);
//    }

    public ElementsCollection getProductRatingList() {
        return productRating;
    }

//    public boolean isProductRatingDisplayed() {
//        return isElementDisplayed(productRating);
//    }

    public ElementsCollection getProductPriceList() {
        return productPrice;
    }

//    public boolean isProductPriceDisplayed() {
//        return isElementDisplayed(productPrice);
//    }

    public ElementsCollection getProductImageList() {
        return productImage;
    }

//    public boolean isProductImageDisplayed() {
//        return isElementDisplayed(productImage);
//    }

    public ElementsCollection getProductCheckBoxList() {
        return productCheckBox;
    }

//    public boolean isProductCheckBoxDisplayed() {
//        return isElementDisplayed(productCheckBox);
//    }

    //    public int countProducts() {
//        return selectElements(productsAll).size();
//    }
    public ElementsCollection getAllProducts() {
        return productsAll;
    }
}