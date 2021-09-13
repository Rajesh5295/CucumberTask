package com.telecom.resources;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Commanactions {
	 public static WebDriver driver;
	public void browserlaunch(String URL) {
		 WebDriverManager.chromedriver().setup();
	     driver = new ChromeDriver();
	    driver.get(URL);
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	
	public void insertvalue(WebElement web,String value) {
		web.sendKeys(value);
	}
	public void insertbt(WebElement web) {
		web.click();
	}
}
