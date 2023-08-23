@login
Feature: Login Functionality

  @test
  Scenario: Login successfully
    When I navigate to URl
    And I entered UserName and Password
      |userName| password|
     |  standard_user| secret_sauce |
   And I clicked on Login button
   Then verify login Successfully