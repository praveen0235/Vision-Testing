package com.exela.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.exela.automation.base.Base;

public class pageobjets {
	
	public pageobjets()
	{
		PageFactory.initElements(Base.driver, this);
	}
	
	@FindBy(linkText="About Exela")
	public static WebElement aboutexela;
	
	@FindBy(xpath=".//*[@href='/about-us']")
	public  static WebElement aboutus;
	
	@FindBy(xpath=".//*[@href='/leadership-team']")
	public  static WebElement leadeshipteam;
	
	@FindBy(xpath=".//*[@href='/careers']")
	public  static WebElement careers;
	
	@FindBy(xpath=".//*[@href='http://investors.exelatech.com/']")
	public  static WebElement insvestors;

}
