package com.roxsoft.carina_demoTest;


import java.util.List;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.roxsoft.carina_demoTest.onlainer.dao.MyBatisUserlogin;
import com.roxsoft.carina_demoTest.onlainer.dao.UserloginTable;
import com.roxsoft.carina_demoTest.onlainer.service.LoginService;
import com.qaprosoft.carina.core.foundation.AbstractTest;


public class MyLoginTest extends AbstractTest
{

	@Test 
	public void loginTest() {
		LoginService logservice = new LoginService();
		logservice.login("sotis.t@mail.ru", "Sirius");
		
	}
	
	@DataProvider(name = "DataProviderLogPass")
    public Object[][] getData() {

        return new Object[][]{
                {"sotis.t@mail.ru", "Password"}
        };
    }
	
	@Test (dataProvider = "DataProviderLogPass")
	 public void loginTestDataProvider(String mail, String pass) {
		LoginService logservice = new LoginService();
		logservice.login(mail, pass);	
	}
	
	
	  /* @Test
	    public void loginTestDB() {
		   MyBatisUserlogin myBatisUserlogin = new MyBatisUserlogin();
	        List<UserloginTable> logUser = myBatisUserlogin.getAllLoginData();
	        for (UserloginTable l : logUser) {
	            LoginService loginService = new LoginService();
	            loginService.login(l.getLogin(), l.getPassword());
	           
	        }
	    }*/
	

	
}
