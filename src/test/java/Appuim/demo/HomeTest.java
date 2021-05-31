package Appuim.demo;

import org.testng.annotations.Test;

public class HomeTest {

	HomePage homepage;
	/*
	@Test
	public void closeDailyTipsPopUp()
	{
		 homepage.closeTipsPopUp();
		
		
	}
	*/
	
	@Test(priority=3)
	public void clickOnServiceTab()
	{
		 homepage=new HomePage();
		 homepage.clickOnService();
		
		
	}
}
