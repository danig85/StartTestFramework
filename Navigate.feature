Feature: Homepage Navigation

  This feature addresses player navigation to application Homepage

  Scenario: Player navigates to Homepage

    Given The application is started

    When Player enters the application URL

    Then Player navigates to homepage "http://sports.williamhill.com/betting/en-gb"