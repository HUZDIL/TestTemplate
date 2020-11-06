package step_definition;

import org.junit.After;
import utilities.Driver;

public class Hooks {

    @After
    public static void tearDown(){
        Driver.getDriver().close();
    }



}