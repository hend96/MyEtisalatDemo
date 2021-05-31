package Appuim.demo;

import org.testng.annotations.Test;

public class IslamicServiceTest {
	
	IslamicServicePage ip = new IslamicServicePage();
	
	@Test(priority=5)
	public void clickOnBackbtn()
	{
		 ip.clickOnBackbtn();
		
		
	}
	
	
	@Test(priority=6)
	public void clickOnMorebtn()
	{
		 ip.clickOnMore();
		
		
	}

}
