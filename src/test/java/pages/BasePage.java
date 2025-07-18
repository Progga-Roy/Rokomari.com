package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

import static utilities.DriverSetUp.getDriver;

public class BasePage {

    public void loadAPage(String url) {
        getDriver().get(url);
    }

    public String getCurrentUrl() {
        return getDriver().getCurrentUrl();
    }

    public WebElement getElement(By locator) {
        return getDriver().findElement(locator);
    }
    public List<WebElement> getElementsFromList (By locator){
        return getDriver().findElements(locator);
    }

    public void maximizeScreen() {
        getDriver().manage().window().maximize();
    }

    public boolean visibilityState(By locator) {
        return getElement(locator).isDisplayed();
    }

    public void clickOnElement(By locator) {
        getElement(locator).click();
    }

    public void waitForElement(By locator) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public void waitForClick(By locator) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    public void writeOnElement(By locator, String text) {
        getElement(locator).sendKeys(text);
    }

    public String getElementByText(By locator) {
        return getElement(locator).getText();
    }

    public void handleModalIfPresent(By... modalCloseButtons) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        By overlay = By.xpath("//div[@class='modal_overlay__4UXSq']");

        for (By closeBtn : modalCloseButtons) {
            List<WebElement> elements = getDriver().findElements(closeBtn);

            if (!elements.isEmpty()) {
                try {
                    WebElement modalBtn = wait.until(ExpectedConditions.elementToBeClickable(closeBtn));

                    // Scroll to button if needed
                    ((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView(true);", modalBtn);

                    // Click using JS (bypass overlay issues)
                    ((JavascriptExecutor) getDriver()).executeScript("arguments[0].click();", modalBtn);

                    // Wait for overlay to disappear
                    List<WebElement> overlays = getDriver().findElements(overlay);
                    if (!overlays.isEmpty()) {
                        wait.until(ExpectedConditions.invisibilityOfElementLocated(overlay));
                        System.out.println("Overlay disappeared.");
                    }

                    return;
                } catch (Exception e) {
                    System.out.println("Error closing modal: " + e.getMessage());
                }
            }
        }

        System.out.println("No modal to close.");
    }

    public void scrollToElement(By locator) {
        WebElement element = getElement(locator);
        ((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView({block:'center'});", element);

    }   public void scrollToElements(By locator) {
        WebElement element = getElement(locator);
        ((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView(true);", element);
    }
   public void moveToElement(By locator){
        WebElement element =  getDriver().findElement(locator);
        Actions actions = new Actions(getDriver());
        actions.moveToElement(element);
   }
   public boolean isCheckBoxSelected(By locator){
        return getElement(locator).isSelected();
   }
public void backword(){
        getDriver().navigate().back();
}


}
