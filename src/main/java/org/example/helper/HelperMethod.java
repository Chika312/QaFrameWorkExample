package org.example.helper;

import net.bytebuddy.asm.Advice;
import org.example.driver.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.Random;

public class HelperMethod {
    public HelperMethod wait(WebElement element){
        WebDriverWait driverWait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        driverWait.until(ExpectedConditions.visibilityOf(element));
        return this;
    }
    public HelperMethod waitClikc(WebElement element){
        wait(element);
        moveToElement(element);
        element.click();
        return this;
    }
    public HelperMethod sendKeys(WebElement element,String text){
        wait(element);
        moveToElement(element);
        element.sendKeys(text);
        return this;
    }
    public HelperMethod moveToElement (WebElement element){
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(element).perform();
        return this;
    }

    public HelperMethod clickRandom(List<WebElement> elements){
        Random random = new Random();
        int num = random.nextInt(elements.size());
        elements.get(num).click();
        return this;
    }
    public HelperMethod sendKeysEnter (WebElement element,String text){
        wait(element).moveToElement(element);
        element.sendKeys(text);
        element.sendKeys(Keys.TAB);
        return this;
    }
}
