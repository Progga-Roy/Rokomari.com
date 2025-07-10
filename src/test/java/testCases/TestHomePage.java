package testCases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import utilities.DriverSetUp;

public class TestHomePage extends DriverSetUp {

    HomePage home_page = new HomePage();
    @Test
    public void TestHomePageUrlAndProfileText(){
      home_page.loadAPage(home_page.url);
      home_page.handleModalIfPresent();
      Assert.assertEquals(home_page.getCurrentUrl(),home_page.url);
      Assert.assertTrue(home_page.visibilityState(home_page.welcomeTextPath));
      Assert.assertEquals(home_page.getElementByText(home_page.welcomeTextPath),home_page.welcomeText);
      Assert.assertEquals(home_page.getElementByText(home_page.profileNamePath),home_page.profileNameText);
    }
    @Test
    public void TestClickBookSection() throws InterruptedException {
        home_page.loadAPage(home_page.url);
        home_page.handleModalIfPresent();
        home_page.waitForElement(home_page.bookPath);
        home_page.clickOnElement(home_page.bookPath);
        Thread.sleep(10000);
        Assert.assertEquals(home_page.getElementByText(home_page.bookPath),home_page.bookText);
    }

}
