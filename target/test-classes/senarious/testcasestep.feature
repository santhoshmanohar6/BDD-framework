@homepage
Feature: test the lamda application
Scenario Outline: test the application with valid data
Given open the browser <browser>
Then Enter the url <url>
When Enter the fullname <fullname>
Then Enter the business email <email>
Then Enter the desird password <password>
Then select the phonecode <code>
Then Enter the phonenumber <phonenumber>
Then Click the agree checkbox <clickoption>

Examples:
|browser|url|fullname|email|password|code|phonenumber|clickoption|
|chrome|https://accounts.lambdatest.com/register|santhosh|santhoshmanohar6@gmail.com|santhosh03|91|9788898667|yes|
|edge|https://accounts.lambdatest.com/register|karthik|karrthiknm@gmail.com|manoharan03|62|9788898667|yes|
