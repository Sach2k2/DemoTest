package autoapp.automation.stepDef;

import autoapp.automation.pages.DressesPage;
import autoapp.automation.pages.HomePage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomeStepDef {

    @When("^I click Dresses -> Summer Dresses$")
    public void iClickDressesSummerDresses() throws InterruptedException {
        HomePage.selectDresses();
    }

    @Then("^It should navigate to Summer Dresses page$")
    public void itShouldNavigateSummerDressesPage() {
        DressesPage.verifySummerDressesLabel();
    }


}
