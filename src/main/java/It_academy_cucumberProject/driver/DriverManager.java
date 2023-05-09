package It_academy_cucumberProject.driver;

import com.codeborne.selenide.Configuration;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class DriverManager {

    public static void initDriver(String browserType) {
        Configuration.browser = browserType;
        Configuration.pageLoadTimeout = 10000;
        open();
        getWebDriver().manage().window().maximize();
    }
}