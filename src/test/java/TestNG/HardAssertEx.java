package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertEx {
@Test
	public void m1() {
		System.out.println("step1");
		System.out.println("step2");
		
		Assert.assertEquals(true, true);
		System.out.println("step3");
		System.out.println("step4");
	}
@Test
public void m2() {
	
	String expData ="Qspiders";
	String actdata ="Qspiders";
	Assert.assertEquals(expData, actdata);
	
	
}
}