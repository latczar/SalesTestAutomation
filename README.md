# TestAutomation - Sales Quoting EDDiE Automation Framework

Dedicated quickstart project written in Selenium Java with the integration of Cucumber for the test automation of Sales Quoting. Framework is able to cover the end-to-end manual quoting process for QA, UAT, and PROD enviroment, creation of residential customer accounts, creation of manual quotes with storage, adders, selection of Financial Options from Cash, Lease, or Loan, input different types of pricing values in the Quote Settings.

## Approach/Concepts Included in the Project
* Page Object Model design pattern
* Easy to understand test cases c/o Cucumber step definitions
* Continuous test runs as needed
* Functional testing interaction
* Regression testing suites
* Externalised test configuration (QA, UAT, PROD env)
* Page Factory

## Tools used
* Eclipse IDE
* Java
* Selenium WebDriver
* JUnit
* Maven
* Cucumber-JVM

## Requirements
* Chrome and Chromedriver (UI tests use Chrome by default, can be changed in config)
* Eclipse IDE
* Latest version of Maven
* Java SDK/JDK 15.0.1

Upon request, we can give you the excel file containing the Setup and Processes needed to configure the automation framework in your local machine.

## Usage

The project is mainly used for end-to-end manual quoting for several test environments, mainly conducting Regression, Functional, and Negative testing. There are ready-to-run test suites configured already for the respective environments. Testers can add and modify test cases via cucumber feature files to adhere whichever is needed for testing the AUT.

## Reporting

Will be adding test reporting function in the future. As well as the plugin to support CI and also to have the individual test reports joined as one via the Jenkins Cucumber-JVM-Reports plugin which is yet to be configured.
