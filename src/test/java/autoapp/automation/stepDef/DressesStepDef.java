package autoapp.automation.stepDef;

import autoapp.automation.pages.DressesPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class DressesStepDef {


    @And("^I click on Quick View$")
    public void iClickOnQuickView() {
        DressesPage.quickView();
    }

    @And("^I select blue color$")
    public void iSelectBlueColor() {
        DressesPage.selectColor();
    }

    @And("^I click on Add to cart$")
    public void iClickOnAddToCart() {
        DressesPage.clickOnAddToCart();
    }

    @Then("^I verify product name, color and quantity$")
    public void iVerifyProductNameColorAndQuantity() {
        DressesPage.verifyProductColorQuantity();
    }

    @Then("^It should navigate to Printed Summer Dresses page$")
    public void itShouldNavigateToPrintedSummerDressesPage() {
        DressesPage.printedSummerDress();
    }
}
