Feature: Change App Settings

  @reg
  Scenario: User should be able to navigate to weather home page and validate on displayed rain and waterdrop icons
    Given user is on weather app setting page
    When user clicks done button
    And user clicks on got it button
    Then user is on weather app home page
    And validate on displayed weather home page rain and waterdrop icons

  @reg
  Scenario: User should be able to navigate to weather settings
    Given user is on weather app home page
    When user clicks on navigation menu
    And user clicks on unit setting option
    Then user is on weather app setting page


  @reg
  Scenario Outline: User should be able to change the temperature
    Given user clicks on weather temperature dropdown
    When user changes the temperature "<temp value>"
    Then validate updated temperature "<temp value>" changes

    Examples:
      | temp value |
      |     C      |
      |     F      |

  @reg
  Scenario Outline: User should be able to change the time format
    Given user clicks on time format dropdown
    When user changes the time "<Time value>"
    Then validate updated time format "<Time value>" changes

    Examples:
      |  Time value  |
      |   24 Hour    |
      |   12 Hour    |