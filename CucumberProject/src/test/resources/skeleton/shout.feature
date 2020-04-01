Feature: Shout Feature
@nonui
Scenario: Sean and Lucia are within the range
Given Sean and Lucia are 20 metres away
When Sean shouts "free coffee" to Lucia
Then Lucia listen to the message
@nonui
Scenario: Sean and Lucia are within the range
Given Sean and Lucia are 300 metres away
When Sean shouts "free coffee" to Lucia
Then Lucia doesnot listen to the message
@bag @nonui
Scenario: Sarah has 30 cucumbers in her bag
Given Sarah has 10 cucumbers in her bag