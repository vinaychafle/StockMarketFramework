package org.StockApplication.PageObject;

import org.StockApplication.Utils.AndroidActions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class AnyomusSignIn extends AndroidActions {

	public AndroidDriver driver;

    public AnyomusSignIn(AndroidDriver driver) {

        super(driver);

        this.driver=driver;

        PageFactory.initElements(new AppiumFieldDecorator(driver), this);

    }

    

    @AndroidFindBy(id="com.alifesoftware.stocktrainer:id/anonymousLoginButton")

    private WebElement anonymousButton;

    //android.widget.LinearLayout[@index='7']

    @AndroidFindBy(xpath="//android.widget.LinearLayout[@index='7']")

    private WebElement CountryNameS;

    

    @AndroidFindBy(id="com.alifesoftware.stocktrainer:id/md_buttonDefaultPositive")

    private WebElement SelectButton;

    

    //com.alifesoftware.stocktrainer:id/md_buttonDefaultPositive

    @AndroidFindBy(id="com.alifesoftware.stocktrainer:id/md_buttonDefaultPositive")

    private WebElement OkButton;

    

    public void ClickOnanonymousButton() {

        anonymousButton.click();

    }

    

    public void ClickOnCountryName() {

        CountryNameS.click();
        SelectButton.click();
        OkButton.click();

    }
}
