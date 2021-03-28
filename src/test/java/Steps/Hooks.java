package Steps;

import Pages.DriverWeb;
import org.junit.After;
import org.junit.Before;

public class Hooks {
    @Before
    public void setUp(){
        //System.out.println("fechou aplicacao");
        DriverWeb.getDriver();
    }
    @After
    public void tearDown(){
        //System.out.println("fechou aplicacao");
        DriverWeb.endSession();
    }
}
