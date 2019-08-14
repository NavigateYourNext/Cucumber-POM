$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/akshay.shete/workspace/CucumberPOM/src/main/java/com/qa/features/Amazon.feature");
formatter.feature({
  "line": 1,
  "name": "Validate Login Amazon Feature",
  "description": "",
  "id": "validate-login-amazon-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Validate Login",
  "description": "",
  "id": "validate-login-amazon-feature;validate-login",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user opens browser",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user is on login page",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user enters Username and Password",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "validate logged in user",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user closed the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageSteps.user_opens_browser()"
});
formatter.result({
  "duration": 8782247122,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.user_is_on_login_page()"
});
formatter.result({
  "duration": 28053510,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.user_enters_Username_and_Password()"
});
formatter.result({
  "duration": 6664017035,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.validate_logged_in_user()"
});
formatter.result({
  "duration": 93752453,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.user_closed_the_browser()"
});
formatter.result({
  "duration": 804845769,
  "status": "passed"
});
});