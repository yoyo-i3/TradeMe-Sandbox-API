package stepdefs;

import domain.UsedCarsDetails;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import static apiServices.BaseService.*;

public class ServiceHooks {
    private final UsedCarsDetails usedCarsDetails = new UsedCarsDetails();

    @Before
    public void initializeTest(){
        Properties props = System.getProperties();
        try {
            props.load(new FileInputStream(new File("src/main/resources/test.properties")));
        } catch(Exception e) {
            e.printStackTrace();
            System.exit(-1);
        }
    }

    @After
    public void tearDownTest(Scenario scenario) {
        if (scenario.isFailed()) {
            try {
                usedCarsDetails.resetAll();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        usedCarsDetails.resetAll();
    }

}
