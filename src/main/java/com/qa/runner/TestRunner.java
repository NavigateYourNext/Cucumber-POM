package com.qa.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
features = "C:\\Users\\akshay.shete\\workspace\\CucumberPOM\\src\\main\\java\\com\\qa\\features\\Amazon.feature", //path of feature file in Features tag
glue = {"com/qa/stepDefination"}, //path of StepDefination in Glue tag
format={"pretty","html:test-output/cucumber.html","json:json-output/cucumber.json","junit:junit-xml/cucumber.xml"}, //format of report generation
dryRun= false, //make it true :- to check for every step of scenario we hve defined stepDefaination or not and later make it false
monochrome = true, //make it true :- for readable console output
strict = true //make it true :- It will failed execution if any stepDefination method is missing for the scenario steps
)

public class TestRunner
{
	//if you got error as package org.junit.runner does not exist then add dependancy "junit-dep" this
	//removed all <scope> tags from pom.xml
}
