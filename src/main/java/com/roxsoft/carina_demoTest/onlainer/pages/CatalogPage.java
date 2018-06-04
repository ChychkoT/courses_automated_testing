package com.roxsoft.carina_demoTest.onlainer.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;

public class CatalogPage extends AbstractPage{
	

	 @FindBy(xpath = "//div[@class='g-middle-i']//ul[@class='catalog-navigation-classifier']//li[@data-id='4']") 
	    private ExtendedWebElement  building;
	 
	 @FindBy(xpath = "//div[@class='catalog-navigation-list__aside-list']/div[3]") 
	    private ExtendedWebElement  flooCoverings;
	 
	 @FindBy(xpath = "//a[@href='https://catalog.onliner.by/laminate']") 
	    private ExtendedWebElement  laminate;
	 

	public CatalogPage(WebDriver driver) {
		super(driver);
		setPageAbsoluteURL("https://catalog.onliner.by/");
	}
	
	public ExtendedWebElement getBuilding() {
        return building;
    }
	
	 public  void clickBuilding(){
		 getBuilding().click();

	    }
	 
	 public ExtendedWebElement getFlooCoverings() {
	        return flooCoverings;
	    }
	 
	 public  void clickFlooCoverings(){
		 getFlooCoverings().click();

	    }
	 
	 public ExtendedWebElement getLaminate() {
	        return laminate;
	    }
	 
	 public  void clickLaminate(){
		 getLaminate().click();

	    }
	 

}
