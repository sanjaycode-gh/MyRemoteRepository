

Feature: Linkedin Automation

  @Login
  Scenario: Login to Linkedin
    Given User is on Linkedin URL "https://www.linkedin.com/"
    When User enters username "sanjay.yerrolla@gmail.com"
    And User enters password ""
    And User logs in
    Then User should be on the linkedin home page   

