package com.Xodim.Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Xodim.GenericLib.BaseTest;
import com.Xodim.GenericLib.FileLib;
import com.Xodim.GenericLib.WebDriverCommonLib;

public class CreatePotential extends BaseTest{
	@FindBy(xpath="//input[@name='property(Potential Name)']") private WebElement pname; 
	@FindBy(xpath="//img[@title='Account Name Lookup']") private WebElement accnamebtn;
	@FindBy(xpath="//a[@onclick=\"setValue(unescape('rashmi'),'1806')\"]") private WebElement rashmibtn;
	@FindBy(xpath="//img[@src=\"/crm/images/cal.gif\"]") private WebElement calendarimgbtn;
	@FindBy(xpath="//a[text()=\"1\"]") private WebElement selectdatebtn;
	@FindBy(xpath="//select[@onchange=\"setProbability(this.options[this.options.selectedIndex].value)\"]") private WebElement stagebtn;
	@FindBy(xpath="//input[@value=\"Save\"][1]") private WebElement savebtn;
public CreatePotential()
{
	PageFactory.initElements(BaseTest.driver, this);
}
	public void savepotential(String name) throws Throwable
	{
		pname.sendKeys(name);
		accnamebtn.click();
		WebDriverCommonLib clib=new WebDriverCommonLib();
		FileLib flib=new FileLib();
		String title = flib.readPropertyData(PROP_PATH, "windowTitle");
		clib.getwindowhandle(title,rashmibtn);
		calendarimgbtn.click();
		clib.getwindowhandle(flib.readPropertyData(PROP_PATH, "DateTitle"), selectdatebtn);
		stagebtn.click();
		stagebtn.sendKeys(Keys.DOWN);
		stagebtn.sendKeys(Keys.ENTER);
		savebtn.click();
		
		/**String datetitle = flib.readPropertyData(PROP_PATH, "DateTitle");
		clib.getwindowhandle(datetitle, selectdatebtn);
		
//		stagebtn.click();
//		savebtn.click();
		**/
		
		
	}
	
}
