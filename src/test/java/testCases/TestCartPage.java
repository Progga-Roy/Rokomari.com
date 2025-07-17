package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import pages.CartPage;
import utilities.DriverSetUp;

public class TestCartPage extends DriverSetUp {
    CartPage cart_page = new CartPage();
    @Test
    public void TestCart() throws InterruptedException {
        cart_page.loadAPage(cart_page.url);
        Thread.sleep(3000);
        cart_page.moveToElement(cart_page.addToCart);
        cart_page.waitForElement(cart_page.addToCart);
        cart_page.clickOnElement(cart_page.addToCart);
        Assert.assertEquals(cart_page.getElementByText(cart_page.addToCart),cart_page.btn);
        Thread.sleep(2000);

    }
}
