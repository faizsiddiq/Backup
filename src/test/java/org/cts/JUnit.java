package org.cts;

import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JUnit extends LibGlobal {
	
	
	@BeforeClass
	public static void launchBrowser() {
		
		launchbrowser();

	}
	@AfterClass
	public static void closeWindow() {
		driver.quit();

	}
	@Before
	public void StartTime() {
		
		Date d = new Date();
		System.out.println(d);


	}
	@After
	
	public void EndsTime() {
		 Date d = new Date();
		 System.out.println(d);

	}
	@Test
	
	public void tc1() {
		loadurl("http://adactinhotelapp.com/");
	

	}
	@Test
	
	public void tc2() throws IOException {
		
		PojoAdactin p = new PojoAdactin();
		fill(p.getTxtname(), ExcelRead(1, 0));
		fill(p.getTxtpass(), ExcelRead(1, 1));
		clickbutton(p.getBtnlogin());
		

	}
	@Test
	public void tc3() throws IOException {
		
		PojoAdactin d = new PojoAdactin();
		
		selectIndex(d.getDroplocation(), 1);
		selectIndex(d.getDrophotel(), 2);
		selectIndex(d.getDroptype(), 3);
		selectIndex(d.getDroprooms(), 2);
		fill(d.getCheckin(), ExcelRead(1, 2));
		fill(d.getCheckout(), ExcelRead(1,3));
		selectIndex(d.getDropadult(), 2);
		selectIndex(d.getDropchild(), 1);
		submitbutton(d.getClicksubmit());
		
		
	}
	@Test
	
	public void tc4() {
		PojoAdactin a = new PojoAdactin();
		
		clickbutton(a.getRadio());
		clickbutton(a.getBtnclick());

	}
	@Test
	
	public void tc5() throws IOException {
		PojoAdactin c = new PojoAdactin();
		
		fill(c.getTxtfirstname(), ExcelRead(1, 4));
		fill(c.getTxtlastname(), ExcelRead(1, 5));
		fill(c.getTxtaddress(), ExcelRead(1, 6));
		fill(c.getTxtcard(), ExcelRead(1, 7));
		selectIndex(c.getDropcardtype(), 2);
		selectIndex(c.getDropexpmonth(), 2);
		selectIndex(c.getDropexpyear(), 2);
		fill(c.getTxtcvvno(), ExcelRead(1, 8));
		clickbutton(c.getBtnbook());
		implicitwaitsecond(10, TimeUnit.SECONDS);
		getThetextFromAttribute(c.getTxtorderno(), "value");
		
		
	}
	
	}
