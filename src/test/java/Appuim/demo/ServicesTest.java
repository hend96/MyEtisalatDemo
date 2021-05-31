package Appuim.demo;

import org.testng.annotations.Test;

public class ServicesTest {

	ServicesPage sp = new ServicesPage();
	
	@Test(priority=4)
	public void clickOnIslamic()
	{
		 sp.clickOnIslamic();
		
		
	}
	
}
