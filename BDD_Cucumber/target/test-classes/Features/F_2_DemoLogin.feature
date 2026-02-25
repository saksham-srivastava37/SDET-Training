Feature: Login using DataTable
Scenario: Login with credentials
Given user is on login page
When user enters credentials
| standard_user   | secret_sauce |
Then user validates login