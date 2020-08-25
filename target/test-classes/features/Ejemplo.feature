Feature: Make purchases of items
As a new customer
I want to enter the http://automationpractice.com/index.php
To make a purchase of an item

Scenario: Add items to the shopping cart
  Given that a new customer accesses the purchasing website
  When he adds a unir of Faded Short Sleeve T-shirts to the cart
  Then he sees the products listed in the shopping cart
