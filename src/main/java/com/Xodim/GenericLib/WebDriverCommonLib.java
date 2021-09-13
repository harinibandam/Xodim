package com.Xodim.GenericLib;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;


public class WebDriverCommonLib {
	public String getPageTitle() {
		String title = BaseTest.driver.getTitle();
		return title;
	}

	public void verify(String actual,String expected, String page) {
		if(actual.equals(expected)){
		System.out.println(page+" is displayed, PASS");
	} else {
		System.out.println(page+" is not displayed, FAIL");
	}
}
	public void selectOption(WebElement element, int index)
	{
		Select sel=new Select(element);
		sel.selectByIndex(index);
	}
	
	public void selectOption(String value, WebElement element)
	{
		Select sel=new Select(element);
		sel.selectByValue(value);
	}
	public void selectOption(WebElement element, String text)
	{
		Select sel=new Select(element);
		sel.selectByVisibleText(text);
	}
	
	public void mouseHover(WebElement element)
	{
		Actions ac=new Actions(BaseTest.driver);
		ac.moveToElement(element).perform();
	}
	public void rightClick(WebElement element)
	{
		Actions ac=new Actions(BaseTest.driver);
		ac.contextClick(element).perform();
	}
	public void dragAndDropElement(WebElement source,WebElement target)
	{
		Actions ac=new Actions(BaseTest.driver);
		ac.dragAndDrop(source,target).perform();
	}
	public void switchToFrame(int index)
	{
		BaseTest.driver.switchTo().frame(index);
	}
	public void switchToFrame(String value)
	{
		BaseTest.driver.switchTo().frame(value);
	}
	public void switchToFrame(WebElement element)
	{
		BaseTest.driver.switchTo().frame(element);
	}
	public void getFullPageScreenshot(String screenshotPath)
	{
		TakesScreenshot ts=(TakesScreenshot)BaseTest.driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File(screenshotPath);
		try {
			Files.copy(src,dest);
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void getwindowhandle(String targetwindowtitle,WebElement element)
	{
		String mainwindow = BaseTest.driver.getWindowHandle();
		Set<String> allwndls = BaseTest.driver.getWindowHandles();
		for(String windowhandle:allwndls)
		{
			String title = BaseTest.driver.switchTo().window(windowhandle).getTitle();
			if(title.equals(targetwindowtitle))
			{
				element.click();
			}
		}
		BaseTest.driver.switchTo().window(mainwindow);
		
	}
	public void scrolldown(WebElement element)
	{
		Point location = element.getLocation();
		JavascriptExecutor jse=(JavascriptExecutor) BaseTest.driver;
		jse.executeScript("window.scrollBy", location);
	}
}