Feature: Navigation to Football Events

  Scenario Outline: Player is on All Spotts menu item and clicks on Football events

    Given Player navigates to All Sports URL on homepage

    When Player scrolls down the page

    And Player selects a Sports event <footballEvent>

    Then Player is redirected to chosen event URL "<string>"

    Examples: Sports Events

      | Event         | EventUrl                                               |
      | footballEvent | "http://sports.williamhill.com/betting/en-gb/football" |
      | tennisEvent   | "http://sports.williamhill.com/betting/en-gb/tennis"   |
    
