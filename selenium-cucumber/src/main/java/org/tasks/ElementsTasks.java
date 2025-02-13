package org.tasks;

import org.openqa.selenium.WebDriver;
import org.pages.ElementsPage;

public class ElementsTasks {
    WebDriver driver;
    ElementsPage elementsPage;

    public ElementsTasks(WebDriver driver){
        this.driver = driver;
        elementsPage = new ElementsPage(driver);
    }

    public void navigateToWebsite(){
        driver.get("https://demoqa.com/");
        driver.findElement(elementsPage.getElementsCardLocator()).click();
    }
}
