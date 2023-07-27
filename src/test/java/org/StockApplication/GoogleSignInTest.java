package org.StockApplication;

import org.StockApplication.PageObject.CreateAccount;
import org.StockApplication.PageObject.SignInWithGoogle;
import org.StockMarket.TestUtils.BaseTest1;
import org.testng.annotations.Test;
 

public class GoogleSignInTest extends BaseTest1 {

	@Test

    public void SigninwithGoogleOption() throws InterruptedException {

		CreateAccount ca=new CreateAccount(driver);
    	ca.AcceptAgriment();

    	SignInWithGoogle signinwithgoogleoption=new SignInWithGoogle(driver);

        signinwithgoogleoption.SignUpWithGoogleOption("vinaychafle@gmail.com", "1234");

    }
	
}
