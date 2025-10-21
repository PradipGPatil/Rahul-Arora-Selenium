
@stag
Feature: stage login

# if we have common step then we add this step in background
# before executing each scearnio background steps get executed

Background:
    Given when user enter the url
    When User validate Home page title

  Scenario: Login to the facebook with users on Staging

    Then user enter "valid" username
    And user enter "valid" password
    And User click on check of captcah image
    And User click on Sign in Button

  Scenario: Login to the facebook with users on Staging

    Then user enter "invalid" username
    And user enter "invalid" password
    And User click on check of captcah image
    And User click on Sign in Button
