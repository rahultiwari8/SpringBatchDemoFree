package org.learning.seleniumdesign.srp.component;


import org.learning.seleniumdesign.srp.common.AbstractComponent;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchWidget extends AbstractComponent {
    @Override
    public boolean isDisplayed() {
        return false;
    }/*





    @FindBy(name = "q")
    private WebElement searchBox;



    public void enter(String keyword)
    {
        this.searchBox.clear();
        this.searchBox.sendKeys(keyword);
        this.searchBox.sendKeys(Keys.ENTER);

    }

    @Override
    public boolean isDisplayed() {

       return this.webDriverWait.until((webDriver -> this.searchBox.isDisplayed()));

    }


*/}
