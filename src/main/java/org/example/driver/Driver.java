package org.example.driver;

import org.example.config.ConfigReader;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class Driver {
    public static WebDriver driver;

    public Driver() {
    }

    public static WebDriver getDriver() {
        if(driver==null) {
            switch (ConfigReader.getValueFileProperties("browers")) {
                case "chrome":
                    driver = ChromeWebDriver.loadChromeDriver();
                    break;
                case "firefox":
                    driver = FireFoxWebDriver.loadFireFoxDriver();
                    break;
                default:
                    System.out.println("Not Found WebDriver");
            }
        }
        return driver;
    }
    public static void closeBrower(){
        try{
            if(driver!=null){
                driver.close();
                driver.quit();
                driver=null;
            }
        }catch (Exception e){
            new IOException("Error close brower");
        }
    }
}
