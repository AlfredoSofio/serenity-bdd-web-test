package com.demoqa.serenitybdd.ui.LoginUser;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginUserPage {
    public static final Target BTNM_LOGIN = Target.the("Boton de login").located(By.id("Login2"));
    public static final Target INPUT_LOGIN_USERNAME = Target.the("Boton de login").located(By.id("loginusername"));
    public static final Target INPUT_PASSWORD = Target.the("Boton de login").located(By.id("loginpassword"));
}
