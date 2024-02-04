Feature: Pilote

  Scenario: Pilote Points Calculation
    Given a pilote with number 16 and 20 points
    When the pilote wins a race
    Then the pilote should have 45 points
