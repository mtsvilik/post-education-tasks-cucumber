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
    Then page Your cart page should be open
    When I click Checkout button
    Then page Your information page should be open
    When I enter first name, last name and zip code
    And click Continue button
    Then page Overview should be open
    And click Finish button
    Then page Complete should be open
    And I see text Thank you for your order!

  Scenario: Test with locked_out_user
    Given I am on login page
    When I enter locked_out_user name
    And I enter secret_sauce password
    And I click on login button
    Then page product should not be open
    And I see text - Sorry, this user has been locked out.

  Scenario: Test with problem_user
    Given I am on Login Page
    When I enter problem_user name
    And I enter secret sauce password
    And I click on Login Button
    Then page product should be open
    When I add products in Shopping cart according database
    And Click Shopping cart button
    Then Page Your cart page should be open
    When Click Checkout button
    Then Page Your information page should be open
    When I can enter first name and zip code, but I can't enter last name