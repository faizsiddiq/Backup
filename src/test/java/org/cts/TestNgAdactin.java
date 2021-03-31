package org.cts;

import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNgAdactin extends LibGlobal {
	
	
	@BeforeClass
	
	private void launchBrowser(){
		
		WebDriverManager.chromedriver().setup();
		launchbrowser();
		loadurl("http://adactinhotelapp.com/");
		
		
	}
	@AfterClass
	
	private void closebrowser() {
		quittheWindow();
		

	}
	@BeforeMethod
	
	private void startsTime() {
		Date d = new Date();
		System.out.println(d);

	}
	@AfterMethod
	
	private void endstime() {
		
		Date d = new Date();
		System.out.println(d);
		
		
	}
	
	@Test
	
	private void tc1() throws IOException {
		
		PojoAdactin p = new PojoAdactin();
		
		fill(p.getTxtname(), ExcelRead(1, 0));
		fill(p.getTxtpass(), ExcelRead(1, 1));
		clickbutton(p.getBtnlogin());
		
		
	}
	
	@Test
	
	private void tc2() throws IOException {
		
		PojoAdactin d = new PojoAdactin();
		
		selectIndex(d.getDroplocation(), 1);
		selectIndex(d.getDrophotel(), 2);
		selectIndex(d.getDroptype(), 3);
		selectIndex(d.getDroprooms(), 2);
		fill(d.getCheckin(), ExcelRead(1, 2));
		fill(d.getCheckout(),ExcelRead(1, 3));
		selectIndex(d.getDropadult(), 2);
		selectIndex(d.getDropchild(), 2);
		submitbutton(d.getClicksubmit());
		
		
	}
	
	@Test
	
	private void tc3() {
	
		PojoAdactin g= new PojoAdactin();
		
		clickbutton(g.getRadio());
		submitbutton(g.getBtnclick());

	}
	@Test
	
	private void tc4() throws IOException {
		PojoAdactin f = new PojoAdactin();
		
		fill(f.getTxtfirstname(), ExcelRead(1, 4));
		fill(f.getTxtlastname(), ExcelRead(1, 5));
		fill(f.getTxtaddress(), ExcelRead(1, 6));
		fill(f.getTxtcard(), ExcelRead(1, 7));
		selectIndex(f.getDropcardtype(), 2);
		selectIndex(f.getDropexpmonth(), 2);
		selectIndex(f.getDropexpyear(), 2);
		fill(f.getTxtcvvno(), ExcelRead(1, 8));
		clickbutton(f.getBtnbook());
		implicitwaitsecond(10, TimeUnit.SECONDS);
		getThetextFromAttribute(f.getTxtorderno(), "value");
		
		
	
		
		
		
		
		
		

	}
	
	
	
	
	

		

	}
	
	
	

