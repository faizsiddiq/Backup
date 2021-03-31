package org.cts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Democlass extends LibGlobal {
	
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
		WebElement btnsearch = driver.findElement(By.xpath("//input[@value=\"Go\"]"));
		btnsearch.click();
	}
	
	@Test
	
	private void getIphone() {
		List<WebElement> iphones = driver.findElements(By.xpath("//span[contains(text(),\"Apple iphone\")]"));
		
		for (WebElement elements : iphones) {
			System.out.println(elements.getText());
			
		}
			
			
		}
		

	}
	
