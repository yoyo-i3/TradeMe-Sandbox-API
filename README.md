About this repository
==================
This repository contains the code for 'Test Exercise for QA Engineer Candidates'.<br>
This maven project is developed in java, junit and rest Assured. <br>
<br>

What do you need to run these tests?
---
A Java 1.8 JDK and Maven.

The exercise
---
Using the TradeMe Sandbox web site write automation code which does the following: <br>
- Return how many named brands of used cars are available in the TradeMe UsedCars category. <br>
- Check that the brand ‘Kia’ exists and return the current number of Kia cars listed. <br>
- Check that the brand ‘Hispano Suiza’ does not exist.<br>

The code samples invoke the Category UsedCar [TradeMe SandBox API](https://developer.trademe.co.nz/api-reference/). <br>
[TradeMe Sandbox web site](https://www.tmsandbox.co.nz/).

BDD Framework
---
The BDD framework is using Cucumber and Gherkin scripted feature<br>

The UsedCars.java is the class with all the common methods related to Used cars subcategory used by stepdefs.<br>
The BaseService.java is the class that handles the Base methods that can be used by any domain under test.<br>
UsedCarsDetails.java is the class used to store values used between steps/scenarios to avoid duplicating code. <br>
The test.properties is added to store project common variables like base url.<br>
<br>
UsedCarSteps.java carries all step definition methods.<br>
testResults.txt file is created to store test result info.<br>
This branch is updated to run using Behavior Driven Development using Cucumber<br>
And Reporting is updated to be user friendly viewed as html cucumber report.<br>

Download and run Automation Tests using BDD Framework
---

$ git clone https://github.com/yoyo-i3/TradeMe-Sandbox-API.git<br>
$ cd TradeMe-Sandbox-API<br>
<br>
==> To run with cucumber reporting<br>
$ mvn verify test<br>
<br>
==> To run without cucumber reporting<br>
$ mvn test<br>

Reporting
---
Output will be copied to the testresults text file and in the terminal for test results<br>
If using run with cucumber reporting then view the overview-features.html.html<br>
<br>
Go to directory where you cloned the project to view cucumber report<br>
Open ${your_dir}/TradeMe-Sandbox-API/target/cucumber-reports/cucumber-html-reports/overview-features.html<br>
or Open ${your_dir}/TradeMe-Sandbox-API/src/test/resources/files/testResults*<br>
* testResults file name will have suffix of run time for each run - down to mins<br>
