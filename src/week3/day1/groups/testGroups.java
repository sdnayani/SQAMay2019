package week3.day1.groups;

import org.testng.annotations.Test;

public class testGroups {
	  @Test(groups = { "functest", "checkintest" })
	  public void testMethod1() {
		  System.out.println("Inside testMethod1");
	  }
	 
	  @Test(groups = {"functest", "checkintest"} )
	  public void testMethod2() {
		  System.out.println("Inside testMethod2()");
	  }
	 
	  @Test(groups = { "functest" })
	  public void testMethod3() {
		  System.out.println("Inside testMethod3()");
	  }
	}
