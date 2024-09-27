package org.example.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    @FindBy(css = "h1")
    private WebElement pageTitle;

    public String getPageTitle() {
        return pageTitle.getText();
    }

    public void navigateTo(String url) {
        driver.get(url);
    }
}