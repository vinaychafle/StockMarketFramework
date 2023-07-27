package org.StockApplication.PageObject;

import java.time.Duration;

import org.StockApplication.Utils.AndroidActions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class SignInWithGoogle extends AndroidActions {

	public AndroidDriver driver;

	public SignInWithGoogle(AndroidDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);

	}

	// android.widget.Button[@text='Sign in']

	@AndroidFindBy(xpath = "//android.widget.Button[@text='Sign in']")

	private WebElement SigninButton;

	// android.view.View[@index='2']

	@AndroidFindBy(xpath = "//android.widget.EditText[@index='0']")

	private WebElement EmailField;

	// android.widget.Button[@text='NEXT']

	@AndroidFindBy(xpath = "//android.widget.Button[@text='NEXT']")

	private WebElement NextButton;

	// android.widget.EditText[@index='0']

	@AndroidFindBy(xpath = "//android.widget.EditText[@index='0']")

	private WebElement passwordField;

	public void SignUpWithGoogleOption(String username, String password) throws InterruptedException {

		SigninButton.click();
		Thread.sleep(5000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOf(EmailField));
		EmailField.sendKeys(username);
		NextButton.click();
		Thread.sleep(5000);
		passwordField.sendKeys(password);
		NextButton.click();
	}
}
