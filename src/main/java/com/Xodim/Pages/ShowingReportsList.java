package com.Xodim.Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Xodim.GenericLib.BaseTest;

public class ShowingReportsList {
	@FindBy(xpath="//a[text()=\"Reports\"]") private WebElement reportbtn;
	@FindBy(xpath="//a[text()=\"Potential Reports\"]") private WebElement potrepbtn;
	@FindBy(xpath="//a[text()=\"Pipeline by Stage\"]") private WebElement pipelinestagebtn;
	@FindBy(xpath="//select[@name=\"stdDateFilterField\"]") private WebElement potclosedatebtn;
	@FindBy(xpath="//select[@name=\"stdDateFilter\"]") private WebElement previousfybtn;
	@FindBy(xpath="//input[@id=\"btnExport\"]") private WebElement exportbtn;
	@FindBy(xpath="//td[text()=\"Export to PDF\"]") private WebElement exportpdfbtn;
public ShowingReportsList()
	{
	PageFactory.initElements(BaseTest.driver, this);
	}
public void Export() throws Throwable
{
	reportbtn.click();
	potrepbtn.click();
	Thread.sleep(1000);
	pipelinestagebtn.click();
	potclosedatebtn.click();
	potclosedatebtn.sendKeys(Keys.DOWN);
	potclosedatebtn.sendKeys(Keys.DOWN);
	potclosedatebtn.sendKeys(Keys.ENTER);
	previousfybtn.click();
	previousfybtn.sendKeys(Keys.DOWN);
	previousfybtn.sendKeys(Keys.ENTER);
	exportbtn.click();
	exportpdfbtn.click();
}
}