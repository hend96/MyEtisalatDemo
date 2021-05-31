package Appuim.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BaseClass{
	
	
	public HomePage()
	{
		
		BaseClass.getDriver();
	}
	
	
	public void closeTipsPopUp()
	{
		String closeIcon = "com.etisalat:id/DailyGiftsClose";
		WebDriverWait wait= new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(closeIcon)));
		
		WebElement closeIconBtn = driver.findElement(By.id(closeIcon));
		closeIconBtn.click();
		
		
	}

	
	public void clickOnService()
	{
		String serviceIcon = "com.etisalat:id/nav_services";
		WebDriverWait wait= new WebDriverWait(driver,60);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(serviceIcon)));
		
		WebElement serviceBtn = driver.findElement(By.id(serviceIcon));
		serviceBtn.click();
		
		
	}

	
	

}
