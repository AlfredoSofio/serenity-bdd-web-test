package com.demoqa.serenitybdd.questions.LoginUser;

import com.demoqa.serenitybdd.task.OpenPageTask;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;


public class LoginUserQuestion implements Question {
    private static final Logger LOGGER = LoggerFactory.getLogger(OpenPageTask.class);
    private final String message;

    public LoginUserQuestion(String message){
        this.message = message;
    }

    public static LoginUserQuestion verification(String message){
        return new LoginUserQuestion(message);
    }


    @Override
    public Object answeredBy(Actor actor) {
        LOGGER.info("A revisar anuncion ...");
        WebDriverWait wait = new WebDriverWait(BrowseTheWeb.as(actor).getDriver(), Duration.ofSeconds(5));
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        String mensaje2 = alert.getText();
        LOGGER.info(mensaje2);
        alert.accept();
        return message.equals(mensaje2);
    }
}
