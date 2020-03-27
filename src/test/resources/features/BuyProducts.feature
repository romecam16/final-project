Feature: SauceDemo Buy products process
  As a User
  I want to log into SauceDemo
  So I can buy products

  Scenario: User can buy two products
    Given I navigate to Login Page
    When I log into the site with credentials performance_glitch_user:secret_sauce
    And I Add two products to the cart
    And I navigate to the cart
    Then I can checkout my purchase


  Scenario Outline: User can not log in using wrong credentials
    Given I navigate to Login Page
    When I log into the site with credentials <wrong_credentials>
    Then I will see a login error

    Examples: 
      | wrong_credentials   |
      | camilo:romero       |
      | standard_user:romero|
      | camilo:secret_sauce |
