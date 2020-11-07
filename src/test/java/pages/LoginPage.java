package pages;



import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utilities.ConfigurationReader;
import utilities.Driver;

import java.util.concurrent.TimeUnit;

public class LoginPage extends BasePage{
    @FindBy (xpath = "/html/body/lhw-root/lhw-layout/lhw-header/mat-toolbar/div[2]/button")
    private WebElement loginbutton;

    @FindBy(xpath = "(//*[@id='signInFormUsername'])[2]")
    private WebElement username;

    @FindBy(xpath = "(//*[@id='signInFormPassword'])[2]")
    private WebElement passwordBox;

    @FindBy(xpath = "/html/body/div[1]/div/div[1]/div[2]/div[2]/div[3]/div/div/form/input[3]")
    private WebElement submitButton;

    @FindBy(xpath = "//*[@id=\"mat-dialog-0\"]/lhw-welcome/div/div[1]/div[2]/button")
    private WebElement iframeButton;




    public void LoginMethod(){
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        wait.until(ExpectedConditions.elementToBeClickable(loginbutton));
        loginbutton.click();

        username.sendKeys(ConfigurationReader.getProperty("username"));
        passwordBox.sendKeys(ConfigurationReader.getProperty("password")+ Keys.ENTER);
        wait.until(ExpectedConditions.visibilityOf(iframeButton));
        iframeButton.click();
        

    }
}
