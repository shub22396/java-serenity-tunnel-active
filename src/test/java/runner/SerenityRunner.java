package runner;

//import com.lambdatest.tunnel.Tunnel;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import java.io.IOException;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"stepDefs"},
        dryRun = false,
        monochrome = true,
        tags = "@test",
        plugin = {"pretty"}
)
public  class SerenityRunner {





//    private static Tunnel t;
//    private static final Logger LOGGER = LogManager.getLogger(SerenityRunner.class);
//    static EnvironmentVariables environmentVariables = SystemEnvironmentVariables.createEnvironmentVariables();

//    static {
//        try {
//            t = new Tunnel();
//        } catch (Exception e) {
//            LOGGER.info("Failed to create tunnel", e);
//        }
//    }







    @BeforeClass()
    public static void setupTunneling() throws IOException, InterruptedException {

        String com = String.format("cd /Users/shubhamr/Desktop/Desktop/LT && ./LT --user shubhamr@lambdatest.com --key dl8Y8as59i1YyGZZUeLF897aCFvIDmaKkUU1e6RgBmlgMLIIhh");
        String[] command = {"/bin/bash", "-c", com };

// run the command
        Process process = Runtime.getRuntime().exec(command);


        Thread.sleep(5000);

////        HashMap<String, String> args = new HashMap<>();
////        args.put("user", environmentVariables.getProperty("lt.user"));
////        args.put("key", environmentVariables.getProperty("lt.key"));
////        args.put("tunnelName", "Serenity");
////        t.start(args);
////        LOGGER.info("LambdaTest tunnel with name {} has started", "Serenity");
//
//
    }
}
