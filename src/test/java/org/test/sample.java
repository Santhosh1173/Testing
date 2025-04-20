package org.test;

import org.openqa.selenium.By;

public class sample extends BaseClass {
	public static void main(String[] args) {
		browserLaunch("chrome");
		url("https://www.facebook.com/");
		btnclick(driver.findElement(By.xpath("(//a[@role='button'])[2]")));
		wait(3);
		PomTry p = new PomTry();
		sendkeys(p.getfirstname(),"santhosh");
		sendkeys(p.getlastname(),"R");
		select(p.day(),"31");
		select(p.month(),"May");
		select(p.year(),"2000");
		
		genderradiobutton(p.gender());
		sendkeys(p.number(),"6381095988");
		sendkeys(p.password(),"54321");
		btnclick(p.btnclick());
		//wait(10);
		//quit(driver);
		//close(driver);
	}
	

}
