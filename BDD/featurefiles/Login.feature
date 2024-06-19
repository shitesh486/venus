Feature: Login feature
Scenario Outline: Valid login
Given User should search for "http://localhost/login.do" in browser
When User should enter "<username>" as username and "<password>" as password
And He clicks on login button
Then Home page should be displayed

Examples:
	|username|password|
	|admin|manager|
	|RCB|ESCN|
	|Virat|Akaay|