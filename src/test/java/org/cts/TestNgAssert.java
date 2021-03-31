package org.cts;


	import java.io.IOException;
	import java.util.Date;
	import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.testng.annotations.AfterClass;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;
	
	public class TestNgAssert extends LibGlobal {
		
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
		//hardAssert
		@Test
		
		private void tc1() throws IOException {
			
			PojoAdactin p = new PojoAdactin();
			
			fill(p.getTxtname(), ExcelRead(1, 0));
			String username = getThetextFromAttribute(p.getTxtname(),"value");
			Assert.assertEquals("check the username", ExcelRead(1, 0), username);
			fill(p.getTxtpass(), ExcelRead(1, 1));
			clickbutton(p.getBtnlogin());
			
			
		}
		//softAssert
		@Test
		
		private void tc2() throws IOException {
			
			PojoAdactin d = new PojoAdactin();
			
			SoftAssert s = new SoftAssert();
			
			selectIndex(d.getDroplocation(), 1);
			selectIndex(d.getDrophotel(), 2);
			selectIndex(d.getDroptype(), 3);
			selectIndex(d.getDroprooms(), 2);
			fill(d.getCheckin(), ExcelRead(1, 2));
			String checkin = getThetextFromAttribute(d.getCheckin(), "value");
			s.assertEquals(checkin, ExcelRead(1, 2), "check the checkin");
			fill(d.getCheckout(),ExcelRead(1, 3));
			String checkout = getThetextFromAttribute(d.getCheckout(), "value");
			s.assertEquals(checkout, ExcelRead(1, 3), "check the checkout");
			selectIndex(d.getDropadult(), 2);
			selectIndex(d.getDropchild(), 2);
			submitbutton(d.getClicksubmit());
			
			
		}

}
