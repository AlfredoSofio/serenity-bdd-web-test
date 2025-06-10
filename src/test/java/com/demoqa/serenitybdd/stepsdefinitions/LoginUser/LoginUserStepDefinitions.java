package com.demoqa.serenitybdd.stepsdefinitions.LoginUser;

import com.demoqa.serenitybdd.questions.LoginUser.LoginUserQuestion;
import com.demoqa.serenitybdd.task.LoginUser.LoginTask;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class LoginUserStepDefinitions {

    @Cuando("el usuario inicia sesion ingresando {string} y {string}")
    public void elUsuarioIniciaSesionIngresandoY(String user, String password) {
        theActorInTheSpotlight().attemptsTo(
                LoginTask.LoginTask(user, password)
        );
    }
    
    @Entonces("al realizar el login puede ver {string}")
    public void alRealizarElLoginPuedeVer(String message) {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(
                LoginUserQuestion.verification(message)
        ));
    }

}
