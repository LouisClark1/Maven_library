Feature: firstTest
    People want to know when it’s Friday
    Scenario: Monday is not Friday
        Given today is Monday
        When I ask whether it’s Friday
        Then I should be told “No”