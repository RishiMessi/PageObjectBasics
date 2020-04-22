package com.w2a.pages;

import org.openqa.selenium.By;
import com.w2a.base.Page;

public class HomePage extends Page {
	
	
	public void goToSupport() {

		driver.findElement(By.xpath("//A[@class='zh-support'][text()='Support']")).click();
	}

	public void goToFreeSignup() {

		driver.findElement(By.xpath("//A[@class='zh-signup'][text()='Free Sign Up']")).click();
	}

	public LoginPage goToLogin() {

		click("loginlink_XPATH");
		
		return new LoginPage();
	}

	public void goToLearnMore() {
		
	}
	
	public void validateFooterLinks() {
		
	}
}
