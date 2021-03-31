package org.cts;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Test;

public class Assertjunit3  extends LibGlobal{
	
	
	@Test
	
	public void  tc3() throws IOException {
		
		PojoAdactin d = new PojoAdactin();
		
		fill(d.getTxtfirstname(), ExcelRead(1, 4));
		String firstname = getThetextFromAttribute(d.getTxtfirstname(), "value");
		Assert.assertEquals("check the firstname", ExcelRead(1, 4), firstname);
		
		fill(d.getTxtlastname(), ExcelRead(1, 5));
		String lastname = getThetextFromAttribute(d.getTxtlastname(), "value");
		Assert.assertEquals("check the last name", ExcelRead(1, 5), lastname);
		
		fill(d.getTxtaddress(), ExcelRead(1, 6));
		String Address = getThetextFromAttribute(d.getTxtaddress(), "value");
		Assert.assertEquals("check the address", ExcelRead(1, 6), Address);
		
		fill(d.getTxtcard(), ExcelRead(1, 7));
		String card = getThetextFromAttribute(d.getTxtcard(), "value");
		Assert.assertEquals("check the card", ExcelRead(1, 7), card);
		
		selectIndex(d.getDropcardtype(), 2);
		selectIndex(d.getDropexpmonth(), 2);
		selectIndex(d.getDropexpyear(), 2);
		fill(d.getTxtcvvno(), ExcelRead(1, 8));
		String cvvno = getThetextFromAttribute(d.getTxtcvvno(), "value");
		Assert.assertEquals("check the cvv", ExcelRead(1, 8), cvvno);
		clickbutton(d.getBtnbook());
		implicitwaitsecond(10,TimeUnit.SECONDS);
		getThetextFromAttribute(d.getTxtorderno(), "value");
		
	}	
		
}
