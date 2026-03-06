Feature: Login using List

  Scenario: Login with multiple usernames
    Given user on login page
    When user enters usernames
      | standard_user     |
      | locked_out_user   |
      | problem_user      |
      | performance_glitch_user |
      | error_user        |
      | visual_user       |
    Then user validation
    
    
    
    