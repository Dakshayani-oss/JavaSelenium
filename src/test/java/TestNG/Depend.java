package TestNG;

import org.testng.annotations.Test;

public class Depend {
		
		@Test(enabled = false)
	    public void createContact() {
	        System.out.println("Contact Created");
			
		}
		@Test(invocationCount = 3)
//	    @Test(dependsOnMethods = "createContact")
		public void modifyContact() {
			System.out.println("Contact Modified");
		}
	    @Test
//	    @Test(dependsOnMethods = "createContact")
		public void deleteContact() {
			System.out.println("Contact Deleted");
		}
	}

