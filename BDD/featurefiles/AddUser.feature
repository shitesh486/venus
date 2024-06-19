Feature: Add User
Scenario: Create an user in actitime application
Given User should be present in "http://localhost/user/submit_tt.do"
When he clicks on users Tab
Then "http://localhost/administration/userlist.do" should be displayed
And he clicks on add user button
Then Add user Popup window should be displayed
And he enters "<firstName>", "<lastName>", "<EmailID>" ,"<userName>", "<pwd>", "<retypePwd>".
And he clicks on create user button
And he searches for "<firstName>"
Then "<firstName>" should be created
And he clicks on the created user 
And click on delete user button
Then alert popup should be displayed
And Accept the popup
And search for the "<firstName>"
Then There are no users found should be displayed
Examples:
|firstName|lastName|EmailID|userName|pwd|retypePwd|
|Aarti|matre|aarti@123|AARTI|A@123|A@123|
|Vikas|QSP|Vikas@bl|VIKAS|Dinga|Dinga|
|Amit|Abhi|Amit@123|AMIT|Amitabh|Amitabh|
|Arun|Kumar|Arun@1804|ARUN|1817|1817|
|Mohammed|Shariff|Shariff07|MOHAMMED|Shariff@07|Shariff@07|
|Mahadev|Nayak|Nayak@123|MAHADEV|Man123|Man123|
|Dhoni|M.S|MSD@07|MAHI|Ziva|Ziva|