# java-selenium
The src/main/java consists of follwoing packages: base, config, dataset, pages and utility
Base: Consists of TestBase class which has a method called initilaization . This method has two if conditions, if brower type is equals to chrome it will set properties for chrome  driver and open the browser, else it will execute firefix driver. The initialization method also will maximize the window, delete all the cookies before launching the page , set the page load time and enter the url.
Browser type, url, usernames, passwords are all stored in a properties file which is under the "com.plateiq.qa.config" package
TestBase class has a constructor which loads this property file and imports all the variales from the property file(testProperty.properties)
Pages: This packages consists of the all pages that we are going to automate for example, LoginPage.java, HomePage.java, etc. These pages extend the Test Base class and it consists of all the webelments present on the page that require some action to performed on. These webelments are arranged using the page factory Object.
Utility: This package consists of utils class that will have all the common menthods that can be used acrosee multiple test cases to avoid repitations.
The src/test/java consists if testcases package and resources.drivers
The test cases pacakge consists of test classes for all the pages. LoginPageTest class will execute all the login related test cases with valid un and pwd, invalid un and pwd , basicaly it covers all the positive and negative scenarios in each test cases.
pom.xml: holds all the dependencies required for the project
testn.xml maitains an order of test class execution 
Priorities are set in each test cases.

