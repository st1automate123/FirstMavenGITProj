Feature: Store Locator
@store1
Scenario Outline: Verify store locator with valid town
Given I am on Home page
When I click TU store locator link
And I enter post code as "<postcode>"
And I clicks on find stores
Then It should display the nearest stores
Examples:
|postcode |
|Cambridge|
|CB1 9YD  |

@store2
Scenario Outline: Verify store locator with invalid postcode or town
Given I am on Home page
When I click TU store locator link
And I enter post code as "<postcode>"
And I clicks on find stores
Then It should display warning message to enter valid postcode or town
Examples:
|postcode|
|123456|
|Delhi|

Scenario: Verify store locator without entering any keywords on the field
Given I am on Home page
When I click TU store locator link
And I enter post code as ""
And I clicks on find stores
Then I should get an error message to fill the store locator field

Scenario: Verify store locator for click and collect
Given I am on Home page
When  I click TU store locator link
And   I enter post code as "Cambridge"
And   I select click and collect
And   I clicks on find stores
Then  It should display nearest stores with click and collect options

Scenario: Verify store locator that stock clothing
Given I am on Home page
When  I click TU store locator link
And   I enter post code as "Cambridge"
And   select checkbox for only show stores that stock clothing and tick checkbox womens
And   I clicks on find stores
Then  It should display store that stock clothing
