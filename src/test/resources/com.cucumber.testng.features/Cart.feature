@smoke
Feature: As a user
  I want to get ability to use cart
  So that I can by stuff

  Background:
    Given the user opened onliner catalog page

  Scenario: You should be able to chose product and find it in cart right after adding it there
    When the user clicks on catalog "Электроника"
    And the user clicks on section "Аудиотехника"
    And the user clicks on product "Наушники"
    And the user clicks on first product Title
    And the user clicks on В корзину
    And the user clicks on Перейти в корзину
    Then page with chosen product in cart is opened
    And produt name is the same as at product page

  Scenario: You should be able to chose product and find it in cart after adding it there and browsing after that
    When the user clicks on catalog "Электроника"
    And the user clicks on section "Аудиотехника"
    And the user clicks on product "Наушники"
    And the user clicks on first product Title
    And the user clicks on В корзину
    And the user clicks on Продолжить покупки
    And the user clicks on cart icon
    Then page with chosen product in cart is opened
    And produt name is the same as at product page













