package com.demoqa.serenitybdd.runners.SignUp;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/SignUp/SignUp.feature",
        glue = {"com.demoqa.serenitybdd.stepsdefinitions.SignUp","com.demoqa.serenitybdd.hooks"},
        snippets = CucumberOptions.SnippetType.CAMELCASE

)
public class RunnerSignUp {
}
