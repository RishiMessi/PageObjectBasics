package com.w2a.pages;

import org.openqa.selenium.By;
import com.w2a.base.Page;
import com.w2a.pages.crm.CRMHomePage;

public class ZohoAppPage extends Page {

	public void gotoConnect() {

		driver.findElement(By.xpath("//div[contains(text(),'Connect')]")).click();
	}

	public CRMHomePage gotoCRM() {

		click("crmlink_XPATH");
		
		return new CRMHomePage();
	}

	public void gotoBooks() {

		driver.findElement(By.xpath("//div[contains(text(),'Books')]")).click();
	}
}
