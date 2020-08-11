@canaryLogin
Feature: canary login

  @login
  Scenario Outline: valid user login with valid credentials and append a comment
    Given user login in the UI
    When user entered the valid password "<id>" "<password>"
    Then User is able to login
    Then User append a comment
    Examples:
      | id                 | password        |
      | sajanhoj@gmail.com | 2XdHt9eL5UdwWMe!|
