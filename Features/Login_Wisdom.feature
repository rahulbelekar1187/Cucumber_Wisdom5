Feature: Login to Wisdome portal

Scenario: Logine to Wisdome-Ashler application

Given user opens a chrome browser
When user enters valid url as "https://trade.wisdomcapital.in/#!/app"
And user enters valid "WF6820"
And click on Validate button
When user enters valid password as "Rahul@321"
And check into the Checkbox
And click on Submit button
When user enters valid pin as"409898"
And click on Submit(second)button
And click on agree button
Then page title should be "WISDOM NEO by Ashlar"
When user click on profile dropdown button
And user click on Logout link
And user click on Yes button 
Then page title should be display as "WISDOM NEO by Ashlar"
And user close the browser