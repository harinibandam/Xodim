package com.Xodim.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Xodim.GenericLib.BaseTest;

public class HomePage {

	@FindBy(xpath = "//a[text()='Leads']") private WebElement leadsTab;
	@FindBy(xpath="//a[@class=\"topLink\"][2]") private WebElement skinsbtn;
	
	
	public HomePage()
	{
		PageFactory.initElements(BaseTest.driver, this);
	}
	
	public void clickLeadsTab()
	{
		leadsTab.click();
		skinsbtn.click();
	}
}
