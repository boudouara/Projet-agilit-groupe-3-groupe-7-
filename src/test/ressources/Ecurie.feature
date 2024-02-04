Feature: Managing racing teams

  Scenario: Adding a driver to a racing team
    Given a racing team with the name "Red Bull Racing"
    And a driver with the name "Max Verstappen"
    When I add the driver to the team
    Then the driver "Max Verstappen" is associated with the team "Red Bull Racing"
    And the number of drivers in the team "Red Bull Racing" is 1
