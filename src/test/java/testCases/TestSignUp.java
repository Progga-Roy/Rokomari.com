package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import utilities.DriverSetUp;

public class TestSignUp extends DriverSetUp {
    LoginPage login_page = new LoginPage();

    @Test
    public void TestLoadThePaseAndGetTheTitle() {
        login_page.loadAPage(login_page.url);
        login_page.maximizeScreen();
        Assert.assertEquals(login_page.getCurrentUrl(), login_page.url);
        Assert.assertTrue(login_page.visibilityState(login_page.logo));

    }
    @Test
    public void TestSignUpWithGoogle() throws InterruptedException {
//        login_page.loadAPage(login_page.url);
//        login_page.waitForElement(login_page.loginPath);
//        login_page.clickOnElement(login_page.loginPath);
//        login_page.waitForElement(login_page.input);
//        Thread.sleep(3000);
//        login_page.clickOnElement(login_page.input);
//        Thread.sleep(3000);
//        login_page.writeOnElement(login_page.input,"01830428352");
//        Thread.sleep(1000);
//        login_page.clickOnElement(login_page.nextButton);
//        Thread.sleep(10000);
//        login_page.clickOnElement(login_page.loginBtn);
//        Thread.sleep(3000);
//        Assert.assertEquals(login_page.profileNamePath,login_page.profileNameText);


    }


}
