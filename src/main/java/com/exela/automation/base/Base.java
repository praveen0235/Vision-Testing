package com.exela.automation.base;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import com.applitools.eyes.RectangleSize;
import com.applitools.eyes.selenium.Eyes;
import com.exela.auomation.config.Configurationreader;
import com.exela.auomation.config.Propertyfilereader;
import com.exela.auomation.config.eyesconfig;
import com.exela.automation.framework.Browser;


public class Base {
	
	public static WebDriver driver;
	public static Configurationreader reader;
	public static Eyes eyes;
	

	public static void setup() throws FileNotFoundException, IOException
	{
		reader = new Propertyfilereader();
		Browser.startbrowser();
		//Browser.maximize();
		eyes = new Eyes();
		eyesconfig.eyesetup(eyes);
		int viewportsizewidth =Integer.parseInt(Propertyfilereader.property.getProperty("viewportsizewidth"));
		int viewportsizeheight =Integer.parseInt(Propertyfilereader.property.getProperty("viewportsizeheight"));
		RectangleSize viewportSize = new RectangleSize(viewportsizewidth,viewportsizeheight);
		eyes.open(driver, "Mytest", "GridTest", viewportSize);
		driver.navigate().to(reader.getUrl());
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	
	

}
