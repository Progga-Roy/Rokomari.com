package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import org.testng.internal.thread.ThreadExecutionException;
import pages.CartPage;
import utilities.DriverSetUp;

public class TestCartPage extends DriverSetUp {
    CartPage cart_page = new CartPage();
    @Test
    public void TestCart() throws InterruptedException {
        cart_page.loadAPage(cart_page.url);
        cart_page.moveToElement(cart_page.addToCart);
        cart_page.waitForElement(cart_page.addToCart);
        cart_page.clickOnElement(cart_page.addToCart);
        cart_page.waitForElement(cart_page.addToCart);
        Assert.assertEquals(cart_page.getElementByText(cart_page.addToCart),cart_page.btn);

        cart_page.waitForElement(cart_page.tryToOrder);
        cart_page.clickOnElement(cart_page.tryToOrder);

        cart_page.waitForElement(cart_page.nameField);
        cart_page.clickOnElement(cart_page.nameField);
        cart_page.writeOnElement(cart_page.nameField,"Progga Roy");
        cart_page.clickOnElement(cart_page.alternativePhoneField);
        cart_page.writeOnElement(cart_page.alternativePhoneField,"01830428352");
        cart_page.clickOnElement(cart_page.selectCountry);
        cart_page.moveToElement(cart_page.country);
        cart_page.clickOnElement(cart_page.country);
        cart_page.clickOnElement(cart_page.selectState);
        cart_page.moveToElement(cart_page.city);
        cart_page.clickOnElement(cart_page.city);
        cart_page.clickOnElement(cart_page.selectArea);
        cart_page.moveToElement(cart_page.area);
        cart_page.clickOnElement(cart_page.area);
        cart_page.clickOnElement(cart_page.textArea);
        cart_page.writeOnElement(cart_page.textArea,"Double mooring,Chittagong");
        cart_page.waitForElement(cart_page.paymentMethod);
        cart_page.scrollToElement(cart_page.paymentMethod);
        cart_page.waitForClick(cart_page.cashOnDeliveryRadioBtn);
        Thread.sleep(1000);
        cart_page.clickOnElement(cart_page.cashOnDeliveryRadioBtn);
        cart_page.scrollToElement(cart_page.confirmOrderBtn);
        Assert.assertTrue(cart_page.visibilityState(cart_page.confirmOrderBtn));




    }
}
