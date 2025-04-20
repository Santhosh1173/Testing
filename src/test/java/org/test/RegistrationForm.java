package org.test;

import java.util.Date;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.test.Register;
import org.test.TicketBook;
import org.junit.Test;
import org.test.BaseClass1;

public class RegistrationForm extends BaseClass1{
	
@BeforeClass 
	
	public static void beforeClass() {
		browserLaunch("chrome");
		urlLaunch("https://adactinhotelapp.com/");
		impWait(15);
	}
	
	@AfterClass
	public static void afterClass() {
		
	}
	
	@Before 
	public void before() {
		Date a = new Date();
		System.out.println(a);
	}
	
	@After
	public void After() {
		Date a = new Date ();
		System.out.println(a);
	}
	@Ignore

	@Test
	public void testA1() throws InterruptedException {
		
		Register l = new Register();
		
		click(l.getNewUser());
		
		sendKeys(l.getUsername(), "Santhosh55321");
		
		sendKeys(l.getFullname(), "Santhosh R");
		
		sendKeys(l.getPass(), "Hunter@01");
		
		sendKeys(l.getCnfpass(), "Hunter@01");
		
		sendKeys(l.getEmailAdd(), "sandysant951@gmail.com");
		
		Thread.sleep(10000);
		
		click(l.getClickTOS());
		
		click(l.getBtnRegister());
		
	}
	
	@Test
	public void testA2() throws InterruptedException {
		
		TicketBook t = new TicketBook ();
		
		sendKeys(t.getUsername(), "Santhosh55321");
		
		sendKeys(t.getPassword(), "Hunter@01");
		
		click(t.getBtnlogin());
		
		selectByIndex(t.getLocation(), 2);
		
		selectByIndex(t.getHotel(), 2);
		
		selectByIndex(t.getRoomType(), 2);
		
		selectByIndex(t.getRoomNumber(), 2);
		
		sendKeys(t.getDatecheckin(), "01/05/2025");
		
		sendKeys(t.getDatecheckout(), "03/05/2025");
		
		selectByIndex(t.getAdultroom(), 2);
		
		selectByIndex(t.getChildroom(), 2);
		
		click(t.getSearchHotel());
		
		click(t.getSelectHotel());
		
		click(t.getConfirmHotel());
		
		sendKeys(t.getFirstName(), "Santhosh");
		
		sendKeys(t.getLastName(), "hunter");
		
		sendKeys(t.getAddress(), "ranipet, walaja");
		
		sendKeys(t.getCcNum(), "6363095988442134 ");
		
		selectByIndex(t.getCcType(), 2);
		
		selectByIndex(t.getCcexpmonth(), 3);
		
		selectByVisibleTex(t.getCcexpyear(), "2027");
		
		sendKeys(t.getCcCVV(), "333");
		
		click(t.getBook());
		
		getAttribute(t.getOrderNumber());
	
		
	}
	

}
