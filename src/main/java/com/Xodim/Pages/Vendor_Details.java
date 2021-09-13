package com.Xodim.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Xodim.GenericLib.BaseTest;

public class Vendor_Details {
	@FindBy(xpath = "//a[text()='Vendors']") private WebElement vendortab;
	@FindBy(xpath = "//a[@href='/crm/ShowEntityInfo.do?id=1501&module=Vendors']") private WebElement girishbtn;

	public Vendor_Details() {
		PageFactory.initElements(BaseTest.driver, this);

	}

public void vendordetails()
{
	vendortab.click();
	girishbtn.click();
}
}
