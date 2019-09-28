$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("codersGuruUserAccount.feature");
formatter.feature({
  "line": 1,
  "name": "Account Creation on CodersGuru",
  "description": "",
  "id": "account-creation-on-codersguru",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Register private user can on the CodersGuru website",
  "description": "",
  "id": "account-creation-on-codersguru;register-private-user-can-on-the-codersguru-website",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "an open browser with website \u003cwebsiteAddress\u003e",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user enters chosen email address \u003cemailAddress\u003e",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user clicks Register button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user enters name \u003cname\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user enters surname \u003csurname\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user enters first password \u003cfirstPassword\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user enters second password \u003csecondPassword\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user enters city \u003ccity\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "user enters postcode \u003cpostcode\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "user enters street \u003cstreet\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "user enters home number \u003cnumber\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "user accepts the terms and conditions",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "user clicks the register button",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "user is registered",
  "keyword": "Then "
});
formatter.examples({
  "line": 19,
  "name": "",
  "description": "",
  "id": "account-creation-on-codersguru;register-private-user-can-on-the-codersguru-website;",
  "rows": [
    {
      "cells": [
        "websiteAddress",
        "emailAddress",
        "name",
        "surname",
        "firstPassword",
        "secondPassword",
        "city",
        "postcode",
        "street",
        "number"
      ],
      "line": 20,
      "id": "account-creation-on-codersguru;register-private-user-can-on-the-codersguru-website;;1"
    },
    {
      "cells": [
        "https://men-men-s-01.codersguru.pl",
        "innyadres@wp.pl",
        "Jacek",
        "Nowak",
        "ssGG127!as",
        "ssGG127!as",
        "Radom",
        "92-000",
        "Zawiszy",
        "12"
      ],
      "line": 21,
      "id": "account-creation-on-codersguru;register-private-user-can-on-the-codersguru-website;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 21,
  "name": "Register private user can on the CodersGuru website",
  "description": "",
  "id": "account-creation-on-codersguru;register-private-user-can-on-the-codersguru-website;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "an open browser with website https://men-men-s-01.codersguru.pl",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user enters chosen email address innyadres@wp.pl",
  "matchedColumns": [
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user clicks Register button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user enters name Jacek",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user enters surname Nowak",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user enters first password ssGG127!as",
  "matchedColumns": [
    4
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user enters second password ssGG127!as",
  "matchedColumns": [
    5
  ],
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user enters city Radom",
  "matchedColumns": [
    6
  ],
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "user enters postcode 92-000",
  "matchedColumns": [
    7
  ],
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "user enters street Zawiszy",
  "matchedColumns": [
    8
  ],
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "user enters home number 12",
  "matchedColumns": [
    9
  ],
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "user accepts the terms and conditions",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "user clicks the register button",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "user is registered",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "https://men-men-s-01.codersguru.pl",
      "offset": 29
    }
  ],
  "location": "codersGuruUserAccountStepsDefinition.anOpenBrowserWithHttpsMenMenSCodersguruPl(String)"
});
formatter.result({
  "duration": 18281203184,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "innyadres@wp.pl",
      "offset": 33
    }
  ],
  "location": "codersGuruUserAccountStepsDefinition.userInputsChosenEmailAddress(String)"
});
formatter.result({
  "duration": 403607410,
  "status": "passed"
});
formatter.match({
  "location": "codersGuruUserAccountStepsDefinition.userClicksRegisterButton()"
});
formatter.result({
  "duration": 494882291,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Jacek",
      "offset": 17
    }
  ],
  "location": "codersGuruUserAccountStepsDefinition.userEntersName(String)"
});
formatter.result({
  "duration": 262898837,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Nowak",
      "offset": 20
    }
  ],
  "location": "codersGuruUserAccountStepsDefinition.userEntersSurname(String)"
});
formatter.result({
  "duration": 232494645,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ssGG127!as",
      "offset": 27
    }
  ],
  "location": "codersGuruUserAccountStepsDefinition.userEntersFirstPassword(String)"
});
formatter.result({
  "duration": 196664192,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ssGG127!as",
      "offset": 28
    }
  ],
  "location": "codersGuruUserAccountStepsDefinition.userEntersSecondPassword(String)"
});
formatter.result({
  "duration": 219588262,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Radom",
      "offset": 17
    }
  ],
  "location": "codersGuruUserAccountStepsDefinition.userEntersCity(String)"
});
formatter.result({
  "duration": 173108354,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "92-000",
      "offset": 21
    }
  ],
  "location": "codersGuruUserAccountStepsDefinition.userEntersPostcode(String)"
});
formatter.result({
  "duration": 182936727,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Zawiszy",
      "offset": 19
    }
  ],
  "location": "codersGuruUserAccountStepsDefinition.userEntersStreet(String)"
});
formatter.result({
  "duration": 242175658,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "12",
      "offset": 24
    }
  ],
  "location": "codersGuruUserAccountStepsDefinition.userEntersHomeNumber(String)"
});
formatter.result({
  "duration": 197839991,
  "status": "passed"
});
formatter.match({
  "location": "codersGuruUserAccountStepsDefinition.userAcceptsTheTermsAndConditions()"
});
formatter.result({
  "duration": 220069520,
  "status": "passed"
});
formatter.match({
  "location": "codersGuruUserAccountStepsDefinition.userClicksTheRegisterButton()"
});
formatter.result({
  "duration": 1249035269,
  "status": "passed"
});
formatter.match({
  "location": "codersGuruUserAccountStepsDefinition.userIsRegistered()"
});
formatter.result({
  "duration": 48909,
  "status": "passed"
});
});