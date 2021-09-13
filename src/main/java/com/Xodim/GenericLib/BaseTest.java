package com.Xodim.GenericLib;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;


	public class BaseTest implements IAutoConsts{
		public static WebDriver driver;
		
		@BeforeClass
		public void openBrowser() throws Throwable {
			FileLib flb=new FileLib();
			String browsername=flb.readPropertyData(PROP_PATH, "browser");
			if(browsername.equalsIgnoreCase("chrome"))
			{
				System.setProperty(CHROME_KEY, CHROME_VALUE);
				driver=new ChromeDriver();
			}
			else if(browsername.equalsIgnoreCase("firefox"))
			{
			System.setProperty(GECKO_KEY, GECKO_VALUE);
			driver=new FirefoxDriver();
			}
			else
			{
				System.out.println("Enter proper browser name");
			}
			driver.manage().window().maximize();
			String url=flb.readPropertyData(PROP_PATH, "url");
			driver.get(url);
			WebDriverCommonLib wlib= new WebDriverCommonLib();
			wlib.verify(wlib.getPageTitle(), flb.readPropertyData(PROP_PATH, "loginTitle"), "Login Page");
		}
		@AfterClass
		public void closeBrowser()
		{
			driver.quit();
		}
	}



