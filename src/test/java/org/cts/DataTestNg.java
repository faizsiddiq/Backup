
package org.cts;


import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataTestNg extends LibGlobal {
	
	@BeforeClass
	
	private void launchBrowser() {
		
		WebDriverManager.chromedriver().setup();
		launchbrowser();
		
		
		
	}
	@AfterClass
	
	private void closewindows() {
		quittheWindow();

	}
	
	@BeforeMethod
	
	private void StartsTime() {
		
		Date d = new Date();
		System.out.println(d);
		

	}
	
	@AfterMethod
	
	private void endstime() {
		Date d = new Date();
		System.out.println(d);

	}
	
	@Test(dataProvider="sampledata")
	
	private void tc1(String username,String password) throws InterruptedException {
		
		loadurl("https://www.facebook.com/");
		
		
		WebElement txtuser = driver.findElement(By.id("email"));
		txtuser.sendKeys(username);
		WebElement txtpass = driver.findElement(By.id("pass"));
		txtpass.sendKeys(password);
		WebElement btnlogin = driver.findElement(By.name("login"));
		btnlogin.click();
		
		Thread.sleep(3000);
		
	}
	@DataProvider(name="sampledata")
	public Object[][] data() {
		
		return new Object[][] {
			
			{"java","java@123"},{"sql","sql@23"},{"pyhton","python@123"},{"selenium","selenium@123"}
			
		

	};
	
	
	
	}
	
}
