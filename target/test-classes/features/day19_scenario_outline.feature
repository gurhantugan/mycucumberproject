
@scenario_outline_search
Feature: search_using_scenario_outline
  Background: user_is_on_the_page
    Given user is on the google page

    Scenario Outline: google_search_test

      When user search for "<item>"
      Then verify the result has "<item>"
      Then close the application

      Examples: test_data

      |item    |
      |iPhone  |
      |tea pot |
      |tesla   |
      |honda   |
      |broadway|