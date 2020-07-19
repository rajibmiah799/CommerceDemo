package com.testrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		       features = "Features",
               glue = "com.stepdefanition", 
               plugin = "pretty", 
               monochrome = true
)

public class TestRunner extends AbstractTestNGCucumberTests{

}
