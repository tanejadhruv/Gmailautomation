package com.qait.automation.HRIS;


import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import junit.framework.Assert;

public class HRIS{	
	String count,newcount;
	WebDriver driver;
	@BeforeClass 
	public void OpenWebpage() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
        this.driver.get("https://accounts.google.com/signin/v2/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
        
	}
	@Test(priority=1)
	public void login() {
	sucess log= new sucess();
	log.valid(driver);
	}
	@Test(priority=2)
	public void unread() {
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	unread mail= new unread();
	String check=mail.verify(driver);
	Assert.assertTrue(check.contains("Inbox"));
	count= mail.count(driver);
	

	}
	@Test(priority=3)
	public void open() {
		unread mail= new unread();
		open msg = new open();
		msg.read(driver);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		newcount= mail.count(driver);
		int icount = Integer.parseInt(count);
		int inewcount = Integer.parseInt(newcount);
		System.out.println(icount);
		System.out.println(inewcount);
		Assert.assertTrue(icount>inewcount);
		
		
	}
	
	@Test(priority=4)
	public void email() {
		send email=new send(driver);
		String sent=email.check(driver);
		Assert.assertTrue(sent.contains("Message sent"));
		
	}
/*	@AfterClass 
	public void CloseWebpage() {
		driver.close();
		}*/
}