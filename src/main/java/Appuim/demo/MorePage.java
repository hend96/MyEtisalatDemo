package Appuim.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MorePage extends BaseClass {
	
	
	public MorePage()
	{
		
		BaseClass.getDriver();
	}
	
	public void clickOnSettings()
	{
		
		String settingsBtnid = "com.etisalat:id/btnSettings";
		WebDriverWait wait= new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(settingsBtnid)));
		
		WebElement settingsBtn = driver.findElement(By.id(settingsBtnid));
		settingsBtn.click();
	}

}
