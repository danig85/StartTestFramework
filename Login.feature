Feature: LoginFeature

  This feature addresses the login functionality of the application

  Scenario Outline: Login with correct username and password

    Given Player navigates to login page

    When Player enters credentials <username> and <password> to Login

    And Player clicks the login button

    Then Player should be logged in

    Examples:

      | username   | password   |
      | WHATA_FOG3 | fOGuAtTEST |


