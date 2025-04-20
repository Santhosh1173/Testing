package org.test;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
public class BaseClass {
	
	public static WebDriver driver;
	
			public static WebDriver browserLaunch(String browser) {
				switch(browser) {
				case "chrome":
					WebDriverManager.chromedriver().setup();
					driver = new ChromeDriver();
					break;
				case "edge":
					WebDriverManager.edgedriver().setup();
					driver = new EdgeDriver();
					break;
				case "firefox":
					WebDriverManager.firefoxdriver().setup();
					driver = new FirefoxDriver();
					break;
				}
				
				return driver;
			}
			
			public static void url(String s) {
				driver.get(s);
				driver.manage().window().maximize();
			}
			
			public static void sendkeys(WebElement e,String s) {
				e.sendKeys(s);
			}
            public static void btnclick(WebElement e) {
            	e.click();
			} 		
		    public static void quit(WebDriver e) {
			    e.quit();
			   
		    }
		    public static void close(WebDriver e) {
		    	e.close();
			}
		    public static void wait(int i) {
		    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(i));
			}
		    public static void genderradiobutton(WebElement e) {
		    	e.click();
			}
		    public static void select(WebElement e,String d) {
		    	Select s = new Select(e);
		    	s.selectByVisibleText(d);	
			}
            	
}
