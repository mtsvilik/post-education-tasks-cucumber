package com.solvd.posteducationtaskscucumber.saucedemo;

import com.qaprosoft.carina.core.foundation.cucumber.CucumberBaseTest;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/features/SauceDemo.feature",
        glue = "com.solvd.posteducationtaskscucumber.saucedemo.steps",
        plugin = {"pretty",
                "html:target/cucumber-core-test-report",
                "pretty:target/cucumber-core-test-report.txt",
                "json:target/cucumber-core-test-report.json",
                "junit:target/cucumber-core-test-report.xml"}
)
public class SauceDemoTest extends CucumberBaseTest {
}
