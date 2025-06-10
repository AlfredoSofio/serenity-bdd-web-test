package com.demoqa.serenitybdd.stepsdefinitions.SignUp;

import com.demoqa.serenitybdd.questions.SignUp.SignUpQuestion;
import com.demoqa.serenitybdd.task.OpenPageTask;
import com.demoqa.serenitybdd.task.SignUp.SignUpFailureTask;
import com.demoqa.serenitybdd.task.SignUp.SignUpTask;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class SignUpStepDefinitions {

    @Dado("que el usuario abre la pagina {string}")
    public void queElUsuarioAbreLaPagina(String sitio) {
        theActorInTheSpotlight().attemptsTo(
                OpenPageTask.OpenPageTask(sitio)
        );
    }

    @Cuando("el usuario desea registrarse e ingresa  {string} y {string}")
    public void elUsuarioDeseaRegistrarseEIngresaY(String user, String password) {
        theActorInTheSpotlight().attemptsTo(
                SignUpTask.LoginTask(user, password)
        );
    }

    @Entonces("ve el mensaje {string}")
    public void veElMensaje(String message) {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(SignUpQuestion.verification(message)));

    }

    @Cuando("el usuario desea registrarse e ingresa {string} existente y {string}")
    public void elUsuarioDeseaRegistrarseEIngresaExistenteY(String user, String password) {
        theActorInTheSpotlight().attemptsTo(
                SignUpFailureTask.LoginTask(user,password)
        );
    }

    @Entonces("ve el mensaje de error {string}")
    public void veElMensajeDeError(String message) {
        theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(SignUpQuestion.verification(message))
        );
    }


}
