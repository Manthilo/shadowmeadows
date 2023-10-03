**Introduction:**

This Test Automation Framework is created using Java + Selenium Web Driver + TestNG. Which can be used across different web based applications.
In this approach, the endeavor is to build a lot of applications independent reusable keyword components so that they can directly used for another web application without spending any extra effort. 
With this framework in place, whenever we need to automate a web based application, we would not need to start from scratch, but use the application independent keyword components to the extent possible and create application specific components for the specific needs.

Prerequisites:
---------------
*	Java jdk-1.8 or higher
*   TestNG
*	Apache Maven 3 or higher
*   Selenium
*	Please refer for any help in Maven. 
* 	http://maven.apache.org/guides/getting-started/maven-in-five-minutes.html
* 	http://www.tutorialspoint.com/maven/maven_environment_setup.htm
*   https://www.toolsqa.com/testng/install-testng
*   https://www.guru99.com/intellij-selenium-webdriver.html

Environment:
---------------
* 	The setup is done on my local machine
*   Added Java Home on System and Path Variables
*   Added Maven Home on System and Path Variables
*   POM File has the following dependecies  downloaded from Maven Repository
  -testng
  -externtreports
  -selenium -server
  -maven-surefire-plugin
  -webdrivermanager
Execution:
---------------
*	Unzip the project on the shared folder OR  git clone the repo https://github.com/Manthilo/shadowmeadows.git
*   If cloned on Git then the files are on master and the instruction are on README FILE
*   If unzipped the word document will have the instructions and the execution report
*   Open the project on IntelliJ
*   Go to the testNG.xml file
*   Right Click and click Run testNG.xml

Screenshot:
---------------
*	Most of the time we think to Capture Screenshot in WebDriver when some kind of error or exception surfaces while practicing testing, to resolve the same the framework has a method. 
*	takeSnapShott() is used to indicates driver to capture a screenshot and store it in IdeaProjects//untitled directory.

Reporting:
---------------
*  The Reports are generated using the Extent Report Library
*  The framework produce ShadowMeadowsTest.html report. It resides in the same project untitled folder. This reports gives the link to all the different component of the TestNG reports like Groups & Reporter Output. On clicking these will display detailed descriptions of execution.
* To open the report you Right Click on the ShadowMeadowsTest.html and Click open with explorer or broswer
