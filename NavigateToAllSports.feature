Feature: Selecting a Football Event from All Sports

  This feature addresses player navigation to All Sport in left navigation menu,
  and player selection of Football sport

  Scenario: Player navigates to All Sports

    Given Player should be logged in

    And Player navigates to homepage "<string>"

    When Player scrolls down the page

    Then Player navigates to All Sports URL on homepage
