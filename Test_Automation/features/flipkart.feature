#Author: sanjay.yerrolla@gmail.com

Feature: Flipkart Automation

	Scenario: getting the price and specifications of Samsung fold z mobile Phantom Black		
		Given User Navigates to Fipkart URL "https://www.flipkart.com/"
		When User search for "Samsung Z fold 4"
		And User clicks on Samsung Z fold	"Phantom Black 512 GB"
		Then User validate the specifications and price
		