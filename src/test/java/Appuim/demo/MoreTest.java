package Appuim.demo;

import org.testng.annotations.Test;

public class MoreTest {

	MorePage mp = new MorePage();
	
	@Test(priority=7)
	public void clickOnSettings()
	{
		mp.clickOnSettings();
		
		
	}
	
}
