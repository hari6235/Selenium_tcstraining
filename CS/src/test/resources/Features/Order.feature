#Author: xyz@yahoo.com
#Keywords Summary : Place Order from tutorialsNinja site

Feature: Place Order
  I want to Place an order from tutorialsNinja

  Scenario: Search Single Item
    Given User is on Homepage
    And User search for an item "Macbook Air"
    Then item must be displayed
    
     
  Scenario: Checkout the order
    When User do checkout
    Then Should navigate to checkout page
