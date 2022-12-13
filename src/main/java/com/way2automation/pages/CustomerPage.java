package com.way2automation.pages;

import com.way2automation.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class CustomerPage extends Utility {
    public CustomerPage(){
        PageFactory.initElements(driver, this);
    }
    @FindBy(id= "userSelect")
    WebElement nameDropDown;

    public void searchAndSelectNameFromDropDown(String text){
        Reporter.log("Selected" + text+ "from" + nameDropDown.toString());
        selectByVisibleTextFromDropDown(nameDropDown, text);
    }

}
