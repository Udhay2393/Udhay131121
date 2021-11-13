package org.test;

import org.global.LibGlobal;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IphoneVariants {

	public static void main(String[] args) throws InterruptedException {
		LibGlobal lib=new LibGlobal();
		WebDriver driver = lib.BrowserLaunch("chrome");
		lib.loadUrl("https://en-gb.facebook.com/");
		WebElement userName = driver.findElement(By.name("email"));
		lib.sendText(userName, "6380896922");
		WebElement passWord = driver.findElement(By.name("pass"));
		lib.sendText(passWord, "6380896922");
		WebElement btnLogin = driver.findElement(By.name("login"));
		lib.BtnClick(btnLogin);
		
		
		
	
	
	}
	
	}
	

