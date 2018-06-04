
package com.roxsoft.carina_demoTest.onlainer.service;

import org.testng.Assert;

import com.roxsoft.carina_demoTest.onlainer.pages.CatalogPage;
import com.roxsoft.carina_demoTest.onlainer.pages.HomePage;

import static com.qaprosoft.carina.core.foundation.webdriver.DriverPool.getDriver;

public class SeviceMenu {
	
	HomePage homePage = new HomePage(getDriver());
	CatalogPage catalogPage = new CatalogPage(getDriver());
	
	public void testAllMenu() {
		homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "Home page is not opened");
		homePage.testMenu();
		homePage.clickCatalog();
		catalogPage.clickBuilding();
		catalogPage.clickFlooCoverings();
		catalogPage.clickLaminate();
		
	}

}
