package com.demoqa.serenitybdd.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OpenPageTask implements Task {
    private static final Logger LOGGER = LoggerFactory.getLogger(OpenPageTask.class);
    private final String url;

    public OpenPageTask(String url){
        this.url = url;
    }

    public static Performable OpenPageTask (String url){
        return instrumented(OpenPageTask.class, url);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        LOGGER.info("El usuario ingresa al sitio ...");
        actor.attemptsTo(Open.url(url));
    }
}
