package com.darksky;

import org.openqa.selenium.By;

public class PageElements extends PageFunction {
	
	
	 private static By searchField = By.xpath("//input[@type='text']");
	 private static By searchButton = By.xpath("//a[@class='searchButton']//img[@width='16']");
	 private static By temperature = By.xpath("//span[@class='summary swap']");
	 private static By checkRange = By.xpath("//span[@class='summary-high-low']");
	 
	
	 public static void clickSearchField() throws InterruptedException
	    {
	    	clearContent(searchField);
	    }
	 
	 public static void setSearchField() throws InterruptedException
	 {
		 setValue(searchField,"1923 Emmons Avenue, New York City, NY");
		 Thread.sleep(5000);
		
		
	 }
	 
	 public static void clickSearch() throws InterruptedException
	 {
	
		 Thread.sleep(1000);
		clickOn(searchButton);
		 
	 }
	 
	 public static void findTemperature()
	 {
		 getTemperature(temperature);
	 }
	 
	 public static void checkTemepratureRange()
	 {
		 checkRange(checkRange);
		 
	 }

}
