package org.cts;

import java.io.IOException;

import org.junit.Test;

public class AssertJunit2 extends LibGlobal {
	
	
	@Test
	
	public void tc2() throws IOException {
		
		PojoAdactin n= new PojoAdactin();
		
		selectIndex(n.getDroplocation(),1);
		selectIndex(n.getDrophotel(),2);
		selectIndex(n.getDroptype(), 3);
		selectIndex(n.getDroprooms(),2);
		fill(n.getCheckin(), ExcelRead(1, 2));
		fill(n.getCheckout(), ExcelRead(1, 3));
		selectIndex(n.getDropadult(),2);
		selectIndex(n.getDropchild(),1);
		submitbutton(n.getClicksubmit());
		clickbutton(n.getRadio());
		submitbutton(n.getBtnclick());
		
		
		
		
		
		

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
