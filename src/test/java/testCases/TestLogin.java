package testCases;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import utilities.DriverSetUp;

public class TestLogin extends DriverSetUp {
    LoginPage login_page = new LoginPage();

    @Test
    public void TestLoadThePaseAndGetTheTitle() {
        //Load page and Check visibility of logo
        login_page.loadAPage(login_page.url);
        login_page.maximizeScreen();
        Assert.assertEquals(login_page.getCurrentUrl(), login_page.url);
        Assert.assertTrue(login_page.visibilityState(login_page.logo));

    }
    @Test
    public void TestSignUpWithGoogle() throws InterruptedException {
        //Log in with mobile number
        login_page.loadAPage(login_page.url);
        login_page.waitForElement(login_page.loginPath);
        login_page.clickOnElement(login_page.loginPath);
        login_page.waitForElement(login_page.input);
        login_page.clickOnElement(login_page.input);
        login_page.writeOnElement(login_page.input,"01830428352");
        login_page.clickOnElement(login_page.nextButton);
        Thread.sleep(1000);
        login_page.scrollToElement(login_page.loginBtn);
        Thread.sleep(15000);
        login_page.clickOnElement(login_page.loginBtn);
        Assert.assertEquals(login_page.getElementByText(login_page.profileNamePath),login_page.profileNameText);


    }

}
