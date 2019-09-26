Feature: Account Creation on CodersGuru

  Scenario: Register private user can on the CodersGuru website

    Given an open browser with website https://men-men-s-01.codersguru.pl
    When user enters chosen email address galona@itfast.net
    And user clicks Register button
    And user enters name Jan
    And user enters surname Kowalski
    And user enters first password Haslo123
    And user enters second password Haslo123
    And user enters city Bytom
    And user enters postcode 41-411
    And user enters street Bytomska
    And user enters home number 22
    And user accepts the terms and conditions
    And user clicks the register button
    Then user is registered

