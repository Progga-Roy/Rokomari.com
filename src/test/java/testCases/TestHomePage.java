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
      //Load the page
      home_page.loadAPage(home_page.url);
      //Handle modal
      home_page.handleModalIfPresent();
      //Check current url and welcome text
      Assert.assertEquals(home_page.getCurrentUrl(),home_page.url);
      Assert.assertTrue(home_page.visibilityState(home_page.welcomeTextPath));
      Assert.assertEquals(home_page.getElementByText(home_page.welcomeTextPath),home_page.welcomeText);
      Assert.assertEquals(home_page.getElementByText(home_page.profileNamePath),home_page.profileNameText);
    }
    @Test
    public void TestClickBookSection() throws InterruptedException {
        //Load the page
        home_page.loadAPage(home_page.url);
        //Handle modal
        home_page.handleModalIfPresent();
        //Navigate the book page
        home_page.waitForElement(home_page.bookPath);
        home_page.waitForClick(home_page.bookPath);
        Thread.sleep(10000);
        home_page.clickOnElement(home_page.bookPath);
        Thread.sleep(10000);
        Assert.assertEquals(home_page.getElementByText(home_page.bookPath),home_page.bookText);
    }

}
