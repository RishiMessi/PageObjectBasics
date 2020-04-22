package com.w2a.rough;

import com.w2a.base.Page;
import com.w2a.pages.HomePage;
import com.w2a.pages.LoginPage;
import com.w2a.pages.ZohoAppPage;
import com.w2a.pages.crm.accounts.AccountsPage;
import com.w2a.pages.crm.accounts.CreateAccountsPage;

public class LoginTest {

	public static void main(String[] args) {
   
		HomePage home = new HomePage();
		LoginPage lp=home.goToLogin();
		ZohoAppPage zp=lp.doLogin("rishirises02@gmail.com", "r7415369");
		zp.gotoCRM();
		AccountsPage account=Page.menu.gotoAccounts();
		CreateAccountsPage cap=account.gotoCreateAccounts();
	    cap.createAccount("Rishi");
	    
	    //driver.manage().window().maximize();----->this concept implemented here
		
	}

}
