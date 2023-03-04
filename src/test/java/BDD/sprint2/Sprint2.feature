Feature: View Subscription plans
	User can see Subscription plans

	Background: Login process
  	Given User launch the chrome browser
  	When User opens URL "https://unacademy.com/goal/jee-main-and-advanced-preparation/TMUVD"
  	And User choose the login button
  	And User enters the mobile number
  	Then the page should be opened successfully
  
  
  Scenario Outline: Using Search bar
  	Given user clicks on search button
  	And user fill in the field "<courses>"
  	And user clicks on search button
  	Examples:
  		|courses | 
  		|neet    | 
  		|ssc je  |
  
  Scenario: Searching for educators
    Given user clicks on search button
    When user search for the following criteria
      | Educators Name | Course Name|
      | Shashank       | JEE        |
      | Amith          | NEET       |
      | Paul           | JE         |
    Then user should see search results for each educators
    
 	@hello
	Scenario: View subscription plan
  	Given User select the View Subscription plans option
		And User choose the get lite option
		And User choose the proceed to pay option
		And User select the UPI option
		And User enter UPI details
		And User click the pay button
		Then User should see the popup message.
	
	
	Scenario: Subscription process using get plus plan
		Given User select the View Subscription plans option
		And User choose the get plus option
		And User choose the proceed to pay option
		And User select the credit card payment option
		Then User should see the payment section
	
	
	Scenario: Subscription process using get iconic plan
		Given User select the View Subscription plans option
		And User choose the get iconic option
		And User choose the proceed to pay option
		And User choose the EMI pay option
		And User choose a plan option
		Then User should see the EMI details
	
		
	Scenario: Subscription process using choose center
		Given User select the View Subscription plans option
		And User choose the choose center option
		And User choose the view batches option
		Then User should see the batches details
		


