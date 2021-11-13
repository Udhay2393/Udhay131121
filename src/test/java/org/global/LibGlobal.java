package org.global;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LibGlobal {
	public static WebDriver driver;
	public WebDriver BrowserLaunch(String BrowserName) {
		try {
			if(BrowserName.equals("chrome")) {
				WebDriverManager.chromedriver().setup();
				 driver=new ChromeDriver();
					}
					else if(BrowserName.equals("firefox")) {
					WebDriverManager.firefoxdriver().setup();
					 driver=new FirefoxDriver();
					}
					else if(BrowserName.equals("ie")) {
						WebDriverManager.iedriver().setup();
						 driver=new InternetExplorerDriver();
					}
			driver.manage().window().maximize();
		} catch (Exception e) {
System.out.println(e.getMessage());
			// TODO: handle exception
		}
		
		return(driver);		
}
public void loadUrl(String url) {
	// TODO Auto-generated method stub
	try {
		driver.get(url);
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}

}
public void sendText(WebElement e, String data) {
	// TODO Auto-generated method stub
try {
	e.sendKeys(data);
} catch (Exception e2) {
	System.out.println(e2.getMessage());
}
}
public void BtnClick(WebElement e) {
	// TODO Auto-generated method stub
e.click();
}
public void BrowserQuit() {
	// TODO Auto-generated method stub
driver.quit();
}
}
