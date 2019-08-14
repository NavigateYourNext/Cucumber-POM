Feature: Validate Login Amazon Feature

Scenario: Validate Login

Given user opens browser
When user is on login page
Then user enters Username and Password
Then validate logged in user
Then user closed the browser