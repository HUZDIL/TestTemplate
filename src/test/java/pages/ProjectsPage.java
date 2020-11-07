package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ProjectsPage extends BasePage{

    @FindBy(xpath = "/html/body/lhw-root/lhw-layout/mat-sidenav-container/mat-sidenav/div/lhw-sidenav/div/div[2]/div[1]")
    private WebElement projectButton;


    public void projectModule(){
        wait.until(ExpectedConditions.elementToBeClickable(projectButton));
        projectButton.click();
    }













}
