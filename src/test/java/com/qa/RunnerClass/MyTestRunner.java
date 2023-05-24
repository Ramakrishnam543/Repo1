package com.qa.RunnerClass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = ("classpath:com.qa.feature/login.feature"),
        glue={"com.qa"},
        plugin = {"pretty","json:target/cucumber/report.json","html:target/cucumber/report.html"}


)
public class MyTestRunner {
}
