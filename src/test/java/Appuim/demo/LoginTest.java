package Appuim.demo;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class LoginTest extends BaseClass {
	
	@Test(priority=1)
	public void testStart() {
		
		LoginPage lp = new LoginPage();
		lp.start();
		
	}
	
	
	
	@Test(priority=2)
	public void testLoginToApp() {
		
		LoginPage lp = new LoginPage();
		lp.loginToMyEtisalatApp();
		
	}

}
