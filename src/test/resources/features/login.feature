Feature: Sign in feature of Tek Retail WebSite

  Background: 
    Given User is on retail website
    When User click on Sign in option

 @createAccountTest
  Scenario: Verify User can sign in into Tek Retail application
    And User enter email 'nooruddin.mohammadi@gmail.com' and password 'Noorkhan@143'
    And User click on login button
    Then User should be logged in into account

  
  Scenario: Verify user can create an account into Retail Website
    And User click on Create New Account button
    And User fill the signUp information with below data
      | name     | email | password     | confirmPassword |
      | fullName | email | Noorkhan@143 | Noorkhan@143    |
    And User click on SignUp button
    Then User should be logged into account page
