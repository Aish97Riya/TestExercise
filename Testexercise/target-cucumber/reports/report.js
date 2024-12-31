$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("test.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: your.email@your.domain.com"
    },
    {
      "line": 2,
      "value": "#Keywords Summary :"
    },
    {
      "line": 3,
      "value": "#Feature: List of scenarios."
    },
    {
      "line": 4,
      "value": "#Scenario: Business rule through list of steps with arguments."
    },
    {
      "line": 5,
      "value": "#Given: Some precondition step"
    },
    {
      "line": 6,
      "value": "#When: Some key actions"
    },
    {
      "line": 7,
      "value": "#Then: To observe outcomes or validation"
    },
    {
      "line": 8,
      "value": "#And,But: To enumerate more Given,When,Then steps"
    },
    {
      "line": 9,
      "value": "#Scenario Outline: List of steps for data-driven as an Examples and \u003cplaceholder\u003e"
    },
    {
      "line": 10,
      "value": "#Examples: Container for s table"
    },
    {
      "line": 11,
      "value": "#Background: List of steps run before each of the scenarios"
    },
    {
      "line": 12,
      "value": "#\"\"\" (Doc Strings)"
    },
    {
      "line": 13,
      "value": "#| (Data Tables)"
    },
    {
      "line": 14,
      "value": "#@ (Tags/Labels):To group Scenarios"
    },
    {
      "line": 15,
      "value": "#\u003c\u003e (placeholder)"
    },
    {
      "line": 16,
      "value": "#\"\""
    },
    {
      "line": 17,
      "value": "## (Comments)"
    },
    {
      "line": 18,
      "value": "#Sample Feature Definition Template"
    }
  ],
  "line": 20,
  "name": "Automate amazon website",
  "description": "",
  "id": "automate-amazon-website",
  "keyword": "Feature",
  "tags": [
    {
      "line": 19,
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "comments": [
    {
      "line": 21,
      "value": "#  Scenario: amazon website using selenium"
    },
    {
      "line": 22,
      "value": "#    Given Open google chrome website"
    },
    {
      "line": 23,
      "value": "#    Then Amazon signIn using POM"
    },
    {
      "line": 25,
      "value": "#  Scenario: Select dropdown"
    },
    {
      "line": 26,
      "value": "#    Given Open browserstack website using select class"
    },
    {
      "line": 28,
      "value": "#  Scenario: Select dropdown exercise"
    },
    {
      "line": 29,
      "value": "#    Given Handling dropdown in selenium with select class"
    },
    {
      "line": 31,
      "value": "#  Scenario: Select dropdown without select class"
    },
    {
      "line": 32,
      "value": "#    Given dropdown without select class"
    }
  ],
  "line": 34,
  "name": "Select dropdown without select class exercise",
  "description": "",
  "id": "automate-amazon-website;select-dropdown-without-select-class-exercise",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 35,
  "name": "dropdown without select class exercise",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefpkg.dropdown_without_select_class_exercise()"
});
formatter.result({
  "duration": 29938875400,
  "status": "passed"
});
});