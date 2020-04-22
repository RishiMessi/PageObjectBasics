package com.w2a.pages.crm.accounts;

import com.w2a.base.Page;

public class CreateAccountsPage extends Page {
	
	public void createAccount(String accountName) {
		
		type("accountname_CSS",accountName);
		
	}

}
