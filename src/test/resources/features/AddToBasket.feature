@addtobasket @TU-123 @sprint-14
Feature: Addtobasket

@addtobasket1 @smoke @regression
Scenario: Verify functionality to add product to basket
Given I am on Home page
#When I search for a product and select the product
When I search for a product "Pink Check Shirt" and select the product
Then I should see product details page
When I add the product to basket
Then Product should be added to the basket

@addtobasket2
Scenario: Verify the functionality by without selecting the size and quantity of the product
Given I am on Home page
#When I search for a product and select the product
When I search for a product "Pink Check Shirt" and select the product
Then I should see product details page
Then Add to basket should be disabled

@addtobasket3 @smoke @regression
Scenario: Verify functionality to add two products to basket
Given I am on Home page
When I search for a product "Pink Check Shirt" and select the product
When I add the product to basket
Then Product should be added to the basket
When I search for a product "Mint Green Slouchy Jumper Dress" and select the product
When I add the product to basket
Then Multiple products added to the basket



