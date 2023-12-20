package org.learning.seleniumdesign.factory;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public abstract class GooglePage {

    @Autowired
    public WebDriver webDriver;

    @Autowired
    public WebDriverWait webDriverWait;

    abstract public void launchSite();
    abstract public void search(String keyword);

    abstract public int getResultsCount();



}
