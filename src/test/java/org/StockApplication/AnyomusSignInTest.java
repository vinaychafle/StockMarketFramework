package org.StockApplication;

import org.StockApplication.PageObject.AnyomusSignIn;
import org.StockApplication.PageObject.CreateAccount;
import org.StockMarket.TestUtils.BaseTest1;
import org.testng.annotations.Test;

public class AnyomusSignInTest extends BaseTest1 {

	@Test

    public void LoginwithAnonymousAccOption() throws InterruptedException {

		CreateAccount ca=new CreateAccount(driver);
    	ca.AcceptAgriment();
        AnyomusSignIn anonymousAcc = new AnyomusSignIn(driver);

        anonymousAcc.ClickOnanonymousButton();

        anonymousAcc.ClickOnCountryName();

        Thread.sleep(5000);

    }
}
