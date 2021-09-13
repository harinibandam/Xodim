package com.Xodim.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Xodim.GenericLib.BaseTest;

public class Scroll {
	@FindBy(xpath = "//img[@id=\"scrollright\"]")
	private WebElement scrollbtn;

public Scroll()
{
	PageFactory.initElements(BaseTest.driver, this);
}

	public void scrollright()
	{
		for(int i=1;i<=20;i++) {
			scrollbtn.click();
		}
}
}
