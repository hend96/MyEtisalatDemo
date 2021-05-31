package Appuim.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IslamicServicePage extends BaseClass{
	
	public IslamicServicePage()
	{
		
		BaseClass.getDriver();
	}
	
	
	public void clickOnBackbtn()
	{
		String backBath="//android.widget.ImageButton[@content-desc=\"‎‏‎‎‎‎‎‏‎‏‏‏‎‎‎‎‎‎‏‎‎‏‎‎‎‎‏‏‏‏‏‏‏‏‏‏‎‏‎‎‎‏‏‎‏‎‎‎‏‏‎‎‎‏‏‏‏‎‏‎‎‎‎‏‏‎‏‏‎‏‎‎‏‎‎‏‎‎‎‎‎‎‏‎‏‎‎‎‎‏‏‏‎‎‎‎‎Navigate up‎‏‎‎‏‎\"]";
		
		WebDriverWait wait= new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(backBath)));
		
		WebElement backBtn = driver.findElement(By.xpath(backBath));
		backBtn.click();
		
		
		
	}
	
	
	public void clickOnMore()
	{
		
       String moreID="com.etisalat:id/nav_more";
		
		WebDriverWait wait= new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(moreID)));
		
		WebElement moreBtn = driver.findElement(By.id(moreID));
		moreBtn.click();
		
	}

}
