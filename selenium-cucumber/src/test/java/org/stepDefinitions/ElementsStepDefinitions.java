package org.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.tasks.ElementsTasks;
import org.utils.DriverManager;

public class ElementsStepDefinitions {
    ElementsTasks elementsTasks = new ElementsTasks(DriverManager.getDriver());

    @Given("the user access the demoqa.com website")
    public void theUserAccessTheWebsite(){
        elementsTasks.navigateToWebsite();
    }

    @When("the user navigates to elements tab")
    public void theUserNavigatesToElementsTab(){

    }

    @Then("the user can fill the form and submit it")
    public void theUserCanFillTheFormAndSubmitIt(){

    }
}
