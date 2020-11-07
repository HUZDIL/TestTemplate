package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.LandingPage;
import pages.LoginPage;

import java.util.concurrent.TimeUnit;

public class Test {

    static WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://hub-staging.liquibase.com/landing-page");
        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

       // WebElement loginbuton = webDriver.findElement(By.xpath("/html/body/lhw-root/lhw-layout/mat-sidenav-container/mat-sidenav-content/div/lhw-landing-page/div/mat-card/div[2]/button[1]"));
         WebElement loginbuton =webDriver.findElement(By.xpath("/html/body/lhw-root/lhw-layout/lhw-header/mat-toolbar/div[2]/button"));
        loginbuton.click();
        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //WebElement username = webDriver.findElement(By.linkText("forgotPassword"));
        WebElement username = webDriver.findElement(By.xpath("(//*[@id='signInFormUsername'])[2]"));
        WebElement pass = webDriver.findElement(By.xpath("(//*[@id='signInFormPassword'])[2]"));

        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //username.click();
        username.sendKeys("haciuzdil@yahoo.com");
        pass.sendKeys("123Qwe123." + Keys.ENTER);

        LandingPage landingPage = new LandingPage();

         WebElement iframeButton = webDriver.findElement(By.xpath("\"//*[@id=\\\"mat-dialog-0\\\"]/lhw-welcome/div/div[1]/div[2]/button\""));
        iframeButton.click();
        landingPage.settingModule();
        landingPage.userInfoModule();
        iframeButton.click();


    }
}