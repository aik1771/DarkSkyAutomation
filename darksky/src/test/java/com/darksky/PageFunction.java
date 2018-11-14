package com.darksky;

import static org.junit.Assert.fail;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class PageFunction {
	
	public static String temperature,numericTemperature,temperatureRange;
	public static int currentTemperature,lowTemperature,highTemperature;
	
	public static void clearContent(By locator) throws InterruptedException {
        DriverWrapper.getDriver().findElement(locator).clear();
        Thread.sleep(2000);
    }
	
	public static void setValue(By locator, String text) throws InterruptedException {
        DriverWrapper.getDriver().findElement(locator).sendKeys(text);
        Thread.sleep(2000);
        
        
    }
	
	public static void clickOn(By locator) throws InterruptedException {
		Thread.sleep(2000);
		
        DriverWrapper.getDriver().findElement(locator).click();
        Thread.sleep(3000);
         
    }
	
	public static void getTemperature(By locator)
	{
		temperature=DriverWrapper.getDriver().findElement(locator).getText();
	
	    String[] numericTemperature = temperature.split("˚");
	    
	    System.out.println("Temperature is " + numericTemperature[0]);
	   
	    
		//System.out.println("Temperature is " + Integer.parseInt(numericTemperature));
		
		currentTemperature=Integer.parseInt(numericTemperature[0]);
	}
	
	public static void checkRange(By locator)
	{
		temperatureRange=DriverWrapper.getDriver().findElement(locator).getText();
		String[] lowTemp = temperatureRange.split("Low");
		String[] highTemp = temperatureRange.split("High");
		String[] getHigh = highTemp[1].split("˚");
		String[] getLow = lowTemp[1].split("˚");
		String t1=getLow[0];
		String t2=getHigh[0];
		t1=t1.replaceAll("\\s","");
		t1=t1.replaceAll("[^\\d.]", "");
		t2=t2.replaceAll("\\s","");
		t2=t2.replaceAll("[^\\d.]", "");
		
	
		lowTemperature = Integer.parseInt(t1);
	    highTemperature= Integer.parseInt(t2);
	   
	   if (currentTemperature >= lowTemperature || currentTemperature <= highTemperature)
	   {
		   System.out.println("You current temperature of " + currentTemperature + 
				   " is in the range "+ lowTemperature + " and " + highTemperature);
		   
	   }
	   else
	   {
		   System.out.println("You current temperature of " + currentTemperature + 
				   " is not in the range "+ lowTemperature + " and " + highTemperature);
		   
	   }
	  
		
		
	}
	
	

}
