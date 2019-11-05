package com.demoaut.pages;

import com.demoaut.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPage {

    public RegistrationPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(linkText = "REGISTER")
    public WebElement registerLink;

    @FindBy(name = "firstName")
    public WebElement firstName;

    @FindBy(name = "lastName")
    public WebElement lastName;

    @FindBy(name = "phone")
    public WebElement phone;

    @FindBy(id = "userName")
    public WebElement email;

    @FindBy(name = "address1")
    public WebElement address;

    @FindBy(name = "city")
    public WebElement city;

    @FindBy(name = "state")
    public WebElement state;

    @FindBy(name = "postalCode")
    public WebElement postalCode;

    @FindBy(name = "country")
    public WebElement country;




    public void register() {
        registerLink.click();
    }

    public void selectCountry(String countryName) {
        Select select = new Select(Driver.get().findElement(By.name("country")));
        select.selectByVisibleText(countryName);


    }


}
