package com.demoqa.serenitybdd.task.SignUp;

import com.demoqa.serenitybdd.task.OpenPageTask;
import com.demoqa.serenitybdd.ui.LoginPage;
import com.demoqa.serenitybdd.utils.GeneralUtils;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Random;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SignUpFailureTask implements Task {

    private static final Logger LOGGER = LoggerFactory.getLogger(OpenPageTask.class);

    private final String user;
    private final String password;

    public SignUpFailureTask(String user, String password){
        this.user = user;
        this.password = password;
    }

    public static Performable LoginTask(String user, String password){
        return instrumented(SignUpFailureTask.class, user, password);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        LOGGER.info("El usuario ingresa a apartado de Sign Up");
        actor.attemptsTo(
                Click.on(LoginPage.BTN_SIGN_UP)
        );
        GeneralUtils.explicitWait(5000,"Usuario ingresa el usuario y contraseña");
        actor.attemptsTo(
                Click.on(LoginPage.INPUT_USER_NAME),
                Enter.keyValues(user).into(LoginPage.INPUT_USER_NAME),
                Enter.keyValues(password).into(LoginPage.INPUT_PASSWORD)
        );
        GeneralUtils.explicitWait(5000,"Usuario finaliza el registro");
        actor.attemptsTo(
                Click.on(LoginPage.BTN_SINGUP_FINAL)
        );

    }
}
