package com.telecom.stepdefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.telecom.resources.Commanactions;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks extends Commanactions{
     Commanactions ca=new  Commanactions();
@Before
public void beforescenerio() {
	    ca.browserlaunch("http://www.demo.guru99.com/telecom/");
}
@After
public void afterscenario(Scenario scenario){
	
	//driver.close();
	if(scenario.isFailed()){

		final byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);

		scenario.embed(screenshot, "image/png");
	}else{
		scenario.embed(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES), "image/png");

	}
	
}}
