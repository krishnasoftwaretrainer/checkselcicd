Feature: Login Functionality 
Scenario Outline: SwagLabs All Login

Given user is on Swag Labs Login Page 
When user enters  username "<username>"
And user enters  password "<pasword>"
And user clicks on swag login button
Then user should be redirect to Swaglabs Products page

Examples:

|username| pasword|
|standard_user|secret_sauce|
|standard_user|invalid_password|
|invalid_user|secret_sauce|
|invalid_user|invalid_password|

