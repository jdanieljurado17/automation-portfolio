Feature: Demonstrate proper automation of different elements on demoqa.com

  Scenario: Successfully automate the form on the Text Box element page
    Given the user access the demoqa.com website
    When the user navigates to elements tab
    Then the user can fill the form and submit it
