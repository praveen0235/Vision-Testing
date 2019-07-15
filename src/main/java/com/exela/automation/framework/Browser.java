package com.exela.automation.framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.exela.automation.base.Base;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser {
	
	public static WebDriver startbrowser()
	{
		String browser = Base.reader.getBrowser().toLowerCase();
		
		switch(browser)
		{
			case "chrome" :
				WebDriverManager.chromedriver().setup();
				Base.driver = new ChromeDriver();
				return Base.driver;
			case "ie" :
				WebDriverManager.iedriver().setup();
				Base.driver = new InternetExplorerDriver();
				return Base.driver;
			default :
				WebDriverManager.firefoxdriver().setup();
				Base.driver = new FirefoxDriver();
				return Base.driver;
		}
	}
	
	public static void maximize()
	{
		Base.driver.manage().window().maximize();
	}

}
