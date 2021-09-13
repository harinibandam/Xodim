package com.Xodim.Pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Xodim.GenericLib.BaseTest;

public class logoutt extends BaseTest{
	@FindBy(xpath="//a[@href=\"/crm/logout.sas\"]") private WebElement logoutBtn;
	public logoutt()
	{
		PageFactory.initElements(BaseTest.driver, this);
	}
/**	public void logout
	{
		logoutbtn.click();
	}**/
	public void loginout()
	{
		logoutBtn.click();
	}

}
