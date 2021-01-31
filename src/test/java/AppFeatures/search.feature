Feature:  Amazon product

Scenario: Search a Product MacBook pro

Given i have a search field on amazon page
When i search for a product name with "Apple MacBook Pro" and price 1000
Then product with name "Apple MacBook Pro" should be displayed
Then order id is 3184 and username is "Swamyshiva"



Scenario: Search a Product Iphone

Given i have a search field on amazon page
When i search for a product name with "Apple MacBook Pro" and price 1000
Then product with name "Apple MacBook Pro" should be displayed
Then order id is 3184 and username is "Swamyshiva"