import io.cucumber.java.Scenario;
import io.cucumber.java.eo.Se;
import net.thucydides.core.environment.SystemEnvironmentVariables;
import net.thucydides.core.util.EnvironmentVariables;
import net.thucydides.core.webdriver.DriverSource;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import runner.SerenityRunner;

import java.net.URL;
import java.util.HashMap;
import java.util.HashSet;

public class LambdaTestSerenityDriver implements DriverSource {













    public RemoteWebDriver newDriver() {
        EnvironmentVariables environmentVariables = SystemEnvironmentVariables.createEnvironmentVariables();




        String username = "shubhamr";
        if (username == null) {
            username = "shubhamr";
        }

        String accessKey = "";
        if (accessKey == null) {
            accessKey = "";
        }

        ChromeOptions browserOptions = new ChromeOptions();
        browserOptions.setPlatformName("Windows 10");
        browserOptions.setBrowserVersion("108.0");
        browserOptions.setAcceptInsecureCerts(true);
        HashMap<String, Object> lambdaTestOptions = new HashMap<>();
        lambdaTestOptions.put("build", "Sample Test");
      //  lambdaTestOptions.put("name",sr.scenario.getName()); ;
        lambdaTestOptions.put("project", "Google");
        lambdaTestOptions.put("selenium_version", "4.0.0");
        lambdaTestOptions.put("driver_version", "108.0");
        //lambdaTestOptions.put("local", true);
        lambdaTestOptions.put("network", false);
        lambdaTestOptions.put("network.har",false);
        lambdaTestOptions.put("video", true);
        lambdaTestOptions.put("visual", false);
        lambdaTestOptions.put("idleTimeout", "300");
        lambdaTestOptions.put("lambdaStrict", false);
        lambdaTestOptions.put("w3c", true);
        //lambdaTestOptions.put("tunnelName", "Serenity");
        lambdaTestOptions.put("tunnel", true);
        browserOptions.setCapability("LT:Options", lambdaTestOptions);

        try {
            String url = "https://" + username + ":" + accessKey + "@" + environmentVariables.getProperty("lt.grid")
                    + "/wd/hub";
            return new RemoteWebDriver(new URL(url), browserOptions);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public boolean takesScreenshots() {
        return false;
    }
}
