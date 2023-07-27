package org.StockApplication;

import java.net.MalformedURLException;
import java.time.Duration;

import org.StockApplication.PageObject.CreateAccount;
import org.StockApplication.PageObject.HomePage;
import org.StockMarket.TestUtils.BaseTest1;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class StockMarketTest extends BaseTest1 {

	@Test
	public void StartApp() throws MalformedURLException, InterruptedException
	{
		
    	CreateAccount ca=new CreateAccount(driver);
    	ca.AcceptAgriment();
    	ca.RegisternewAccount();
    	ca.fillForm();
    	ca.waitForElementToAppear(driver);
    	HomePage homePage=ca.goToHomePage();
    	homePage.WelcomeAlertClose();
    	homePage.logout();
		       
	}
}
