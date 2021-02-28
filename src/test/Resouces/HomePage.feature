Feature: HomePage Functionality


  Scenario: Search for individual product
  Given User is on the home page of the argos website
  When User types nike in the search box
  And User clicks on search button
  Then User should be able to see all the nike products

  @AccountButtonClick
    Scenario: Click On Account Button
    Given User is on the home page of the argos website
    When User Click on the Account Button
    Then User should be able to nevigate on  Account page
@MultipleSearch
    Scenario Outline: : Search for multipale product
      Given User is on the home page of the argos website
      When  User search for "<products>"
      Then  User should be able to see all the products related to searched
      Examples:
      |products|
      |Nike    |
      |Puma    |






