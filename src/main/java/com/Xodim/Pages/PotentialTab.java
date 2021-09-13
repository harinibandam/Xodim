package com.Xodim.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Xodim.GenericLib.BaseTest;

public class PotentialTab {
	@FindBy(xpath="//a[text()=\"Potentials\"]") private WebElement potentialtabbtn;
	@FindBy(xpath="//input[@value='New Potential']") private WebElement newpotentialbtn;
	public PotentialTab(){
		PageFactory.initElements(BaseTest.driver, this);
	}
	public void potential()
	{
		potentialtabbtn.click();	
		newpotentialbtn.click();
	}
}
