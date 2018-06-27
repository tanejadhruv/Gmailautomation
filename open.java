package com.qait.automation.HRIS;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class open {

	public void read(WebDriver driver){
		List<WebElement> unreademeil = driver.findElements(By.xpath("//*[@class='zF']"));
		for(int i=0;i<unreademeil.size();i++){
		    if(unreademeil.get(i).isDisplayed()==true){
		        	unreademeil.get(i).click();
		            break;
		        }
		    }
	}
	
}

