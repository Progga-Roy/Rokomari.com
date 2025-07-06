package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import utilities.DriverSetUp;

public class TestSignUpWithGoogle extends DriverSetUp {
    LoginPage login_page = new LoginPage();

    @Test
    public void TestLoadThePaseAndGetTheTitle() {
        login_page.loadAPage(login_page.url);
        login_page.maximizeScreen();
        Assert.assertEquals(login_page.getCurrentUrl(), login_page.url);
        Assert.assertTrue(login_page.visibilityState(login_page.logo));

    }


}
