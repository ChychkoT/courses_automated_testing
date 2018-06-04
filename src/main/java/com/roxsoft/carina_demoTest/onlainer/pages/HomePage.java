package com.roxsoft.carina_demoTest.onlainer.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;

public class HomePage extends AbstractPage{
	
	 @FindBy(xpath = "//div[@id='userbar']//div[@class='auth-bar__item auth-bar__item--text']")
	    private ExtendedWebElement openloginPage;
	 
	 @FindBy(xpath = "//a[@href='https://catalog.onliner.by/']/span[@class='b-main-navigation__text']")
	 private ModuleHomePageMenu catalog;
	


	public HomePage(WebDriver driver) {
		super(driver);
		setPageAbsoluteURL("https://www.onliner.by");
	}
	
	
	public ExtendedWebElement getLogin() {
        return openloginPage;
    }
	

    public  void clickLoginButton(){
    	getLogin().click();
        new LoginPage(getDriver());
    }
    
    public void clickCatalog(){
    	catalog.getCatalog().click();
    	new CatalogPage(getDriver());
    }
    
    public void clickNews(){
    	news.getNews().click();
    }
    
    public void clickCars(){
    	cars.getCars().click();
    }
    
    public void clickFlats(){
    	flats.getFlats().click();
    }
    
    public void clickServices(){
    	services.getServices().click();
    }
    
    public void clickBaraholka(){
    	baraholka.getBaraholka().click();
    }
    
    public void clickForum(){
    	forum.getForum().click();
    }

    public void testMenu(){
    	clickCatalog();
    	clickNews();
    	clickCars();
    	clickFlats();
    	clickServices();
    	clickBaraholka();
    	clickForum();

    }

}
