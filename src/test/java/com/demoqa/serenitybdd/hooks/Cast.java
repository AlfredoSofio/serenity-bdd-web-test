package com.demoqa.serenitybdd.hooks;

import io.cucumber.java.Before;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;


public class Cast {

    @Before
    public void setUpOneStage(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Usuario Comprado");
    }
}
