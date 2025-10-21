
@prod
Feature: as A user when i enter correct username and password , I should able to login

  #Scenario: Login to the facebook with valid username and password
  #
  #Given when user enter the url
  #When User validate Home page title
  #Then user enter "valid" username
  #And user enter "valid" password
  #And User click on Sign in Button
  #Scenario: Login to the facebook with invalid username and invalid password
  #
  #Given when user enter the url
  #When User validate Home page title
  #Then user enter "invalid" username
  #And user enter "invalid" password
  #And User click on Sign in Button
  Scenario Outline: Login to the facebook with users on Production
    Given when user enter the url
    When User validate Home page title
    Then user enter "<username>" username
    And user enter "<password>" password
    And User click on check of captcah image
    And User click on Sign in Button

    Examples: 
      | username | password |
      | valid    | valid    |
      | valid    | invalid  |
      | invalid  | valid    |
      | invalid  | invalid  |
