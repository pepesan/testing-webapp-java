package com.cursosdedesarrollo.app;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty"})
//@CucumberOptions(plugin = {"pretty", "html:target/cucumber-html-report", "junit:target/cucumber-junit.xml"})
public class RunCucumberTest{
}