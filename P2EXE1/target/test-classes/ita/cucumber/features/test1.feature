@test1
Feature: South Coast Nautical Supplies
	#As a user
	#I want to buy a book
	#So that I don't have to go outside my home
	Scenario: chose a title
	Given I have the book
	When I buy a book
	Then the result should be true