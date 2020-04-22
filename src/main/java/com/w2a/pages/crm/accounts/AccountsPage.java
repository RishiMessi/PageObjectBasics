package com.w2a.pages.crm.accounts;

import com.w2a.base.Page;

public class AccountsPage extends Page {
	
	public CreateAccountsPage gotoCreateAccounts() {
		
	click("createaccountbtn_XPATH");
	
	return new CreateAccountsPage();
	
	}
	
	public void gotoImportAccounts() {
		
	}

}
