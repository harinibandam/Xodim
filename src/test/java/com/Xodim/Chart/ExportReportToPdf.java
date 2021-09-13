package com.Xodim.Chart;


import org.testng.annotations.Test;

import com.Xodim.GenericLib.BaseTest;
import com.Xodim.GenericLib.FileLib;
import com.Xodim.Pages.LoginPage;
import com.Xodim.Pages.ShowingReportsList;


public class ExportReportToPdf extends BaseTest {
	
	//public static void main(String[] args) throws Throwable
	@Test
	public void exportPdf() throws Throwable{
	{
		Thread.sleep(1000);
		LoginPage lp = new LoginPage();
		FileLib flib = new FileLib();
		lp.loginToApp(flib.readPropertyData(PROP_PATH, "username"), flib.readPropertyData(PROP_PATH, "password"));
		ShowingReportsList pdf = new ShowingReportsList();
		pdf.Export();
	}

}
}