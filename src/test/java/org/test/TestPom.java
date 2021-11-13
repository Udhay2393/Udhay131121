package org.test;

import org.global.LibGlobal;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.pages.LoginPage;

public class TestPom {
public static void main(String[] args) {
	LibGlobal lib=new LibGlobal();
	WebDriver driver = lib.BrowserLaunch("chrome");
	lib.loadUrl("https://en-gb.facebook.com/");
	LoginPage l=new LoginPage();
	WebElement txtUsername = l.getTxtUsername();
	lib.sendText(txtUsername, "6380896922");
	WebElement txtPass = l.getTxtPass();
	lib.sendText(txtPass, "ihatemarriage");
WebElement e = l.getLoginBtn();
lib.BtnClick(e);
}
	
}
