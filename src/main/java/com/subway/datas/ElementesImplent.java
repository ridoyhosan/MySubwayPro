package com.subway.datas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementesImplent {
	WebDriver driver;
	public void diverCrome(){
		System.setProperty("webdriver.chrome.driver", "/Users/mobarokhosan/Downloads/chromedriver");
	    driver = new ChromeDriver();
		driver.get("https://www.subway.com/en-us");
		driver.manage().window().maximize();
//		ChromeDriver driver=new ChromeDriver();
//		 
//		 
//		 
//	       driver.manage().window().maximize();
//	 
//	 
//	 
////	       driver.manage().timeouts().pageLoadTimeout(1, 5000);
//	 
//	 
//	 
//	       driver.get("http://learn-automation.com/");
	}
	public void urlBrowsar(){
		driver.get("www.subway.com");
		driver.manage().window().maximize();
	
	}
	

}
