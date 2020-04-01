$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/skeleton/shout.feature");
formatter.feature({
  "name": "Shout Feature",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Sean and Lucia are within the range",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@nonui"
    }
  ]
});
formatter.step({
  "name": "Sean and Lucia are 20 metres away",
  "keyword": "Given "
});
formatter.match({
  "location": "skeleton.ShoutSteps.sean_and_Lucia_are_metres_away(java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Sean shouts \"free coffee\" to Lucia",
  "keyword": "When "
});
formatter.match({
  "location": "skeleton.ShoutSteps.sean_shouts_to_Lucia(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Lucia listen to the message",
  "keyword": "Then "
});
formatter.match({
  "location": "skeleton.ShoutSteps.lucia_listen_to_the_message()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Sean and Lucia are within the range",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@nonui"
    }
  ]
});
formatter.step({
  "name": "Sean and Lucia are 300 metres away",
  "keyword": "Given "
});
formatter.match({
  "location": "skeleton.ShoutSteps.sean_and_Lucia_are_metres_away(java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Sean shouts \"free coffee\" to Lucia",
  "keyword": "When "
});
formatter.match({
  "location": "skeleton.ShoutSteps.sean_shouts_to_Lucia(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Lucia doesnot listen to the message",
  "keyword": "Then "
});
formatter.match({
  "location": "skeleton.ShoutSteps.lucia_doesnot_listen_to_the_message()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Sarah has 30 cucumbers in her bag",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@bag"
    },
    {
      "name": "@nonui"
    }
  ]
});
formatter.step({
  "name": "Sarah has 10 cucumbers in her bag",
  "keyword": "Given "
});
formatter.match({
  "location": "skeleton.ShoutSteps.sarah_has_cucumbers_in_her_bag(java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
});