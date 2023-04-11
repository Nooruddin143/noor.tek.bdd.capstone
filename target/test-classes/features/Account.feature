Feature: Retail Account Page

  Background: 
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'noor@gmail.com' and password 'Noor@123'
    And User click on login button
    Then User should be logged in into account
    When User click on Account option
@test
  Scenario: Verify User can update Profile Information
    And User update Name 'Ahmad' and Phone '1234567891'
    And User click on Update button
    Then user profile information should be updated

  
  Scenario: Verify user can update password
    When User click on Account option
    And User enter below information
      | previousPassword | newPassword | confirmPassword |
      | Noor@123     | Noor@143    | Noor@143        |
    And User click on Change Password button
    Then a message should be displayed 'Password Updated Successfully'
