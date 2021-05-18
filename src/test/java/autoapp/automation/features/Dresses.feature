Feature: Shopping of dresses

  Scenario: Add summer dress to cart
    Given Automation practice application is opened
    When I click Dresses -> Summer Dresses
    And I click on Quick View
    And I select blue color
    And I click on Add to cart
    Then I verify product name, color and quantity