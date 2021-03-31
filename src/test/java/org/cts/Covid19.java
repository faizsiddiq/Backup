package org.cts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Covid19 extends LibGlobal {
	
	@BeforeClass
	
	private void launchBrowser() {
		
		launchbrowser();
		maxwindow();
	}
	
	
	@Test
	
	private void tc2() {
		driver.get("https://covidindia.org/");
		List<WebElement> row = driver.findElements(By.xpath("(//table//tr//td[@class=\"column-1\"]"));
		List<WebElement> rows = driver.findElements(By.xpath("(//table//tr//td[@class=\"column-2\"]"));
		
		
		for (int i = 0; i < row.size(); i++) {
			
			String text = row.get(i).getText();
			String text2 = rows.get(i).getText();
			System.out.println(text);
			System.out.println(text2);
			
			
		}
			
		}
	

	}

