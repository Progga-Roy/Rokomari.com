package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class DriverSetUp {
    public static final String browserName = System.getProperty("browser", "Chrome");
    public static final ThreadLocal<WebDriver> DRIVER_THREAD_LOCAL = new ThreadLocal<>();

    public void setDriver(WebDriver driver) {
        DriverSetUp.DRIVER_THREAD_LOCAL.set(driver);
    }

    public WebDriver getDriver() {
        return DRIVER_THREAD_LOCAL.get();
    }

    @BeforeSuite
    public void startBrowser() {
        WebDriver driver = getBrowser(browserName);
        setDriver(driver);
    }

    @AfterSuite
    public void closeBrowser() {
        getDriver().close();
    }

    public WebDriver getBrowser(String name) {
        if (name.equalsIgnoreCase("Chrome")) {
            return new ChromeDriver();
        } else if (name.equalsIgnoreCase("firefox")) {
            return new FirefoxDriver();
        } else if (name.equalsIgnoreCase("Edge")) {
            return new EdgeDriver();
        } else {
            throw new RuntimeException("Browser is not available in this : " + name);
        }
    }
}
