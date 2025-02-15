package org.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ElementsPage {
    WebDriver driver;

    public ElementsPage(WebDriver driver){
        this.driver = driver;
    }

    By elementsCard = By.xpath("//h5[contains(text(),'Elements')]/parent::div/parent::div");
    By textBoxBtn = By.xpath("//span[contains(text(),'Text Box')]");
    By nameInput = By.id("userName");
    By emailInput = By.id("userEmail");
    By currentAddressInput = By.id("currentAddress");
    By permanentAddressInput = By.id("permanentAddress");
    By submitBtn = By.id("submit");
    By nameConfirmation = By.id("name");
    By emailConfirmation = By.id("email");
    By currentAddress = By.xpath("//p[@id='currentAddress']");
    By permanentAddress = By.xpath("//p[@id='permanentAddress']");


    public By getElementsCard(){
        return elementsCard;
    }

    public By getTextBoxBtn(){
        return textBoxBtn;
    }

    public By getNameInput(){
        return nameInput;
    }

    public By getEmailInput(){
        return emailInput;
    }

    public By getCurrentAddressInput(){
        return currentAddressInput;
    }

    public By getPermanentAddressInput(){
        return permanentAddressInput;
    }

    public By getSubmitBtn() {
        return submitBtn;
    }

    public By getNameConfirmation(){
        return nameConfirmation;
    }

    public By getEmailConfirmation() {
        return emailConfirmation;
    }

    public By getCurrentAddressConfirmation() {
        return currentAddress;
    }

    public By getPermanentAddressConfirmation() {
        return permanentAddress;
    }


}
