package runnerpkg;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\HP\\Aiswaryawkspc\\Testexercise\\feature",glue="stepdefinitionpkg",plugin= {"html:target-cucumber/reports"},monochrome=true)

public class runnercls {

}
