package com.roxsoft.carina_demoTest.onlainer.service;

import org.testng.Assert;

import com.roxsoft.carina_demoTest.onlainer.pages.HomePage;
import com.roxsoft.carina_demoTest.onlainer.pages.LoginPage;
import com.roxsoft.carina_demoTest.onlainer.pages.ModuleHomePageMenu;

import static com.qaprosoft.carina.core.foundation.webdriver.DriverPool.getDriver;

public class LoginService {
	
    LoginPage logPage = new LoginPage(getDriver());
    

	public void login(String mail, String password){
		logPage.loginTest(mail, password);
		
	}
	
   
}
