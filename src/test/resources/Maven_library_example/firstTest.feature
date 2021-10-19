Feature: firstTest
    I want to know if the default name is correct
    Scenario: Default name is default name
        Given Film title is default
        When I ask is the title the default
        Then I should be told "Default film title"

    Scenario: Can take audiobook out of library
        Given Audiobook has default avalibility
        When I ask if I can take audiobooks out of the library
        Then I should be told "You can take this out of the library"

    Scenario: Default digital audiobook data size is 0
        Given Digital audiobook data size is unset
        When I ask what the data size is
        Then I should be told 0.0