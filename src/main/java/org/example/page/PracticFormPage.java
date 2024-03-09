package org.example.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class PracticFormPage extends BasePage{


    @FindBy(id="firstName")
    public WebElement firsName;

    @FindBy(id="lastName")
    public WebElement lastName;

    @FindBy(id="userEmail")
    public WebElement userEmail;

    @FindBy(id="userNumber")
    public WebElement userNumber;

    @FindBy(id="currentAddress")
    public WebElement currentAddress;

    @FindBy(xpath = "//div[@class='custom-control custom-radio custom-control-inline']")
    public List<WebElement> gender;

    @FindBy(xpath = "//div[@class='custom-control custom-checkbox custom-control-inline']")
    public List<WebElement> hobbi;

    @FindBy(css = "input.form-control-file")
    public WebElement element;

    @FindBy(id = "subjectsInput")
    public WebElement subject;

    @FindBy(id = "react-select-3-input")
    public WebElement city;

    @FindBy(id = "react-select-4-input")
    public WebElement state;

    @FindBy(id = "submit")
    public WebElement submit;


}
