package com.demoqa.serenitybdd.runners.LoginUser;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/LoginUser/LoginUser.feature",
        glue = {"com.demoqa.serenitybdd.stepsdefinitions","com.demoqa.serenitybdd.hooks"},
        snippets = CucumberOptions.SnippetType.CAMELCASE

)
public class RunnerLoginUser {
}
