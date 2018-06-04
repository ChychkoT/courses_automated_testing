package com.roxsoft.carina_demoTest.onlainer.pages;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;

public class ModuleHomePageMenu extends AbstractUIObject{

	public ModuleHomePageMenu(WebDriver driver, SearchContext searchContext) {
		super(driver, searchContext);
	}

	@FindBy(xpath = "//a[@href='https://catalog.onliner.by/']/span[@class='b-main-navigation__text']")
	 private ExtendedWebElement catalog;
	
	@FindBy(xpath = "//a[@href='https://www.onliner.by']/span[@class='b-main-navigation__text']") 
	 private ExtendedWebElement news;
	
	@FindBy(xpath = "//a[@href='https://ab.onliner.by']/span[@class='b-main-navigation__text']") 
	 private ExtendedWebElement cars;
	
	@FindBy(xpath = "//a[@href='https://r.onliner.by/pk']/span[@class='b-main-navigation__text']") 
	 private ExtendedWebElement flats;
	
	@FindBy(xpath = "//a[@href='https://s.onliner.by']/span[@class='b-main-navigation__text']") 
	 private ExtendedWebElement services;
	
	@FindBy(xpath = "//a[@href='https://baraholka.onliner.by/']/span[@class='b-main-navigation__text']") 
	 private ExtendedWebElement baraholka;
	
	@FindBy(xpath = "//a[@href='https://forum.onliner.by/']/span[@class='b-main-navigation__text']") 
	 private ExtendedWebElement forum;
	
	public ExtendedWebElement getCatalog() {
        return catalog;
    }

    public ExtendedWebElement getNews() {
        return news;
    }
    
    public ExtendedWebElement getCars() {
        return cars;
    }
    
    public ExtendedWebElement getFlats() {
        return flats;
    }
    
    public ExtendedWebElement getServices() {
        return services;
    }
    
    public ExtendedWebElement getBaraholka() {
        return baraholka;
    }
    
    public ExtendedWebElement getForum() {
        return forum;
    }
    
    

}
