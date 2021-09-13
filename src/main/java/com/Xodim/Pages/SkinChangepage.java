package com.Xodim.Pages;

import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Xodim.GenericLib.BaseTest;

public class SkinChangepage {
	@FindBy(id="metallic") private WebElement metallicbtn;
	@FindBy(xpath="//input[@onclick=\"setAction(this);\"][2]") private WebElement applybtn;
	@FindBy(xpath="//input[@value=\"Close\"]") private WebElement closebtn;

	public SkinChangepage()
	{
		PageFactory.initElements(BaseTest.driver, this);
	}
	public void clickapplybtn()
	{
		metallicbtn.click();
		applybtn.click();
		closebtn.click();
	}

	public void switchtoWindow(String childWindow )
	{
		Set<String> allwhs=BaseTest.driver.getWindowHandles();
		for(String wh:allwhs)
		{
			String title=BaseTest.driver.switchTo().window(wh).getTitle();
		
			if(title.equals(childWindow))
			{
				metallicbtn.click();
				applybtn.click();
				closebtn.click();
			
				break;
			}
		}
	}
}

