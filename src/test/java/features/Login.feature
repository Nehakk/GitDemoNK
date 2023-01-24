Feature: Application Login Feature

Background:
Given Validate the browser
When Browser is triggered
Then check if browser is started

@SmokeTest
  Scenario: Home Page Default Login
    Given User is on Net banking landing page
    When User Login in aplication with username "jin" and password "abc"
    Then Home Page is populated  
    
     Scenario: Home Page Default Login
    Given User is on Net banking landing page
    When User Login in aplication with username "john" and password "def"
    Then Home Page is populated    

 #Scenario: Home Page Default Login
  #  Given User is on Net banking landing page
   # When User sign up with following details
    #|Jenny|abcd|jenny@abc.com||Australia|121212|
    #Then Home Page is populated  
    @MobileTest
     Scenario Outline: Home Page Default Login
    Given User is on Net banking landing page
    When User login with <UserName> and  <password>
    Then Home Page is populated
    
    Examples:
    |UserName|password|
    |user1|pass1|
    |user1|pass2|
    |user3|pass3| 
    |user4|pass4| 
    