package com.roxsoft.carina_demoTest.onlainer.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;



import org.testng.Assert;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;

public class LoginPage extends AbstractPage{

	@FindBy(xpath = "//div[@class='auth-box__line']/input[@type='text']")
	private UserLogin mail;
	
	@FindBy(xpath = "//div[@class='auth-box__line']/input[@type='password']")
	private UserLogin password;
	
	@FindBy(xpath = "//div[@class='auth-box__line auth-box__line--final']/button[@type='submit']")  
	private ExtendedWebElement signInButton;
	
	@FindBy(xpath = "//div[@class='modal-close']")  
	private ExtendedWebElement clickCloseLoginPage;
	
	
	@FindBy(xpath = "//body[@input='hidden']")  
	private ExtendedWebElement closeImage;
	
	
	public LoginPage(WebDriver driver) {
		super(driver);
		setPageAbsoluteURL("https://profile.onliner.by/login.html");
	}
	

	 /*public ExtendedWebElement getEmail() {
	        return mail;
	    }

	 public ExtendedWebElement getPassword() {
	        return password;
	    }
    
	 public void enterEmail(String email){
		 getEmail().click();
		 getEmail().type(email);
	 }
	 
	 public  void enterPass(String pass){
		 getPassword().type(pass);
	    }*/
	
	public void enterMail(String email){
		mail.getEmail().type(email);
	}
	
	public void enterPass(String pass){
		password.getPassword().type(pass);
	}

	 public ExtendedWebElement getLogin() {
	        return signInButton;
	    }
	 
	 public ExtendedWebElement getClickCloseLoginPage() {
	        return clickCloseLoginPage;
	    }
	 
	 
	 public void clickLogin(){
		    getLogin().click();
	    }
	 
	 
	 public void clickLoginButton(){
			HomePage homePage = new HomePage(getDriver());
			homePage.open();
	        Assert.assertTrue(homePage.isPageOpened(), "Home page is not opened");
			homePage.clickLoginButton();
	    }
		
		
	public void loginTest( String mail, String password) {
		        clickLoginButton();
	            enterMail(mail);
	            enterPass(password);
	            clickLogin();

	    }
		

}
