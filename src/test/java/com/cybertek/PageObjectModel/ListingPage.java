package com.cybertek.PageObjectModel;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ListingPage {

    public ListingPage(){
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "asdfasdf")
    public WebElement address;

    @FindBy(xpath = "asdfasdf")
    public WebElement agent;

    @FindBy(xpath = "asdfasdf")
    public WebElement map;

}
