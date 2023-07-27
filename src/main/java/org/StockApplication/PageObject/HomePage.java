package org.StockApplication.PageObject;

import org.StockApplication.Utils.AndroidActions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class HomePage extends AndroidActions{

	AndroidDriver driver;
	public HomePage(AndroidDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='GREAT']")
	private WebElement clickOnGreat;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='OK']")
	private WebElement closeAlert;
	
	@AndroidFindBy(xpath="//android.widget.ImageButton[@index='0']")
	private WebElement imageButton;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='vinayjackson@yahoo.com']")
	private WebElement accountClick;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Logout']")
	private WebElement logout;
	
	@AndroidFindBy(id="com.alifesoftware.stocktrainer:id/md_buttonDefaultPositive")
	private WebElement confirmlogout;

	public void WelcomeAlertClose() throws InterruptedException
	{
		clickOnGreat.click();
		closeAlert.click();
	    Thread.sleep(3000);
	}
	
	public void logout() throws InterruptedException
	{
		imageButton.click();
		Thread.sleep(3000);
		accountClick.click();
		logout.click();
		Thread.sleep(3000);
		confirmlogout.click();
		
	}
	
	
}
