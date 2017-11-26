Feature: Balance Updated

  This feature addresses the correct player balance update after a stake transaction
  is performed

  Scenario: Player balance is updated with subtracted stake after placing a bet

    Given Player receives betslip with bet amount

    And Player receives balance before the bet

    When Player checks total balance

    Then Player balance is updated