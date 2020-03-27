Feature: SauceDemo logout
  As a User logged into sauce demo
  I want to logout the application
  So I can login with other users

  Scenario Outline: User can login and logout successfully
    Given I navigate to Login Page
    When I log into the site with credentials <credentials>
    And I log out from the application
    Then I will be logged out from the application

    Examples:
      | credentials                          |
      | standard_user:secret_sauce           |
      | problem_user:secret_sauce            |
      | performance_glitch_user:secret_sauce |
