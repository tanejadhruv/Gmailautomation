package com.qait.automation.HRIS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class send {

	public send(WebDriver driver) {
		driver.findElement(By.cssSelector("#\\3a yj > div > div")).click();
	}
	public String check(WebDriver driver) {
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	driver.findElement(By.xpath("//*[@id=\":169\"]")).sendKeys("Email");
	driver.findElement(By.cssSelector("#\\3a 16w")).sendKeys("This Is An Auto Genrated E-Mail");
	driver.findElement(By.cssSelector("#\\3a 15h")).click();
	try {
		Thread.sleep(10000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	String ms=driver.findElement(By.cssSelector("body > div:nth-child(17) > div.nH.a4O > div > div.nH.w-asV.aiw > div:nth-child(6) > div.no > div > div:nth-child(3) > div > div > div.vh > span > span.bAq")).getText();
	return ms;
	}
}
