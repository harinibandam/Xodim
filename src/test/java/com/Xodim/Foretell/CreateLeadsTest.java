package com.Xodim.Foretell;


import org.testng.annotations.Test;

import com.Xodim.GenericLib.BaseTest;
import com.Xodim.GenericLib.FileLib;
import com.Xodim.GenericLib.WebDriverCommonLib;
import com.Xodim.Pages.CreateLeadPage;
import com.Xodim.Pages.CustomViewPage;
import com.Xodim.Pages.HomePage;
import com.Xodim.Pages.LoginPage;

public class CreateLeadsTest extends BaseTest{

	//public static void main(String[] args) throws Throwable {
		@Test
		public void createLead() throws Throwable {
		FileLib flib = new FileLib();
		LoginPage lp=new LoginPage();
		lp.loginToApp(flib.readPropertyData(PROP_PATH, "username"), flib.readPropertyData(PROP_PATH, "password"));

		WebDriverCommonLib wlib=new WebDriverCommonLib();
		wlib.verify(wlib.getPageTitle(), flib.readPropertyData(PROP_PATH, "homeTitle"), "Home Page");
	
	    HomePage hp = new HomePage();
	    hp.clickLeadsTab();
	    
	    wlib.verify(wlib.getPageTitle(), flib.readPropertyData(PROP_PATH, "customViewTitle"), "Custom View Page");

	    CustomViewPage cv=new CustomViewPage();
	    cv.clickNewLeadBtn();
	    Thread.sleep(1000);
	    
	    wlib.verify(wlib.getPageTitle(), flib.readPropertyData(PROP_PATH, "createLeadTitle"), "Create Lead Page");
	    
	    CreateLeadPage cl=new CreateLeadPage();
	    cl.createLeadWithMandatoryDetails(flib.readExcelData(EXCEL_PATH, "Leads", 0, 1), 
	    		flib.readExcelData(EXCEL_PATH, "Leads", 1, 1));
	
	
	    wlib.verify(wlib.getPageTitle(), flib.readPropertyData(PROP_PATH, "leadDetailsTitle"), "Lead Details page");
	
	}
}
