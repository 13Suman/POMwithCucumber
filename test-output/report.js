$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/Users/suman/eclipse-workspace/POMwithCucumber/src/main/java/com/qa/feature/orangehrm.feature");
formatter.feature({
  "line": 1,
  "name": "Orange HRM Application Test",
  "description": "",
  "id": "orange-hrm-application-test",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Validate Orange HRM HomePage Test",
  "description": "",
  "id": "orange-hrm-application-test;validate-orange-hrm-homepage-test",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User launches the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User is on login Page",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "User enters username and password",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Validate Home Page title",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Validate logged in user",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageSteps.user_launches_the_browser()"
});
formatter.result({
  "duration": 25351538667,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.user_is_on_login_Page()"
});
formatter.result({
  "duration": 38185111,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.user_enters_username_and_password()"
});
formatter.result({
  "duration": 12820182778,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.validate_Home_Page_title()"
});
formatter.result({
  "duration": 7888163,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.validate_logged_in_user()"
});
formatter.result({
  "duration": 2272807995,
  "status": "passed"
});
});