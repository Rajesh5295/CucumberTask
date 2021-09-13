package com.telecom.stepdefinitions;

import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.telecom.objectrepostiory.AddCustomerPage;
import com.telecom.resources.Commanactions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AddCustomerSteps extends Commanactions{
	Commanactions ca =new Commanactions();
	AddCustomerPage a=new AddCustomerPage();
   /*static WebDriver driver;
@Given("user launches telecom application")
public void user_launches_telecom_application() {
    WebDriverManager.chromedriver().setup();
     driver = new ChromeDriver();
    driver.get("http://www.demo.guru99.com/telecom/");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    
    
}*/

@Given("user click on add customer button")
public void user_click_on_add_customer_button() throws Throwable {
	Thread.sleep(2000 );
	ca.insertbt(a.getAddcustomerButton());
}

@When("user need to fill up the fields")
public void user_need_to_fill_up_the_fields() throws Throwable {
	ca.insertbt(a.getDoneButton());
	Thread.sleep(2000);
	ca.insertvalue(a.getFame(),"Rajesh");
	ca.insertvalue(a.getLname(), "V");
	ca.insertvalue(a.getEmail(),"Rajesh@gmail.com");
	ca.insertvalue(a.getAddr(), "Chennai");
	ca.insertvalue(a.getPhno(), "09876543210");
	
}

@When("user click on submit button")
public void user_click_on_submit_button() {
	ca.insertbt(a.getSubmitButton());
   
}

@Then("user verify customer id is generated")
public void user_verify_customer_id_is_generated() {
	WebElement Cusid=driver.findElement(By.xpath("(//td[@align='center'])[2]"));
    Assert.assertTrue(Cusid.isDisplayed());
    
    String S1=driver.findElement(By.xpath("//b[text()='Please Note Down Your CustomerID']")).getText();
    System.out.println(S1);
    
    Assert.assertEquals("Please Note Down Your CustomerID", S1);
}
@When("user need to fill up the fields by {int}D map")
public void user_need_to_fill_up_the_fields_by_D_map(Integer int1, DataTable datas) {
    Map<String,String> details=datas.asMap(String.class, String.class);
    ca.insertbt(a.getDoneButton());
	ca.insertvalue(a.getFame(), details.get("fname"));
	ca.insertvalue(a.getLname(),details.get("lname"));
	ca.insertvalue(a.getEmail(), details.get("email"));
	ca.insertvalue(a.getAddr(), details.get("Addr"));
	ca.insertvalue(a.getPhno(), details.get("Phno"));
}

}