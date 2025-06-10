package com.demoqa.serenitybdd.drivers;

import net.thucydides.core.webdriver.DriverSource;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebDriver implements DriverSource {


    @Override
    public org.openqa.selenium.WebDriver newDriver() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--diable-infobars");
        options.addArguments("--disable-extensions");

        return new ChromeDriver(options);
    }

    @Override
    public boolean takesScreenshots() {
        return false;
    }
}
