package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

// add the tage
@CucumberOptions(features = "src/test/resources/feature/SearchCar.feature", glue= {"steps"}, 
//tags = "@dev or @stag and not @prod ",
tags="@Search-car",
plugin = {"html:target/cucumber-report/cucumber-html-report.html","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
public class RunCuke extends AbstractTestNGCucumberTests{
	
	// we are extending the testngCucumber 
	//2 with the helpf of cucumber option we need to tell where is cucumber option file is
	// with glues tell where is your steps
	
	// to generate buidl in cucumber report add code after plugin so it will create you default html report
	
	// to use latest extnent report add depending for extent report in pom.xml file
	
	
	// in order to customize the extne report
	//search Spark config.xml from the internet and add this path in extne.properites file and this will allow you 
	// to customize extent report peroperty
	
	

}
