#Author: hari6235@yahoo.com

Feature: As a User
  I want to do a search on Google
  To find relevant information

  Scenario: Google Search
    Given Google page launch successful
    Then Search for "Selenium"
    And Close the browser

  
