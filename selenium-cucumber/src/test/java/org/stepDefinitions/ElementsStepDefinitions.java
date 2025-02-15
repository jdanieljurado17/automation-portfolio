package org.stepDefinitions;

import io.cucumber.java.an.E;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.assertions.ElementsAssertions;
import org.openqa.selenium.WebDriver;
import org.tasks.ElementsTasks;
import org.utils.DriverManager;

public class ElementsStepDefinitions {
    WebDriver driver = DriverManager.getDriver();
    ElementsTasks elementsTasks = new ElementsTasks(driver);
    ElementsAssertions elementsAssertions = new ElementsAssertions(driver);

    @Given("the user access the demoqa.com website")
    public void theUserAccessTheWebsite(){
        elementsTasks.navigateToWebsite();
    }

    @When("the user navigates to elements tab")
    public void theUserNavigatesToElementsTab(){
        elementsTasks.navigateToElementsForm();
    }

    @Then("the user can fill the form and submit it")
    public void theUserCanFillTheFormAndSubmitIt(){
        elementsTasks.fillAndSubmitForm();
        elementsAssertions.verifyFormDataIsCorrect();
    }
}
