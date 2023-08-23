package Base;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.junit.Test;

public class Hooks {

    @Before
    public void beforeScenario(){
        TestBase.initialize();
    }

    @After
    public void afterScenraio(){
        TestBase.driver.quit();
    }
}
