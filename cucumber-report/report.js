$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 1,
  "name": "user login mechanism",
  "description": "As a user in order to get all benefits from bestbuy ecomerce \r\nI want to login successfully",
  "id": "user-login-mechanism",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 6,
  "name": "Landing on bestbuy page",
  "description": "",
  "id": "user-login-mechanism;landing-on-bestbuy-page",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 5,
      "name": "@nr"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "I open browser as \"\u003coption\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I land on bestbuy page",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I complete Login With valid credientials",
  "keyword": "When "
});
formatter.step({
  "comments": [
    {
      "line": 10,
      "value": "#When I complete Login With \"\u003cUser\u003e\" and \"\u003cPassword\u003e\""
    },
    {
      "line": 11,
      "value": "#Then I want to verify bestbuy logo"
    },
    {
      "line": 12,
      "value": "#Then I verify name of the user displayed successfully"
    },
    {
      "line": 13,
      "value": "#Then I want to see all top table link"
    },
    {
      "line": 14,
      "value": "#And I expect top all table link working"
    },
    {
      "line": 15,
      "value": "#Then I do search some products for shopping"
    }
  ],
  "line": 16,
  "name": "I want to see my cart for finalizing my shopping",
  "keyword": "And "
});
formatter.examples({
  "comments": [
    {
      "line": 17,
      "value": "#Then I do search for different options"
    },
    {
      "line": 18,
      "value": "#Then I expect to see outer left table link working"
    },
    {
      "line": 19,
      "value": "#And I expect to see outer right table link working"
    },
    {
      "line": 20,
      "value": "#And I want to see all footer option"
    },
    {
      "line": 21,
      "value": "#And I want to do scroll up and scroll downn"
    },
    {
      "line": 22,
      "value": "#Then I want see trending now right arrow untill visible"
    },
    {
      "line": 23,
      "value": "#And I want to switch socail page"
    }
  ],
  "line": 25,
  "name": "",
  "description": "",
  "id": "user-login-mechanism;landing-on-bestbuy-page;",
  "rows": [
    {
      "cells": [
        "option"
      ],
      "line": 26,
      "id": "user-login-mechanism;landing-on-bestbuy-page;;1"
    },
    {
      "cells": [
        "Chrome"
      ],
      "line": 27,
      "id": "user-login-mechanism;landing-on-bestbuy-page;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 27,
  "name": "Landing on bestbuy page",
  "description": "",
  "id": "user-login-mechanism;landing-on-bestbuy-page;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 5,
      "name": "@nr"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "I open browser as \"Chrome\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I land on bestbuy page",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I complete Login With valid credientials",
  "keyword": "When "
});
formatter.step({
  "comments": [
    {
      "line": 10,
      "value": "#When I complete Login With \"\u003cUser\u003e\" and \"\u003cPassword\u003e\""
    },
    {
      "line": 11,
      "value": "#Then I want to verify bestbuy logo"
    },
    {
      "line": 12,
      "value": "#Then I verify name of the user displayed successfully"
    },
    {
      "line": 13,
      "value": "#Then I want to see all top table link"
    },
    {
      "line": 14,
      "value": "#And I expect top all table link working"
    },
    {
      "line": 15,
      "value": "#Then I do search some products for shopping"
    }
  ],
  "line": 16,
  "name": "I want to see my cart for finalizing my shopping",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "Chrome",
      "offset": 19
    }
  ],
  "location": "bestbuy_steps_defination.iOpenBrowserAs(String)"
});
formatter.result({
  "duration": 9600909734,
  "status": "passed"
});
formatter.match({
  "location": "bestbuy_steps_defination.iLandOnBestbuyPage()"
});
formatter.result({
  "duration": 54888386,
  "status": "passed"
});
formatter.match({
  "location": "bestbuy_steps_defination.iCompleteLoginWithValidCredientials()"
});
formatter.result({
  "duration": 17956779429,
  "status": "passed"
});
formatter.match({
  "location": "bestbuy_steps_defination.iWantToSeeMyCartForFinalizingMyShopping()"
});
formatter.result({
  "duration": 3037817651,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//div[contains(@class,\u0027cart-icon-container\u0027)]\"}\n  (Session info: chrome\u003d83.0.4103.116)\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.14.0\u0027, revision: \u0027aacccce0\u0027, time: \u00272018-08-02T20:19:58.91Z\u0027\nSystem info: host: \u0027Nayyirahs-MBP\u0027, ip: \u0027fe80:0:0:0:59:5306:8cfc:7419%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.15.5\u0027, java.version: \u002713.0.1\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 83.0.4103.116, chrome: {chromedriverVersion: 83.0.4103.39 (ccbf011cb2d2b..., userDataDir: /var/folders/27/c6p4m3mj42x...}, goog:chromeOptions: {debuggerAddress: localhost:63260}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: MAC, platformName: MAC, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: 32203caba440a5868503b62aa5d425ab\n*** Element info: {Using\u003dxpath, value\u003d//div[contains(@class,\u0027cart-icon-container\u0027)]}\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:548)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:322)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:424)\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:314)\n\tat bestbuy.steps.pageobjectmodel.MasterPage.clickOnElement(MasterPage.java:29)\n\tat bestbuy.steps.pageobjectmodel.MyAccountPage.finalizingShopping(MyAccountPage.java:97)\n\tat bestbuy.steps.defination.bestbuy_steps_defination.iWantToSeeMyCartForFinalizingMyShopping(bestbuy_steps_defination.java:75)\n\tat ✽.And I want to see my cart for finalizing my shopping(login.feature:16)\n",
  "status": "failed"
});
});