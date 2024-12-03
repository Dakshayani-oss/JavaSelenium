package TestNG;

import org.testng.annotations.Test;

//@Test   //To execute all Methods
public class SampleTest {
	
	@Test
//	@Test(priority =0)
    public void createContact() {
        System.out.println("Contact Created");
		
	}
    @Test(dependsOnMethods = "createContact")
//	@Test(priority =1)
	public void modifyContact() {
		System.out.println("Contact Modified");
	}
    @Test(dependsOnMethods = "createContact")
//	@Test(priority =2)
//	@Test(priority =-1)
	public void deleteContact() {
		System.out.println("Contact Deleted");
	}
}


