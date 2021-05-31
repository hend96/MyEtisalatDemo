package Appuim.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ServicesPage extends BaseClass {
	
	
	public ServicesPage()
	{
		BaseClass.getDriver();
		
	}
	
	
	public void clickOnIslamic()
	{
		String islamicOption = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[12]/android.widget.ImageView";
		WebDriverWait wait= new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(islamicOption)));
		
		WebElement islamicBtn = driver.findElement(By.xpath(islamicOption));
		islamicBtn.click();
		
		
	}

}
