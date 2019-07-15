package com.exela.automation.stepdefinitionfile;

import org.testng.annotations.Test;

import com.exela.automation.base.Base;
import com.exela.automation.pages.pageobjets;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

@Test
public class StepDefinition {
	
	@Given("^navigate to the URL$")
	public void navigate_to_the_URL() throws Throwable {
	   Base.setup();
	   Base.eyes.checkWindow("HomePage");
	}

	@Then("^click on About Exela and then click on aboutus$")
	public void click_on_About_Exela_and_then_click_on_aboutus() throws Throwable {
		
		pageobjets pom = new pageobjets();
		pageobjets.aboutexela.click();
		pageobjets.aboutus.click();
		Base.eyes.checkWindow("aboutuspage");
	}

	@Then("^again click on About Exela and then click on Leadershipteam$")
	public void again_click_on_About_Exela_and_then_click_on_Leadershipteam() throws Throwable {
		pageobjets.aboutexela.click();
		pageobjets.leadeshipteam.click();
		Base.eyes.checkWindow("leadeshipteampage");
	}

	@Then("^again click on About Exela and then click on carerrs$")
	public void again_click_on_About_Exela_and_then_click_on_carerrs() throws Throwable {
		pageobjets.aboutexela.click();
		pageobjets.careers.click();
		Base.eyes.checkWindow("careerspage");
	}

	@Then("^again click on About Exela and then click on Investory$")
	public void again_click_on_About_Exela_and_then_click_on_Investory() throws Throwable {
		pageobjets.aboutexela.click();
		pageobjets.insvestors.click();
		Base.eyes.checkWindow("investorspage");
	}
	
	@cucumber.api.java.After
	public void teardown()
	{
		Base.eyes.close();
		Base.driver.quit();
	}
	
}
