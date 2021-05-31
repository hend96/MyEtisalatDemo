package Appuim.demo;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class BaseClass {
	
	public static AppiumDriver<MobileElement> driver;
	@BeforeTest
	public void connect() throws MalformedURLException {
		
		DesiredCapabilities caps = new DesiredCapabilities();
		
			
		caps.setCapability("automationName", "UiAutomator1");
		caps.setCapability("platformName", "Android");
		caps.setCapability("platformVersion", "7.0");
		caps.setCapability("deviceName", "api24");
		caps.setCapability("app", "C:\\\\Users\\elnagdy\\Downloads\\MyEtisalat-master-prod-debug-debug.apk");
		//caps.setCapability("browserName", "Chrome");
		//caps.setCapability("chromedriverExecutable","chromedriver.exe");

		caps.setCapability("fullReset", "false");
		caps.setCapability("noReset", "true");
		
		 driver = new AppiumDriver<MobileElement> (new URL("http://0.0.0.0:4723/wd/hub"), caps);
		
	/*	 MobileElement btn = driver.findElement(By.id("waitingButtonTest"));
		 btn.click();*/
	}
	
	
	public static MobileDriver<MobileElement> getDriver(){
		
		return driver;
		
	}

}
