package com.qait.automation.HRIS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class unread {

	public String count(WebDriver driver)
	{
		String number=driver.findElement(By.cssSelector("#\\3a yq > div > div.aio.UKr6le > div")).getText();
		return number;
	}
public String verify(WebDriver driver)
	{
		
		return driver.findElement(By.cssSelector("#\\3a yq > div > div.aio.UKr6le > span > a")).getText();
		
	}
}
