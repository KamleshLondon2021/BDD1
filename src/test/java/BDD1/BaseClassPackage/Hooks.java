package BDD1.BaseClassPackage;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;

public class Hooks {

    public DriverFectory driverFectory = new DriverFectory();

    @Before

    public void setup(){

        driverFectory.openbrowser();
    }

    @After

    public void teardown(){
        driverFectory.closebrowser();
    }

}
