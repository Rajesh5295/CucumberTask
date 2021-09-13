package com.telecom.stepdefinitions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= ".//src//test//resources//AddCustomer.feature ",
		glue= "com.telecom.stepdefinitions",
		plugin= {"html:target","json:target/reports.json"},
		monochrome=true,
		dryRun =false,
		tags= {"@smoke","@sanity"}
		)

public class TestRunner{

}
