package org.pages;

import org.global.LibGlobal;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends LibGlobal {
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}  
	@FindBys({ @FindBy(id="email"), @FindBy(xpath="//input[@type='text']")})
	private WebElement txtUsername;
	@FindBys({@FindBy(id="pass"), @FindBy(xpath="//input[@type='password']")})
	private WebElement txtpass;
	@FindBys({@FindBy(name="login"),@FindBy(xpath="//button[@value='1']")})
	private WebElement loginBtn;
	
	public WebElement getTxtUsername() {
		return txtUsername;
	}
	public WebElement getTxtPass() {
		return txtpass;
	}
	public WebElement getLoginBtn() {
		return loginBtn;
	}
 
}


