package com.exela.auomation.config;

import com.applitools.eyes.BatchInfo;
import com.applitools.eyes.MatchLevel;
import com.applitools.eyes.selenium.Eyes;
import com.applitools.eyes.selenium.StitchMode;

public class eyesconfig {
	
	static Boolean Batch = Boolean.parseBoolean(Propertyfilereader.property.getProperty("Batch"));
	
	public static void eyesetup(Eyes eyes)
	{
		eyes.setApiKey(Propertyfilereader.property.getProperty("apikey"));
		eyes.setForceFullPageScreenshot(true);
		eyes.setStitchMode(StitchMode.SCROLL);
		BatchInfo batchinfo = new BatchInfo(Propertyfilereader.property.getProperty("Batchname"));
		eyes.setBatch(batchinfo);
		eyes.setIgnoreCaret(true);
		eyes.setMatchLevel(MatchLevel.LAYOUT);
	}
	
}
