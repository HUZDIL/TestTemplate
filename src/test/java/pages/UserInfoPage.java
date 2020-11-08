package pages;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utilities.Driver;


public class UserInfoPage extends BasePage {

    @FindBy(xpath = "/html/body/lhw-root/lhw-layout/mat-sidenav-container/mat-sidenav/div/lhw-sidenav/div/div[2]/div[3]")
    private WebElement settingButton;

    @FindBy(xpath = "/html/body/lhw-root/lhw-layout/mat-sidenav-container/mat-sidenav/div/lhw-sidenav/div/div[3]/lhw-settings-tree/div/div[1]/div")
    private WebElement userInfoButton;

    @FindBy(xpath = "//input[@id='mat-input-3']")
    private WebElement firstName;

    @FindBy(xpath = "//input[@id='mat-input-4']")
    private WebElement middleName;

    @FindBy(xpath = "//input[@id='mat-input-5']")
    private WebElement lastName;

    @FindBy(xpath = "//input[@id='mat-input-8']")
    private WebElement url;

    @FindBy(xpath = "//input[@id='mat-input-9']")
    private WebElement Company;

    @FindBy(xpath = "//*[@id='mat-input-10']")
    private WebElement Bio;

    @FindBy(xpath = "/html/body/lhw-root/lhw-layout/mat-sidenav-container/mat-sidenav-content/div/lhw-settings-user-info/div/lhw-edit-user/div/div[1]/form/button/span")
    private WebElement update;




    public void settingModule(){
        wait.until(ExpectedConditions.elementToBeClickable(settingButton));
        settingButton.click();
    }


    public void userInfoModule(){
        wait.until(ExpectedConditions.elementToBeClickable(userInfoButton));
        userInfoButton.click();

    }

    public void setFirstName(){
        firstName.sendKeys("Haci");
    }
    public void setMiddleName(){
        middleName.sendKeys("Alex");


    }
    public void setLastName() {
        lastName.sendKeys("number");
    }
    public void setUrl() {
        url.sendKeys("empty");
    }
    public void setCompany() {
        Company.sendKeys("Liguidbase");
    }
    public void setBio() {
        Bio.sendKeys("i have been working as a SDET over 4 years");
    }
    public void updateInfo() {
            update.click();
    }

    //After click update button, the button should not be clickable. We can use to verify (because there is no specific desciription to verify.
    public boolean verifyClick(){
        if(update.isEnabled()){
            return false;
        }else{
            return true;
        }

    }




}
