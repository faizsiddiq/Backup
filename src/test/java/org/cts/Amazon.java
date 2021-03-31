package org.cts;


import java.util.LinkedHashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.CloseWindow;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Amazon extends LibGlobal {
	
	@BeforeClass
	
	private void launchBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ashick\\eclipse-workspace\\selenium11.30\\Drivers\\chromedriver.exe");
	      driver= new ChromeDriver();
		}
	@AfterClass
	
	private void closeBrowser() {
		driver.quit();
	}
	
	@BeforeMethod
	
	private void searchIphone() {
		driver.get("https://www.amazon.in/");
		
		WebElement txtsearch = driver.findElement(By.id("twotabsearchtextbox"));
		txtsearch.sendKeys("Iphone");
		WebElement btnsearch = driver.findElement(By.xpath("//form[@class=\"nav-searchbar\"]"));
		clickbutton(btnsearch);
	}
	@Test
	
	private void getIphone() {
		String s=null;
		
		List<WebElement> iphones = driver.findElements(By.xpath("//span[contains(text(),'Apple iphone')]"));
		LinkedHashSet<String> setIphone = new LinkedHashSet<String>();
		int size = iphones.size();
		
		
		for (int i = 0; i < iphones.size(); i++) {
			s = iphones.get(i).getText();
			System.out.println(s);
			setIphone.add(s);
			
		}
		
		int size2 = setIphone.size();
		
		for (String a : setIphone) {
			System.out.println(a);
			
		}
		System.out.println("size of list of iphones "+size);
		System.out.println("size after removing duplicates "+size2);
		

	}
	
}
	
	
	
	
	
	
		

	
		

	


