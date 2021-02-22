@basket
Feature: Basket
Background:
Given I am on Home page
When I search for a product "Pink Check Shirt" and add to the basket

@basket1
Scenario: Verify functionality to add product to basket
When I search for a product "Mint Green Slouchy Jumper Dress" and add to the basket
And  I click on checkout 
Then I should see basket page is displayed
When I delete one product from the baket page
Then I should see one product deleted from the basket