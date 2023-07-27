package org.StockApplication.PageObject;

import org.StockApplication.Utils.AndroidActions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class CreateAccount extends AndroidActions{

	AndroidDriver driver;
	public CreateAccount(AndroidDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(xpath="//android.widget.TextView[@index='4']")
	private WebElement acceptAgriment;
	
	@AndroidFindBy(id="com.alifesoftware.stocktrainer:id/registrationLink")
	private WebElement goToRegistration;
	
	@AndroidFindBy(id="com.alifesoftware.stocktrainer:id/inputId_nameValue")
	private WebElement giveFullName;
	
	@AndroidFindBy(id="com.alifesoftware.stocktrainer:id/inputId_emailValue")
	private WebElement giveEmail;
	
	@AndroidFindBy(id="com.alifesoftware.stocktrainer:id/inputId_passwordValue")
	private WebElement addPassword;
	
	@AndroidFindBy(id="com.alifesoftware.stocktrainer:id/inputId_confirmPasswordValue")
	private WebElement confirmPassword;
	
	@AndroidFindBy(id="com.alifesoftware.stocktrainer:id/countrySpinner")
	private WebElement countrySpinner;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='India']")
	private WebElement SelectCountry;
	
	@AndroidFindBy(id="com.alifesoftware.stocktrainer:id/securityQuestionOne")
	private WebElement enterSecurutyQ1;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Last name of your favorite teacher?']")
	private WebElement SelectQ1;
	
	@AndroidFindBy(id="com.alifesoftware.stocktrainer:id/inputId_firstSecurityAnswer")
	private WebElement answerQ1;
	
	@AndroidFindBy(id="com.alifesoftware.stocktrainer:id/securityQuestionTwo")
	private WebElement enterSecurityQ2;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Your childhood hero?']")
	private WebElement SelectQ2;
	
	@AndroidFindBy(id="com.alifesoftware.stocktrainer:id/inputId_secondSecurityAnswer")
	private WebElement answerQ2;
	
	@AndroidFindBy(id="com.alifesoftware.stocktrainer:id/securityQuestionThree")
	private WebElement enterSecurityQ3;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='In which city did your parents meet?']")
	private WebElement SelectQ3;
	
	@AndroidFindBy(id="com.alifesoftware.stocktrainer:id/inputId_thirdSecurityAnswer")
	private WebElement answerQ3;

	@AndroidFindBy(id="com.alifesoftware.stocktrainer:id/registerButton")
	private WebElement goTOregister;

	public void AcceptAgriment()
	{
		acceptAgriment.click();
	}
	
	public void RegisternewAccount()
	{
		goToRegistration.click();
	}
	
	public void fillForm()
	{
		giveFullName.sendKeys("Vinay jackson");
		giveEmail.sendKeys("vinayjackson@yahoo.com");
		addPassword.sendKeys("Vinay@123");
		confirmPassword.sendKeys("Vinay@123");
		countrySpinner.click();
		scrollTOtext("India");
		SelectCountry.click();
		enterSecurutyQ1.click();
		scrollTOtext("Last name of your favorite teacher?");
		SelectQ1.click();
		answerQ1.sendKeys("abc");
		enterSecurityQ2.click();
		scrollTOtext("Your childhood hero?");
		SelectQ2.click();
		answerQ2.sendKeys("xyz");
		scrollTOtext("REGISTER NEW ACCOUNT");
		enterSecurityQ3.click();
		scrollTOtext("In which city did your parents meet?");
		SelectQ3.click();
		answerQ3.sendKeys("abcd");
		goTOregister.click();
	}
	
	public HomePage goToHomePage()
	{
		
		return new HomePage(driver);
	
	}
	
}
