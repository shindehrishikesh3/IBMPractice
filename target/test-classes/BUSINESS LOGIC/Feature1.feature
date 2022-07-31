@Sprint01
Feature: To check facebook login functionality

@SmokeTest @one
Scenario: Check login functionality
When user open "Chrome" browser
When user open URL as "https://www.facebook.com/"
When user enter username as "Hrishi1234"
When user enter password as "1234"
When user click on login button
Then user can able to see user profile

@RegressionTest @two
Scenario: To check login function
When user open "Chrome" browser
When user open URL as "http://primusbank.qedgetech.com/"
When user enter "Admin" as username 
When user enter "Admin" as password 
When user clicks on login button
Then user able to see user profile