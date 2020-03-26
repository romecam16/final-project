Feature: SauceDemo Login
  As a User
  I want to log into SauceDemo
  So I can buy products

  Scenario: User can login successfully
    Given I navigate to Login Page
    When I log into the site with credentials standard_user:secret_sauce
    Then I will be in Products Page
    And I will be able to Add Products to the Cart


  Scenario Outline: User can not log in using wrong credentials
    Given I navigate to Products Page
    When I log into the site with credentials <wrong_credentials>
    Then I will see a login error

    Examples: 
      | wrong_credentials   |
      | camilo:romero       |
      | standard_user:romero|
      | camilo:secret_sauce |
