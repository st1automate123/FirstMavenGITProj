Feature: Registration
@regWithMap
Scenario: Verify Registration functionality with valid details
Given I am on Home page
When I click on TU/Login Register
And  I enter values in all the fields
|email        |abcd@gmail.com|
|title        |mrs|
|firstname    |ss| 
|surname      |sr|
|password     |ss12345|
|confirmpassword|ss12345|
|nectarone      |55555|
|nectartwo      |4444 |
And  I click on complete registration
Then My account page should be displayed








@regWithList
Scenario: Verify Registration functionality with valid details
Given I am on Home page
When I click on TU/Login Register
And  I fill details of register form      
|abcd@gmail.com|mrs|Swa|Seem|ss12345|ss12345|55555|4444|
And  I click on complete registration
Then My account page should be displayed

@regWithListOfMap
Scenario: Verify Registration functionality with valid details
Given I am on Home page
When I click on TU/Login Register
And  I fill details of register form using list with header
|email         |title|firstname|surname|password|confirmpassword|nectarone|nectartwo|  
|abcd@gmail.com| mrs |  Swa    |  Seem | ss12345|  ss12345      |  55555  |  4444   |
#|efgd@gmail.com| mrs |  Edg    |  Klop | klop345|  kl  345      |  66666  |  9999   |
And  I click on complete registration
Then My account page should be displayed




