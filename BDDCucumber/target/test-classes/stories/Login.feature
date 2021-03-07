Feature: Login into Service Now 

Background: 
	Given Launch browser 
	And Load the URL 
	
Scenario: Login Positive 
	When user enter the username as "admin"
	And user enter the password as "JKaHY8lub4pL" 
	And user clicks the login button 
	Then user must see the dashboard page 
	
Scenario: Login Negative 
	When user enter the username as "koushik" 
	And user enter the password as "somepass" 
	And user clicks the login button 
	But login should fail 
	