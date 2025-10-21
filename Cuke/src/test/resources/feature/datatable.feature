@datatable
Feature: as A user when i enter correct username and password , I should able to login

  Scenario Outline: Login to the facebook with users on Production
    Given when user enter the url
    When User validate Home page title
    Then user enter "valid" username
    And user enter "invalid" password
    And User click on check of captcah image
    And user enter firstName and LastName
      | firstName | LastName |
      | Pradip    | Patil    |
      | Matt      | handary  |
    And User click on Sign in Button
