Feature: check the homepage

Background: Login 
		Given User enters1 Username
    When User enters2 Password
    When User click on Login
    When User enters3 TOTP
    And User click on submit


#Scenario: Verify all UIElements are present	
#		Given Verify UIElements are present
@demo			
Scenario: Verify Toast message
Given 	Buy a share from watchlist
When Get text from Toast Message	
		

