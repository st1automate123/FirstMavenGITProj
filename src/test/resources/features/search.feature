@search @TU-123 @sprint-14
Feature: Search
@searchexamples1
Scenario Outline: Verify Search with valid product name
Given I am on Home page
When I search with valid "<searchTerm>"
Then Valid search rearch results should be displayed
#Then I should see valid "<searchResults>"

Examples:
|searchTerm|searchResults|
|Kids                         |https://tuclothing.sainsburys.co.uk/c/kids/kids?INITD=GNav-CW-Header&|
#|Pink                        |https://tuclothing.sainsburys.co.uk/search?text=Pink|
#|138038829                   |https://tuclothing.sainsburys.co.uk/search?text=138038829|
#|Yellow Oversized Knitted Top|https://tuclothing.sainsburys.co.uk/search?text=Yellow+Oversized+Knitted+Top|
#|Coats And Jackets           |https://tuclothing.sainsburys.co.uk/search?text=Coats+And+Jackets|

@searchexamples2
Scenario Outline: Verify Search with valid product name
Given I am on Home page
When I search with invalid "<keyword>"
Then I should see the appropriate pages accordingly
Examples:
|keyword|
|&&**^^ |
#|sdik   |
#|11111111111|


#
#@search2
#Scenario: Verify search with invalid product name
#Given I am on Home page
#When I search with invalid product name
#Then I should see no results found page
#
#@search3
#Scenario: Verify search wiht valid product category
#Given I am on Home page
#When I search with valid product category
#Then I should see related category products
#
#@search4
#Scenario: Verify search wiht invalid product category
#Given I am on Home page
#When I search with invalid product category
#Then I should see the randomn products for invalid product category
#
#@search5
#Scenario: Verify search with valid product number
#Given I am on Home page
#When I search with valid product number
#Then I should see the product number related products
#
#@search6 
#Scenario: Verify search with invalid product number
#Given I am on Home page
#When I search with invalid product number
#Then I should see no results found page for invalid product number
#
#@search7
#Scenario: Verify search with blank field
#Given I am on Home page
#When I leave search text box blank
#Then I should be prompted to fill the blank search field
#
#@search8
#Scenario: Verify search with special charecters
#Given I am on Home page
#When I search with special charecters
#Then I should see the randomnly displayed products
#
#@search9
#Scenario: Verify search with colour
#Given I am on Home page
#When I search with product colour
#Then I should see colour related products
#
#@search10
#Scenario: Verify search with a product description
#Given I am on Home page
#When I search with a product description
#Then I should see the related products for product description
#



