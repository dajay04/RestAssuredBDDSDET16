package testRunner;


import base.BaseTest;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions
        (
                features = "C:\\Users\\dahiy\\IdeaProjects\\RestAssuredFramworkScractSDET16\\Features",
                glue = "stepDefinitions",
                tags = "@sanity",
                monochrome = true,
                dryRun = false,
                plugin = {"pretty","html:target/cucumber-reports.html"}
        )
public class TestRunner
{
        @BeforeClass
    public static void globalSetup()
        {
            // Create an instance of Base Class where setup and random no generated
            BaseTest obj = new BaseTest();

            // Calling methods
            obj.setUp();
            System.out.println(obj.toString());
        }
}
