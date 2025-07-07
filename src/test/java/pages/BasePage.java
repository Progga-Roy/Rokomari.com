package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static utilities.DriverSetUp.getDriver;

public class BasePage{

    public void loadAPage(String url){
        getDriver().get(url);
    }
    public String getCurrentUrl(){
        return getDriver().getCurrentUrl();
    }
    public WebElement getElement(By locator){
        return getDriver().findElement(locator);
    }
    public void maximizeScreen(){
        getDriver().manage().window().maximize();
    }
    public boolean visibilityState(By locator){
        return getElement(locator).isDisplayed();
    }
    public void clickOnElement(By locator) {
        getElement(locator).click();
    }
    public void waitForElement(By locator){
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
    public void writeOnElement(By locator ,String text){
        getElement(locator).sendKeys(text);
    }
}
