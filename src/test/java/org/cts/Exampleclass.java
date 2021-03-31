package org.cts;


import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Exampleclass extends LibGlobal  {
	
	@BeforeClass
	
	private void launchBrowser() {
		

		WebDriverManager.chromedriver().setup();
		launchbrowser();
		loadurl("https://www.facebook.com/");
		
	}
	

	
	@BeforeMethod
	
	private void startTime() {
		
		Date d = new Date();
		System.out.println(d);
		

	}
	@AfterMethod
	
	private void endsTime() {
		Date d = new Date();
		System.out.println(d); 

	}
	@Parameters({"email","pass"})
	@Test
	
	private void tc1(@Optional("pyhton")String username,@Optional("pyhton@123")String password) {
		
		WebElement txtuser = driver.findElement(By.id("email"));
		txtuser.sendKeys(username);
		WebElement txtpass = driver.findElement(By.id("pass"));
		txtpass.sendKeys(password);
		WebElement btnlogin = driver.findElement(By.name("login"));
		btnlogin.click();
		

	}
	
	
	
	
	
	
	

	}
	
	
	
	
	
	
	
	


