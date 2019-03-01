package com.prokarma.pkmst.cucumber;

import org.junit.runner.RunWith;
import org.springframework.test.context.ActiveProfiles;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@ActiveProfiles("test")
@CucumberOptions(format = { "pretty", "html:target/cucumber-html-report",
 "json:./report/Fleet-report-json/Fleet.json",
 "json:./report/Industrial-report-json/Industrial.json",
 "json:./report/Sensors-report-json/Sensors.json",
 "json:./report/Assets-report-json/Assets.json",
 "json:./report/Safety-report-json/Safety.json",
 "json:./report/Users-report-json/Users.json",
 })
public class PkmstTest {
}