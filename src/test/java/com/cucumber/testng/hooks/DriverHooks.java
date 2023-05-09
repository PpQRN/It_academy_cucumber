package com.cucumber.testng.hooks;

import It_academy_cucumberProject.driver.DriverManager;
import io.cucumber.java.BeforeAll;

public class DriverHooks {
    @BeforeAll
    public static void setupDriver() {
        DriverManager.initDriver("chrome");
    }
}
