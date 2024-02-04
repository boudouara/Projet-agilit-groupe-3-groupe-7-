Feature: Agence Alerts

  Scenario: Notify clients about a new piece
    Given an agence
    When a new piece is available
    Then the agence should notify the clients

  Scenario: Add and remove clients
    Given an agence
    And a client named "John Doe" is registered for piece "Engine"
    When the client "John Doe" is unregistered for piece "Engine"
    Then the agence should not notify the unregistered client about new pieces