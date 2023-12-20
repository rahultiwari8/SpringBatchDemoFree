package org.learning.seleniumdesign.srp.config;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.learning.seleniumdesign.util.HeaderUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Duration;

@Configuration
@ComponentScan
public class MyConfig {

    public WebDriver webDriver;

    public WebDriverWait webDriverWait;

    public HeaderUtil headerUtil;
    @Bean
    public WebDriver getDriver()
    {
        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver();
        return webDriver;
    }


    @Bean
    public WebDriverWait getDriverWait()
    {

        this.webDriverWait = new WebDriverWait(webDriver, Duration.ofSeconds(30));
        return this.webDriverWait;
    }

    @Profile("stage")
    @Bean
    public HeaderUtil headerStage()
    {
        headerUtil = new HeaderUtil();
        headerUtil.setEnv("Stage");
        return headerUtil;
    }

    @Profile("dev")
    @Bean
    public HeaderUtil headerdev()
    {
        headerUtil = new HeaderUtil();
        headerUtil.setEnv("dev");
        return headerUtil;
    }

}
