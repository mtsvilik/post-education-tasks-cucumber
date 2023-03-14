Feature: SauceDemo testing
  Successful Log in and add orders and make sure that ordering was successful

  Scenario: Test with standart_user
    Given I am on Login page
    When I enter user name
    And I enter password
    And I click on Login button
    Then page Product should be open
    When I add products in shopping cart according database
    And click Shopping cart button
    When page Your cart page should be open
    When I click Checkout button
    Then page Your information page should be open
    When I enter first name, last name and zip code
    And click Continue button
    Then page Overview should be open
    And click Finish button
    Then page Complete should be open
    And I see text Thank you for your order!
