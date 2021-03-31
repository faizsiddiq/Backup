






package org.cts;

import java.io.IOException;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.poi.common.usermodel.Fill;



public class AssertJunit extends LibGlobal {
	
	
	@BeforeClass
	
	public  static void launchBrowser() {
				
		launchbrowser();
		loadurl("http://adactinhotelapp.com/");
		String title = driver.getTitle();
		Assert.assertTrue("check the url",title.contains("Adactin.com"));
		
	}
	@Test
	
	public void tc1() throws IOException {
		
		PojoAdactin p = new PojoAdactin();
		
		fill(p.getTxtname(),ExcelRead(1, 0));
		
		String thetextFromAttribute2 = getThetextFromAttribute(p.getTxtname(), "value");
		
		Assert.assertEquals("check the username", ExcelRead(1, 0), thetextFromAttribute2);
		
		fill(p.getTxtpass(), ExcelRead(1, 1));
		
		String thetextFromAttribute3 = getThetextFromAttribute(p.getTxtpass(), "value");
		
		Assert.assertEquals("check the password", ExcelRead(1, 1), thetextFromAttribute3);
		
		clickbutton(p.getBtnlogin());
		
		
		
	}
	
	
	

}
