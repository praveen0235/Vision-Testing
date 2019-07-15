package com.exela.automation.runnerfile;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="D:\\WorkSpace\\VisualTesting\\src\\test\\resources\\FeaatureFiles\\featurefile.feature",
glue="com.exela.automation.stepdefinitionfile",dryRun=false)

public class Runner {

}
