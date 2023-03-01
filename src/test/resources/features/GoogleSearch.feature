Feature: Google search testing

  Scenario: Validate google search is working

    Given Google home page is open
    When user enters a text a google search box
    Then user is navigated to the Search Result page