package org.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ElementsPage {
    WebDriver driver;

    public ElementsPage(WebDriver driver){
        this.driver = driver;
    }

    By elementsCard = By.xpath("//h5[contains(text(),'Elements')]/parent::div");

    public By getElementsCardLocator(){
        return elementsCard;
    }
}
