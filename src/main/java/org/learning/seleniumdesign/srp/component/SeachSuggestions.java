package org.learning.seleniumdesign.srp.component;

import org.learning.seleniumdesign.srp.common.AbstractComponent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class SeachSuggestions extends AbstractComponent  {

    private WebDriverWait webDriverWait;

    @FindBy(css = "li.sbct")
    private List<WebElement> suggessions;


    public void clickSuggessionByIndex(int index)
    {
        this.suggessions.get(index-1).click();
    }

    @Override
    public boolean isDisplayed() {
        return this.webDriverWait.until(webDriver -> this.suggessions.size() >5 );
    }
}
