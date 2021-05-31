package Appuim.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SettingsPage extends BaseClass{
	
	public SettingsPage()
	{
		BaseClass.getDriver();
		
		
	}

	
	public void clickOnSignout()
	{
		String signout = "com.etisalat:id/btnLogout";

				WebDriverWait wait= new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(signout)));
		
		WebElement logoutBtn = driver.findElement(By.id(signout));
		logoutBtn.click();
		
		
	}
	
	
	public void clickOnOK()
	{
		String signoutOK = "android:id/button1";

				WebDriverWait wait= new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(signoutOK)));
		
		WebElement okBtn = driver.findElement(By.id(signoutOK));
		okBtn.click();
		
		
	}
}
