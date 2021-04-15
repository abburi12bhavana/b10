
Feature: Login features
This feature includes scenario that would validate the following feature.
1) Login as Admin
2) Login as linda.anderson
3) Login with Nagative data

Background:
Given I am able to naviagte onto the login page

#Scenario: Login as Admin
#When I Enter the username as "Admin" 
#And I Enter the Password as "admin123" 
#And I Click on the Login button
#Then I should see the username as "Welcome Paulette"   
#
#Scenario: Login as linda.anderson
#When I Enter the username as "Admin" 
#And I Enter the Password as "admin123" 
#And I Click on the Login button
#Then I should see the username as "Welcome Paulette"   
@Login
Scenario Outline: Test Login with Different Data
When I Enter the username as "<username>"
And I Enter the Password as "<password>"
And I Click on the Login button
Then I should see the username as "<LoginName>"

Examples: 
|username|password|	LoginName|
|Admin	 |admin123|Welcome Paul| 
|Admin	 |admin123|Welcome Paul|
@NegativeLogin
Scenario: Login with Negative Data
When I Enter the username as "sunil" 
And I Enter the Password as "Sunil" 
And I Click on the Login button
Then I should see a Error Message as "Invalid Credentials" 