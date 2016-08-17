package tests;

import junit.framework.Assert;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;

@SuppressWarnings("deprecation")
public class LoginTest {
	
	@Rule
	public ErrorCollector errCol = new ErrorCollector();
	
	
	//@SuppressWarnings("deprecation")
	@Test
	public void testApp(){
		// selenium code login
		System.out.println("A");
		try{
			//Assert.assertEquals(expected, actual);
			Assert.assertEquals("Hello", "Hello");
		}catch(Throwable t){
			// code to report error
			errCol.addError(t);
			System.out.println("error");
		}
		System.out.println("B");
		try{
			Assert.assertTrue("Link not present", false);
		}catch(Throwable t){
			errCol.addError(t);
		}
		
		System.out.println("Ending test");

		
		
		
	}

}
