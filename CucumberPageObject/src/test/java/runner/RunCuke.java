package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/feature/", glue= {"steps"}, 
//tags = "@dev or @stag and not @prod ",
tags="@Search-car")
//plugin = {"html:target/cucumber-report/cucumber-html-report.html","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})

public class RunCuke extends AbstractTestNGCucumberTests{

}
