Feature: User Authentication
  As a registered user
  I want to log in to the system
  So that I can access my account
  
  Scenario: Valid User Login
    Given I am on the login page
    When I enter valid credentials
    And I click the login button
    Then I should be redirected to the dashboard
    And I should see a welcome message
