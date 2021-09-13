package com.Xodim.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Xodim.GenericLib.BaseTest;

public class LoginPage {

	@FindBy(id="userName") private WebElement untb;
	@FindBy(id="passWord") private WebElement pwtb;
	@FindBy(xpath = "//input[@title=\"Sign In\"]") private WebElement signInBtn;

	public LoginPage()
	{
		PageFactory.initElements(BaseTest.driver, this);
	}
	public void loginToApp(String un, String pwd)
	{
		untb.sendKeys(un);
		pwtb.sendKeys(pwd);
		signInBtn.click();
	}
}
