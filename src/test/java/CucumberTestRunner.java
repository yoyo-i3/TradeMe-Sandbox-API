import apiServices.BaseService;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"stepdefs"},
        tags = "@TradeMeAPI",
        plugin = {"pretty",
                "html:target/cucumber-reports/cucumber-pretty",
                "json:target/cucumber-reports/json-reports/CucumberTestReport.json",
                "rerun:target/cucumber-reports/rerun-reports/rerun.txt"
        },
        monochrome = true)
public class RunTest {

    @Before
    public static void setUp(){
//        BaseService.deleteFileContent();
    }

//    @Test
//    public void RunTest(){
//    }
}
