package com.w2a.base;

import org.openqa.selenium.WebDriver;

import com.w2a.pages.crm.accounts.AccountsPage;

public class TopMenu {

	/*
	 * TopMenu ISA Page
	 * 
	 * HomePage HASA TopMenu
	 * AccountsPage HASA TopMenu
	 * 
	 * Page HASA TopMenu
	 * Encapsulation is there in TopMenu
	 */
	
	WebDriver driver;
	
	public TopMenu(WebDriver driver) {
		this.driver=driver;
	}
	
	public void gotoHome() {

	}

	public void gotoLeads() {

	}

	public void gotoContacts() {

	}

	public AccountsPage gotoAccounts() {

        Page.click("accountstab_XPATH");
		
        return new AccountsPage();
	}

	public void gotoDeals() {

	}

	public void signOut() {
		
	}
}
