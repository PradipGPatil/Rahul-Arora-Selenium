Feature: as A user when i enter correct username and password , I should able to login

  Scenario: Login to the facebook with valid username and password

    Given when user enter the url
    When User validate Home page title
    Then user enter "valid" username
    And user enter "valid" password
    And User click on Sign in Button
    
      Scenario: Login to the facebook with invalid username and invalid password

    Given when user enter the url
    When User validate Home page title
    Then user enter "invalid" username
    And user enter "invalid" password
    And User click on Sign in Button
