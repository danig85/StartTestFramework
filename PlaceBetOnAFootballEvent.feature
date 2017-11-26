Feature: Player places bet on an Event

  This feature addresses the player placing a bet on an event

  Scenario: Player places a bet on the first Football event available

    Given Player is redirected to chosen event URL "<string>"

    When Player clicks on first football event

    Then Player bets on the event

    And Player confirms the purchase

    And Player receives betslip with bet amount








