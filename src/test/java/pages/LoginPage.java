package pages;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utilities.ConfigurationReader;
import utilities.Driver;

public class LoginPage extends BasePage{
    @FindBy(xpath = "")
    private WebElement emailBox;

    @FindBy(xpath = "")
    private WebElement passwordBox;

    @FindBy(xpath = "")
    private WebElement submitButton;


    public void LoginMethod(){
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        wait.until(ExpectedConditions.urlContains("login"));
        emailBox.sendKeys(ConfigurationReader.getProperty("username"));
        passwordBox.sendKeys(ConfigurationReader.getProperty("password"));
        submitButton.click();
    }
}
