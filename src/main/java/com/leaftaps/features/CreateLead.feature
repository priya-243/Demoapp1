Feature: Verifying the Create Lead funtionality of the CRM application 
Scenario Outline: The user tries to create new lead with the valid credentials 
	When the user enters the username as "DemoCsr"
	And the user enters the password as "crmsfa" 
	And the user clicks the login button 
	And click on CRM/SFA link
	And click on leads module
	And click on create lead button
	And enter first name as <firstname>
	And enter last name as <lastname>
	And enter company name as <companyname>
	Then click on create button in leadpage
	
	Examples:
|firstname|lastname|companyname|
|"Priya"|"R"|"Maersk"|
|"jashu"|"T"|"Prodapt"|
