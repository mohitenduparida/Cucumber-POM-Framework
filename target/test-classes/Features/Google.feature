@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
  Scenario Outline: Title of your scenario
    Given User launches browser and opens Google
    Then User is in Google Home page
    Then Enters the search text "<Animal>"
    Then User clicks on search button
    Then User clicks on third link in search results for "<Animal>"
    And User is on the "<Animal>" page

    Examples: 
      | Animal |
      | Dog    |
      | Cat		 |
      |Elephant| 
