package org.cts;

import java.util.List;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class AssertRunner {
	
	
	@Test
	
	public void tc4() {
		
		Result r = JUnitCore.runClasses(AssertJunit.class,AssertJunit2.class,Assertjunit3.class);
		System.out.println("Run Count"+r.getRunCount());
		System.out.println("Failure Count"+r.getFailureCount());
		System.out.println("Run Time" +r.getRunTime());
		
		
		
		
		  List<Failure> failures = r.getFailures();
		  
		  for (Failure failure : failures) {
			  System.out.println(failures);
			
		}

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
