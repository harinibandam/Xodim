package com.Xodim.Vendor;

import org.testng.annotations.Test;

import com.Xodim.GenericLib.BaseTest;
import com.Xodim.GenericLib.FileLib;
import com.Xodim.Pages.LoginPage;
import com.Xodim.Pages.Scroll;
import com.Xodim.Pages.Vendor_Details;

public class vendor_details extends BaseTest{
	
	//public static void main(String[] args) throws Throwable {
	@Test	
	public void vendorDetails() throws Throwable {
		LoginPage lp = new LoginPage();
		FileLib flib = new FileLib();
		lp.loginToApp(flib.readPropertyData(PROP_PATH, "username"), flib.readPropertyData(PROP_PATH, "password"));
		Scroll scr = new Scroll();
		scr.scrollright();
		Thread.sleep(5000);
		Vendor_Details vd = new Vendor_Details();
		vd.vendordetails();
	}
}
