# Intro
<TestNG>: Using TestNG for Assertions, Grouping and Parallel execution.
<Maven>: Using Maven for build, execution and dependency purpose.

# Getting Started
- Technologies Used:
- Selenium Webdriver – Automation tool
- TestNG  - Testing framework
- Java  - Supporting the architecture of framework [Java 8]
- Maven - For build management [Maven 3 or higher]

# Build and Test
To build the framework follow the below steps:
1. Make sure to have maven as maven 3 or higher setup on the machine
2. Make sure the value for 'browser' is set to *chrome or *FF at 'HerokuAppSampleTest\src\main\java\config\config.properties' location. 
3. To run a single test, go to any test page > double click @Test > Run As > TestNGTest (e.g:'HerokuAppSampleTest\src\test\java\com\HerokuAppTests\LoginPageTest.java')
4. To run all the tests, go to "HerokuAppSampleTest\src\main\resources\testng_regression.xml" > right click > Run As > TestNGSuite.

# Reporting
<side note: I included ExtentReports but this still needs to be configured to work>
<TextNG Reporting>
  1. to view the html reports for tests excute go to 'HerokuAppSampleTest\test-output\emailable-report.html' and click emailable-report.html
