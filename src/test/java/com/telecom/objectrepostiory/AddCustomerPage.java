package com.telecom.objectrepostiory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.telecom.resources.Commanactions;

public class AddCustomerPage extends Commanactions{
	public AddCustomerPage(){
		PageFactory.initElements(driver, this);
	}
   
	@FindBy(xpath="(//a[text()='Add Customer'])[1]")
	private WebElement AddcustomerButton;
	
	@FindBy(xpath="(//label[text()='Done'])[1]")
	private WebElement DoneButton;
	
	@FindBy(id="fname")
	private WebElement fame;
	@FindBy(id="lname")
	private WebElement lname;
	@FindBy(id="email")
	private WebElement email;
	@FindBy(name="addr")
	private WebElement Addr;
	@FindBy(id="telephoneno")
	private WebElement phno;
	@FindBy(xpath="//input[@type='submit']")
	private WebElement SubmitButton;
	
	public WebElement getAddcustomerButton() {
		return AddcustomerButton;
	}
	public WebElement getDoneButton() {
		return DoneButton;
	}
	public WebElement getFame() {
		return fame;
	}
	public WebElement getLname() {
		return lname;
	}
	public WebElement getEmail() {
		return email;
	}
	public WebElement getAddr() {
		return Addr;
	}
	public WebElement getPhno() {
		return phno;
	}
	public WebElement getSubmitButton() {
		return SubmitButton;
	}
}
