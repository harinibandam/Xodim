package com.Xodim.Home;

	import java.util.Iterator;
import java.util.Set;

import org.testng.annotations.Test;

import com.Xodim.GenericLib.BaseTest;
	import com.Xodim.GenericLib.FileLib;
	import com.Xodim.GenericLib.WebDriverCommonLib;
	import com.Xodim.Pages.Homepage_Skins;
import com.Xodim.Pages.LoginPage;
import com.Xodim.Pages.SkinChangepage;

	public class skinThemes extends BaseTest{

		//public static void main(String[] args) throws Throwable {
			
			@Test
			public void skinTheme() throws Throwable {
			LoginPage lp=new LoginPage();
			FileLib flib = new FileLib();
			lp.loginToApp(flib.readPropertyData(PROP_PATH, "username"), flib.readPropertyData(PROP_PATH, "password"));

			WebDriverCommonLib wlib=new WebDriverCommonLib();
			wlib.verify(wlib.getPageTitle(), flib.readPropertyData(PROP_PATH, "homeTitle"), "Home Page");
			
			Thread.sleep(2000);
			Homepage_Skins hs = new Homepage_Skins();
			hs.clickskinTab();
			Set<String> allwhs=BaseTest.driver.getWindowHandles();
			Iterator<String> i = allwhs.iterator();
			 String p = i.next();
			 String c = i.next();
			 BaseTest.driver.switchTo().window(c);
//			 driver.manage().window().maximize();
//			 hs.clickMetallicBtn();
			 SkinChangepage sk=new SkinChangepage();
			 sk.clickapplybtn();
			
		/**	wlib.verify(wlib.getPageTitle(), flib.readPropertyData(PROP_PATH, "skinTitle"), "Skin Title");
			
			Thread.sleep(5000);
			
			SkinChangepage sct = new SkinChangepage();
			sct.switchtoWindow(flib.readPropertyData(PROP_PATH, "childWindow"));
			Set<String> allwhs=BaseTest.driver.getWindowHandles();
			for(String wh:allwhs)
			{
				String title=BaseTest.driver.switchTo().window(wh).getTitle();
			
				if(title.equals(flib.readPropertyData(PROP_PATH, "childWindow")))
					
				{
					driver.manage().window().maximize();
				
					break;
		**/		
			}
	}
