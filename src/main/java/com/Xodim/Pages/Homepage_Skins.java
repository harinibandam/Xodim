package com.Xodim.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Xodim.GenericLib.BaseTest;

public class Homepage_Skins {
	
		@FindBy(xpath="//a[@class='topLink'][2]") private WebElement skinsbtn;
		@FindBy(id="metallic") private WebElement metallicbtn;
		
		
		public Homepage_Skins()
		{
			PageFactory.initElements(BaseTest.driver, this);
		}
		
		public void clickskinTab()
		{
			skinsbtn.click();
			
		}
		
		public void clickMetallicBtn()
		{
			metallicbtn.click();
		}
	}

