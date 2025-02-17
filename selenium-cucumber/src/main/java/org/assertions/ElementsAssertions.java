package org.assertions;

import org.openqa.selenium.WebDriver;
import org.tasks.ElementsTasks;
import org.testng.Assert;

import java.util.List;
import java.util.stream.Collectors;

public class ElementsAssertions {
    WebDriver driver;
    ElementsTasks elementsTasks;

    public ElementsAssertions(WebDriver driver){
        this.driver = driver;
        elementsTasks = new ElementsTasks(driver);
    }

    public void verifyFormDataIsCorrect(){
        List<String> uiData = elementsTasks.getFormConfirmationData();
        List<String> passedData = elementsTasks.passingData();
        List<String> cleanedUiData = uiData.stream()
                .map(s -> s.contains(":") ? s.substring(s.indexOf(":") + 1).trim() : s) // Remove labels and trim spaces
                .collect(Collectors.toList());

        Assert.assertTrue(cleanedUiData.containsAll(passedData), "Form data doesn't match the input");
    }

}
