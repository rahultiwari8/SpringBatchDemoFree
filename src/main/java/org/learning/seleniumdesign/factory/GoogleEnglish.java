package org.learning.seleniumdesign.factory;

import com.google.common.util.concurrent.Uninterruptibles;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GoogleEnglish extends GooglePage{


    @FindBy(name="q")
    private WebElement searchBox;

    @FindBy(name = "btnK")
    private WebElement searchBtn;

    @FindBy(css = "div.rc")
    private List<WebElement> results;



    @Override
    public void launchSite() {
        PageFactory.initElements(webDriver, this);
        webDriver.get("https://www.google.com");
    }

    @Override
    public void search(String keyword) {
        for(char ch : keyword.toCharArray()){
            Uninterruptibles.sleepUninterruptibly(5, TimeUnit.MILLISECONDS);
            this.searchBox.sendKeys(ch + "");
        }
        webDriverWait.until((d) -> this.searchBtn.isDisplayed());
        this.searchBtn.click();
    }

    @Override
    public int getResultsCount() {
        webDriverWait.until((d) -> this.results.size() > 1);
        return this.results.size();
    }
}
