package com.exela.auomation.config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Propertyfilereader implements Configurationreader{
	
	public static Properties property =null;
	
	public Propertyfilereader() throws FileNotFoundException,IOException
	{
		try
		{
			FileInputStream file = new FileInputStream("D:\\WorkSpace\\VisualTesting\\src\\main\\resources\\Cofigurationfile\\config.properties");
			property = new Properties();
			property.load(file);
		}catch(FileNotFoundException e)
		{
			throw(e);
		}catch(IOException e)
		{
			throw(e);
		}
		
	}

	
	public String getUrl() {
		return property.getProperty("url");
	}

	
	public String getBrowser() {
		 return property.getProperty("browser");
	}

	
	public int getPageLoadTimeOut() {
		return Integer.parseInt(property.getProperty("timeout"));
	}

}
