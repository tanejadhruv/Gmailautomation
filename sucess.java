package com.qait.automation.HRIS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;


public class sucess {

	public void valid(WebDriver driver) {
	driver.findElement(By.cssSelector("#identifierId")).sendKeys("username");
	driver.findElement(By.cssSelector("#identifierNext > content > span")).click();
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	driver.findElement(By.cssSelector("#password > div.aCsJod.oJeWuf > div > div.Xb9hP > input")).sendKeys("password");
	driver.findElement(By.cssSelector("#passwordNext > content > span")).click();
	
	}
	
}
