package com.automation.petstore.steps;

import com.automation.petstore.assertions.PetRequestsAssertions;
import com.automation.petstore.tests.PetEndpointTests;
import com.fasterxml.jackson.core.JsonProcessingException;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class PetEndpointStepsDefinition {

    @Given("the user has a pet with the following data:")
    public void theUserHasPetData(DataTable petData){
        PetEndpointTests.organizeExpectedPetData(petData);
    }

    @When("the user sends a POST request to create the pet")
    public void theUserCreatesAPet() throws JsonProcessingException {
        PetEndpointTests.createPetAndSetGlobalVariables();
    }

    @Then("the pet should be created successfully")
    public void petCreatedValidation(){
        PetRequestsAssertions.validateCreatePetResponse();
    }

    @Then("the response should contain the pet data matching the created pet")
    public void  retrievedPetDataValidation(){
        PetRequestsAssertions.validatePetEndpointDynamicResponse("expectedData", "petEndpointResponse");
    }

    @Then("the response should contain the {string} message")
    public void deleteResponseValidation(String deleteMessage){
        PetRequestsAssertions.validateDeletePetResponse(deleteMessage);
    }

    @Then("the response should contain the updated pet data")
    public void validaFormUpdatedPet(){
        PetRequestsAssertions.validatePetUpdatedByForm("expectedData", "petEndpointResponse");
    }

    @And("the user sends a GET request to retrieve the pet by ID")
    public void theUserRetrieveAPetByID() throws JsonProcessingException {
        PetEndpointTests.getPetByIdRequest();
    }

    @And("the user sends a PUT request to update the pet with the following data:")
    public void userUpdatesThePet(DataTable petData) throws JsonProcessingException {
        PetEndpointTests.organizeExpectedPetData(petData);
        PetEndpointTests.updatePetRequest();
    }

    @And("the user sends a DELETE request to delete the pet by ID")
    public void userDeletesAPet(){
        PetEndpointTests.deletePetRequest();
    }

    @And("the user sends a POST request to update the pet with the form data endpoint:")
    public void userUpdatesAPetByFormData(DataTable dataTable) throws JsonProcessingException {
        PetEndpointTests.organizeExpectedPetData(dataTable);
        PetEndpointTests.updatePetByForm();
    }

}
