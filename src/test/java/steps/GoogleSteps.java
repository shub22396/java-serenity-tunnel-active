package steps;

import io.cucumber.java.Scenario;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.steps.ScenarioSteps;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import pages.GooglePage;

public class GoogleSteps extends ScenarioSteps {










    String scene;
    @Steps
    GooglePage googlePage;

    static Logger log = LogManager.getLogger(GoogleSteps.class);






    public void navigateToLoginPage() {
        googlePage.open();
        getDriver().manage().window().maximize();

    }

    public String getTitle(){
        return getDriver().getTitle();
    }
}
