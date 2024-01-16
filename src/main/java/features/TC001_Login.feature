Feature: Login Action
Scenario: On Successful Login display a message Login Successful
Given user is on homepage
When user clicks on Signin link
Then validate the title
When user enters username
And user enters password
And clicks on Submit button
Then valid user display message Login successful
And logout 

Scenario: Login with invalid data validate error message is displayed
Given user is on homepage
When user clicks on Signin link
When user enters invalid username and valid password
And clicks on Submit button
Then check for error message
When user enters valid username and invalid password
Then check for error message
And logout 