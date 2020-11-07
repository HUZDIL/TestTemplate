package stepDefinitions;

import io.cucumber.java.Scenario;
import org.junit.After;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;

public class Hooks {

    @After
    public static void tearDown(){


        System.out.println("###########-THE END-###################");

        Driver.getDriver().quit();














    }



}