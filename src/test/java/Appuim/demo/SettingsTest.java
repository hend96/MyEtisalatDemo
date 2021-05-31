package Appuim.demo;

import org.testng.annotations.Test;

public class SettingsTest {
	
	
	SettingsPage sp= new SettingsPage();
	
	@Test(priority=8)
	public void clickOnSignout()
	{
		sp.clickOnSignout();
		
		
	}

	
	@Test(priority=9)
	public void clickOnMorebtn()
	{
		sp.clickOnOK();
		
		
	}

}
