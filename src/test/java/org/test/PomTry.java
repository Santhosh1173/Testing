package org.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomTry extends BaseClass {
	
	public PomTry() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(name="firstname")
	private WebElement firstname;
	@FindBy(name="lastname")
	private WebElement lastname;
	 public WebElement getfirstname() {
		 return firstname;
	 }
	public WebElement getlastname() {
		return lastname;
	}
	@FindBy(xpath="//input[@type='password']")
	private WebElement password;
	public WebElement password() {
		return password;
	}
	@FindBy(xpath="(//input[@type='text'])[5]")
	private WebElement number;
	public WebElement number() {
		return number;
	}
	@FindBy(xpath="//button[@type='submit']")
	private WebElement btnclick;
	public WebElement btnclick() {
		return btnclick;
	}
	@FindBy(xpath="//input[@value='2'] ")
	private WebElement gender;
	public  WebElement gender() {
		return gender;
	}
	@FindBy(id="day")
	private WebElement day;
	public  WebElement day() {
		return day;
	}
	@FindBy(id="month")
	private WebElement month;
	public WebElement month() {
		return month;
	}
	@FindBy(id="year")
	private WebElement year;
	public WebElement year() {
		return year;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
