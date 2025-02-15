package org.tasks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.pages.ElementsPage;
import org.utils.CommonUiInteractions;

import java.util.ArrayList;
import java.util.List;

public class ElementsTasks {
    WebDriver driver;
    ElementsPage elementsPage;
    CommonUiInteractions commonUiInteractions;

    public ElementsTasks(WebDriver driver){
        this.driver = driver;
        elementsPage = new ElementsPage(driver);
        commonUiInteractions = new CommonUiInteractions(driver);
    }

    public void navigateToWebsite(){
        driver.get("https://demoqa.com/");
    }

    public void navigateToElementsForm(){
        WebElement elementsCard = driver.findElement(elementsPage.getElementsCard());
        commonUiInteractions.scrollToElement(elementsCard);
        elementsCard.click();
        driver.findElement(elementsPage.getTextBoxBtn()).click();
    }

    public List<String> passingData(){
        List<String> data = new ArrayList<>();
        data.add("Name");
        data.add("user@email.com");
        data.add("address nonsense 1234");
        data.add("address nonsense 1345");

        return data;
    }


    public void fillAndSubmitForm(){
        driver.findElement(elementsPage.getNameInput()).sendKeys(passingData().get(0));
        driver.findElement(elementsPage.getEmailInput()).sendKeys(passingData().get(1));
        driver.findElement(elementsPage.getCurrentAddressInput()).sendKeys(passingData().get(2));
        driver.findElement(elementsPage.getPermanentAddressInput()).sendKeys(passingData().get(3));
        WebElement submitBtn = driver.findElement(elementsPage.getSubmitBtn());
        commonUiInteractions.scrollToElement(submitBtn);
        submitBtn.click();
    }

    public List<String> getFormConfirmationData(){
        List<String> data = new ArrayList<>();

        data.add(driver.findElement(elementsPage.getNameConfirmation()).getText());
        data.add(driver.findElement(elementsPage.getEmailConfirmation()).getText());
        data.add(driver.findElement(elementsPage.getCurrentAddressConfirmation()).getText());
        data.add(driver.findElement(elementsPage.getPermanentAddressConfirmation()).getText());

        return data;
    }


}
