Feature: Verify Google Search

  Scenario: Launch Google and verify search is successful
    Given Launch Google.com
    When Enter valid Search keyword
    Then Search Displayed