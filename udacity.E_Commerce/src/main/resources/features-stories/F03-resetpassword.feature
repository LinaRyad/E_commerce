@Smoke

Feature: Reset user password

  Scenario: user enter valid email and reset password

  Given 1_user go to login page
  And 2_user click on forget-password
  And 3_user enter valid email
  When 4_user click on recovery-button
  Then 5_confirmation message appears




