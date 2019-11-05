package com.demoaut.pages;

import com.demoaut.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage(){
        PageFactory.initElements(Driver.get(),this);
    }



}
