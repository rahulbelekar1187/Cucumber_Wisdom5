$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Features/Login_Wisdom.feature");
formatter.feature({
  "name": "Login to Wisdome portal",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Logine to Wisdome-Ashler application",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user opens a chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.user_opens_a_chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters valid url as \"https://trade.wisdomcapital.in/#!/app\"",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.user_enters_valid_url_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters valid \"WF6820\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_enters_valid(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Validate button",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.click_on_Validate_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters valid password as \"Rahul@321\"",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.user_enters_valid_password_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "check into the Checkbox",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.check_into_the_Checkbox()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Submit button",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.click_on_Submit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters valid pin as\"409898\"",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.user_enters_valid_pin_as(String)"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: Unable to find element with locator By.xpath: //input[@name\u003d\u0027efirstPin\u0027]\nFor documentation on this error, please visit: https://www.selenium.dev/documentation/webdriver/troubleshooting/errors#no-such-element-exception\nBuild info: version: \u00274.23.0\u0027, revision: \u00274df0a231af\u0027\nSystem info: os.name: \u0027Windows 11\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002721.0.4\u0027\nDriver info: driver.version: RemoteWebDriver\r\n\tat org.openqa.selenium.remote.ElementLocation$ElementFinder$2.findElement(ElementLocation.java:168)\r\n\tat org.openqa.selenium.remote.ElementLocation.findElement(ElementLocation.java:59)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:357)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:351)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:68)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat jdk.proxy2/jdk.proxy2.$Proxy17.clear(Unknown Source)\r\n\tat PageObjects.Login_Wisdom.txtPin(Login_Wisdom.java:93)\r\n\tat StepDefinitions.Steps.user_enters_valid_pin_as(Steps.java:66)\r\n\tat ✽.user enters valid pin as\"409898\"(file:Features/Login_Wisdom.feature:12)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "click on Submit(second)button",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.click_on_Submit_second_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "click on agree button",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.click_on_agree_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "page title should be \"WISDOM NEO by Ashlar\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.page_title_should_be(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user click on profile dropdown button",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.user_click_on_profile_dropdown_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user click on Logout link",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_click_on_Logout_link()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user click on Yes button",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_click_on_Yes_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "page title should be display as \"WISDOM NEO by Ashlar\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.page_title_should_be_display_as(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_close_the_browser()"
});
formatter.result({
  "status": "skipped"
});
});