Feature: EndToEnd

@clickandcollect
Scenario: Verify functionality of end to end for click and collect
Given I am on Product details page
When  I add product to basket by selecting size and quantity
Then  Product should be added to the basket
And   I click on proceed to checkout
And   I checkout as a guest by provding email
And   I select "click and collect" option and continue
And   I select nearest store and go to order summary page
And   I enter biling details on payment page
And   I click on payment button
Then  I should get payment confirmation


