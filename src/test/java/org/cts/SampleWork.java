package org.cts;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class SampleWork  extends LibGlobal{
	
	public static void main(String[] args) throws IOException {
		
		launchbrowser();
		loadurl("http://adactinhotelapp.com/index.php");
		maxwindow();
		
		PojoAdactin p = new PojoAdactin();
		
		fill(p.getTxtname(), ExcelRead(1, 0));
		fill(p.getTxtpass(), ExcelRead(1, 1));
		clickbutton(p.getBtnlogin());
		selectIndex(p.getDroplocation(), 1);
		selectIndex(p.getDrophotel(),2);
		selectIndex(p.getDroptype(), 3);
		selectIndex(p.getDroprooms(),2);
		fill(p.getCheckin(), ExcelRead(1, 2));
		fill(p.getCheckout(), ExcelRead(1, 3));
		selectIndex(p.getDropadult(),2);
		selectIndex(p.getDropchild(),1);
		submitbutton(p.getClicksubmit());
		clickbutton(p.getRadio());
		clickbutton(p.getBtnclick());
		fill(p.getTxtfirstname(), ExcelRead(1, 4));
		fill(p.getTxtlastname(), ExcelRead(1, 5));
		fill(p.getTxtaddress(),ExcelRead(1, 6));
		fill(p.getTxtcard(), ExcelRead(1, 7));
		selectIndex(p.getDropcardtype(), 2);
	
		selectIndex(p.getDropexpmonth(), 2);
		selectIndex(p.getDropexpyear(), 2);
		fill(p.getTxtcvvno(), ExcelRead(1, 8));
		clickbutton(p.getBtnbook());
		implicitwaitsecond(10,TimeUnit.SECONDS);
		getThetextFromAttribute(p.getTxtorderno(), "value");

	}	

}
