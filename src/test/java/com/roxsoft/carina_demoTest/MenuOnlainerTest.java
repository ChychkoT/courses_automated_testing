package com.roxsoft.carina_demoTest;

import org.testng.annotations.Test;

import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.roxsoft.carina_demoTest.onlainer.service.SeviceMenu;

public class MenuOnlainerTest extends AbstractTest{
	
	@Test 
	public void menuTest() {
		SeviceMenu seviceMenu = new SeviceMenu();
		seviceMenu.testAllMenu();
		
	}

}
