package com.demoqa.serenitybdd.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage {
    public static final Target BTN_SIGN_UP = Target.the("Boton de ingreso a formulario sign up").located(By.xpath("//div[@id=\"navbarExample\"]//child::a[@id='signin2']"));
    public static final Target INPUT_USER_NAME = Target.the("Input del usar name").located(By.id("sign-username"));
    public static final Target INPUT_PASSWORD = Target.the("Input del password").located(By.id("sign-password"));
    public static final Target BTN_SINGUP_FINAL= Target.the("Realizar registro").located(By.xpath("//button[text()='Sign up']"));
}
