package org.learning.seleniumdesign.factory;

import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;

//this class give you a page fully built. like GoogleFrench and GOogleEnglish
public class GoogleFactory {
    @Autowired
    public WebDriver webDriver;
    public static GooglePage get(String language)
}
