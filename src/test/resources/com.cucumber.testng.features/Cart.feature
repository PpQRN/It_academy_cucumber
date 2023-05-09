@smoke
Feature: As a user
  I want to get ability to use cart
  So that I can by stuff

  Background:
    Given the user opened onliner catalog page

  Scenario: Docs sections should contains appropriate columns
    When the user clicks on catalog "Электроника"
    And the user clicks on section "Аудиотехника"
    And the user clicks on product "Наушники"
    And the user clicks on first product Title
    And the user clicks on В корзину
    And the user clicks on Перейти в корзину
    Then page with chosen product in cart is opened
    And produt name is the same as at product page











