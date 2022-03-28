package com.vtiger;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginVtiger {
	@Test
	public void loginVtiger() throws Exception {
	String browser	=System.getProperty("browser");
	String url	=System.getProperty("url");
	String username	=System.getProperty("username");
	String password	=System.getProperty("password");
	
	WebDriver driver=null;
	if(browser.equals("chrome")) {
		WebDriverManager.chromedriver().setup();
    driver=new ChromeDriver();
}else if(browser.equals("firefox")) {
	WebDriverManager.firefoxdriver().setup();
	 driver=new FirefoxDriver();
}
else {
	throw new Exception("browser is not compatible");
}

driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		
		driver.get("url");
		driver.findElement(By.name("user_name")).sendKeys("username");
		driver.findElement(By.name("user_password")).sendKeys("password");
		driver.findElement(By.id("submitButton")).click();
		
	}

}


