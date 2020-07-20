package com.bitrix24.pages;

import com.bitrix24.utilities.Driver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    protected static WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 20);

    public BasePage() {
        //we put this line to be able to use @FindBy, @FindBys.. annotations
        PageFactory.initElements(Driver.getDriver(), this);
    }


}
