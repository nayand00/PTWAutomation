Feature: user login mechanism
  As a user in order to get all benefits from bestbuy ecomerce 
  I want to login successfully

  @nr
Scenario Outline: Landing on bestbuy page
    Given I open browser as "<option>"
   	And I land on bestbuy page
    When I complete Login With valid credientials
    #When I complete Login With "<User>" and "<Password>"
    #Then I want to verify bestbuy logo
   	#Then I verify name of the user displayed successfully
   	#Then I want to see all top table link
    #And I expect top all table link working
    #Then I do search some products for shopping
    And I want to see my cart for finalizing my shopping
    #Then I do search for different options
    #Then I expect to see outer left table link working
    #And I expect to see outer right table link working
    #And I want to see all footer option
    #And I want to do scroll up and scroll downn 
    #Then I want see trending now right arrow untill visible
    #And I want to switch socail page
    
Examples: 
      | option |
      | Chrome |
         #| User    | Password  |
         #| UserID1 | Password1 |
