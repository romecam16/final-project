Feature: SauceDemo Login
  As a User
  I want to log into SauceDemo
  So I can buy products

  Scenario Outline: User can login successfully
    Given I navigate to Login Page
    When I log into the site with credentials <credentials>
    Then I will be in Products Page

    Examples:
      | credentials                          |
      | standard_user:secret_sauce           |
      | problem_user:secret_sauce            |
      | performance_glitch_user:secret_sauce |


  Scenario Outline: User can not log in using wrong credentials
    Given I navigate to Login Page
    When I log into the site with credentials <wrong_credentials>
    Then I will see a login error

    Examples: 
      | wrong_credentials   |
      | camilo:romero       |
      | standard_user:romero|
      | camilo:secret_sauce |

    Scenario: Locked user can not login to the application
      Given I navigate to Login Page
      When I log into the site with credentials locked_out_user:secret_sauce
      Then I will see a locked out error message
