@canaryLogin
Feature: canary login

  @login
  Scenario Outline: valid user login with valid credentials
    Given user login in the UI
    When user entered the valid password "<id>" "<password>"
    Then User is able to login
    Examples:
      | id                                      | password |
      | AIzaSyC4ROl9qH-_5k7KcKc6XHj3DpN90U-0AGc | asasas   |
