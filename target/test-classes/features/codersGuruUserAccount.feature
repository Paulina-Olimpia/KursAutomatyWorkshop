Feature: Account Creation on CodersGuru

  Scenario Outline: Register private user can on the CodersGuru website

    Given an open browser with website <websiteAddress>
    When user enters chosen email address <emailAddress>
    And user clicks Register button
    And user enters name <name>
    And user enters surname <surname>
    And user enters first password <firstPassword>
    And user enters second password <secondPassword>
    And user enters city <city>
    And user enters postcode <postcode>
    And user enters street <street>
    And user enters home number <number>
    And user accepts the terms and conditions
    And user clicks the register button
    Then user is registered
    Examples:
      |  websiteAddress                     | emailAddress   | name  | surname | firstPassword | secondPassword| city | postcode | street | number|
      |  https://men-men-s-01.codersguru.pl | innyadres@wp.pl| Jacek | Nowak   | ssGG127!as    | ssGG127!as    | Radom| 92-000   |Zawiszy | 12    |
