package pages;

import org.apache.hc.core5.util.Asserts;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class ProjectsPage extends BasePage{

    @FindBy(xpath = "/html/body/lhw-root/lhw-layout/mat-sidenav-container/mat-sidenav/div/lhw-sidenav/div/div[2]/div[2]")
    private WebElement projectButton;

    @FindBy(xpath ="/html/body/lhw-root/lhw-layout/mat-sidenav-container/mat-sidenav/div/lhw-sidenav/div/div[3]/lhw-projects-tree/div/div/div/div")
    private WebElement defaultProject;


    @FindBy(xpath = "/html/body/lhw-root/lhw-layout/mat-sidenav-container/mat-sidenav/div/lhw-sidenav/div/div[3]/lhw-projects-tree/div/div/div[2]/div[1]/div[2]")
    private WebElement operationsButton;


    @FindBy(xpath = "//*[@id='mat-select-8']")
    private WebElement resultButton;

    @FindBy(xpath = "//*[@id='mat-option-27']/span")
    private WebElement passButton;

    @FindBy(xpath = "//*[@id=\"mat-expansion-panel-header-1\"]/span[1]/mat-panel-title")
    private WebElement expandAllButton;



    public void projectModule(){
        wait.until(ExpectedConditions.elementToBeClickable(projectButton));
        projectButton.click();
    }
    public void defaultProjectModule(){
        wait.until(ExpectedConditions.elementToBeClickable(defaultProject));

        defaultProject.click();
    }

    public void operationsModule(){
        wait.until(ExpectedConditions.elementToBeClickable(operationsButton));
        operationsButton.click();
    }
    public void resultModule(){

        wait.until(ExpectedConditions.elementToBeClickable(resultButton));
        resultButton.click();
        passButton.click();
    }
    public void expandAllModule(){
        wait.until(ExpectedConditions.elementToBeClickable(operationsButton));
        expandAllButton.click();
    }


    public void verify(){
        String expectedResult = "No Operations to display.";
        String actualResult =expandAllButton.getText();
        Assert.assertEquals(actualResult,expectedResult);


    }











}
