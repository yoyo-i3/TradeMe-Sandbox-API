About this repository
==================
This repository contains the code for 'Test Exercise for QA Engineer Candidates'.<br>
This maven project is developed in java, junit and rest Assured. <br>
<br>
The UsedCars.java is the class with all the common methods used by stepdefs. <br>
The BaseService.java is the class that handles the API response with potential to include more base API methods in the future.<br>
The test.properties is added to store project common variables like base url. <br>
This branch is also updated to run using Behavior Driven Development using Cucumber <br>
And Reporting is also updated to be user friendly viewed as html.<br>


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

Download and run Automation Tests
---
$ git clone -b develop https://github.com/yoyo-i3/TradeMe-Sandbox-API.git <br>
$ cd TradeMe-Sandbox-API <br>
==> To run with cucumber reporting<br>
$ mvn verify test <br>
==> To run without cucumber reporting<br>
$ mvn test<br>

Reporting
---
Output will be displayed in the terminal for step results wrapped with<br>
===============STEP RESULT==================<br>
<br>
If using run with cucumber reporting then; <br>
Go to directory where you cloned the project to view cucumber report<br>
Open ${your_dir}/TradeMeAPI/target/cucumber-reports/cucumber-html-reports/overview-features.html

