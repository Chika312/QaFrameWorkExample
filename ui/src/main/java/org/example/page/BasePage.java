package org.example.page;

import org.example.driver.Driver;
import org.openqa.selenium.support.PageFactory;

import java.sql.DriverManager;

public abstract class BasePage {
    public BasePage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
}
