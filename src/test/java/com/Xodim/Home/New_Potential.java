package com.Xodim.Home;

import org.testng.annotations.Test;

import com.Xodim.GenericLib.BaseTest;
import com.Xodim.GenericLib.FileLib;
import com.Xodim.Pages.CreatePotential;
import com.Xodim.Pages.LoginPage;
import com.Xodim.Pages.PotentialTab;

public class New_Potential extends BaseTest{
	
		@Test
		public void newPotential() throws Throwable{
		LoginPage lp = new LoginPage();
		FileLib flib = new FileLib();
		lp.loginToApp(flib.readPropertyData(PROP_PATH, "username"), flib.readPropertyData(PROP_PATH, "password"));
		PotentialTab pot = new PotentialTab();
		pot.potential();
		CreatePotential cp = new CreatePotential();
		cp.savepotential(flib.readPropertyData(PROP_PATH, "name"));
	}

}
