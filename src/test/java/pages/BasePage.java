package pages;


import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.Driver;

public abstract class BasePage {

    public BasePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);



}
