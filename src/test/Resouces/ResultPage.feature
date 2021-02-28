Feature: ResultPageFunctionalities

  Background:

    Given User is on the home page of the argos website
    When User types nike in the search box
    And User clicks on search button
    Then User should be able to see all the nike products

    Scenario: Click on  5 - 10 pounds price rage

      Given User is on the result page of the argos website
      When Users clicks on  five pound to ten pound price range check box
      Then USer should be able to see all the items within that price rage

