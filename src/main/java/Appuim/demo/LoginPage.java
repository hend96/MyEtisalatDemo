package Appuim.demo;


import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class LoginPage extends BaseClass {
	
	 public LoginPage() {
		 
		 BaseClass.getDriver();
	 }
	
	public void start() {
		String btnGetStartID="com.etisalat:id/proceed_to_login_btn";
		WebDriverWait wait= new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(btnGetStartID)));
		
		MobileElement btnGetStart = driver.findElement(By.id(btnGetStartID));
		btnGetStart.click();

		
	}
	
	
	public void loginToMyEtisalatApp()
	{
		String txtMailXpath="com.etisalat:id/etLogin";
		String btnProcessXpath="com.etisalat:id/btnProceedLogin";

		
		String txtPassXpath="com.etisalat:id/password_input";
		
		String btnPassWordXpath="com.etisalat:id/proceed_login_btn";
		
		MobileElement txtMailXpathElement = driver.findElement(By.id(txtMailXpath));
		txtMailXpathElement.sendKeys("mary@etisalat.com");
		
		MobileElement processBtn = driver.findElement(By.id(btnProcessXpath));
		processBtn.click();
		
		MobileElement txtPassXpathElement = driver.findElement(By.id(txtPassXpath));
		txtPassXpathElement.sendKeys("Welcome1");
		
		MobileElement passwordBtn = driver.findElement(By.id(btnPassWordXpath));
		passwordBtn.click();
		
		
		
		 
		
		
	}
	
	
	public void closeDailyGiftsPopUp()
	{
		
		MobileElement closesign = driver.findElement(By.id("com.etisalat:id/DailyGiftsClose"));
		closesign.click();
	}

}
