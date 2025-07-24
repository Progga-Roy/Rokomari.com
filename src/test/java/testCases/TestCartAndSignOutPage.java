package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CartAndSignOutPage;
import utilities.DriverSetUp;

public class TestCartAndSignOutPage extends DriverSetUp {
    CartAndSignOutPage cart_page = new CartAndSignOutPage();
    @Test
    public void TestCartAndSignOut() throws InterruptedException {
        //Load the page
        cart_page.loadAPage(cart_page.url);
        getDriver().navigate().refresh();
        Thread.sleep(3000);
        //Move to the addToCart
        cart_page.moveToElement(cart_page.addToCart);
        //Click addToCart button
        cart_page.waitForElement(cart_page.addToCart);
        cart_page.moveToElement(cart_page.addToCart);
        cart_page.waitForClick(cart_page.addToCart);
        cart_page.clickOnElement(cart_page.addToCart);
        Assert.assertEquals(cart_page.getElementByText(cart_page.addToCart),cart_page.btn);
        //Click "অর্ডার করতে এগিয়ে যান" button
        cart_page.waitForElement(cart_page.tryToOrder);
        cart_page.clickOnElement(cart_page.tryToOrder);
        //Click and filled the name
        cart_page.waitForElement(cart_page.nameField);
        cart_page.clickOnElement(cart_page.nameField);
        cart_page.writeOnElement(cart_page.nameField,"Progga Roy");
        //Click and filled the number
        cart_page.clickOnElement(cart_page.alternativePhoneField);
        cart_page.writeOnElement(cart_page.alternativePhoneField,"01830428352");
        //Select country
        cart_page.clickOnElement(cart_page.selectCountry);
        cart_page.moveToElement(cart_page.country);
        cart_page.clickOnElement(cart_page.country);
        //Select city
        cart_page.clickOnElement(cart_page.selectState);
        cart_page.moveToElement(cart_page.city);
        cart_page.clickOnElement(cart_page.city);
        //Select area
        cart_page.clickOnElement(cart_page.selectArea);
        Thread.sleep(1000);
        cart_page.moveToElement(cart_page.area);
        cart_page.clickOnElement(cart_page.area);
        //Write address on text area
        cart_page.clickOnElement(cart_page.textArea);
        cart_page.writeOnElement(cart_page.textArea,"Double mooring,Chittagong");
        //Scroll down to the payment method and select method
        cart_page.waitForElement(cart_page.paymentMethod);
        cart_page.scrollToElement(cart_page.paymentMethod);
        cart_page.waitForElement(cart_page.cashOnDeliveryRadioBtn);
        cart_page.waitForClick(cart_page.cashOnDeliveryRadioBtn);
        Thread.sleep(1000);
        cart_page.clickOnElement(cart_page.cashOnDeliveryRadioBtn);
        //Check the visibility of Conform order button
        cart_page.scrollToElement(cart_page.confirmOrderBtn);
        Assert.assertTrue(cart_page.visibilityState(cart_page.confirmOrderBtn));
        //Navigate the back page
        cart_page.backword();
        //Check visibility of cart quantity and item
        Assert.assertTrue(cart_page.visibilityState(cart_page.cartQuantity));
        Assert.assertTrue(cart_page.visibilityState(cart_page.cartItem));
        //Click profile than Sign Out
        cart_page.clickOnElement(cart_page.profile);
        cart_page.scrollToElement(cart_page.signOutBtn);
        cart_page.clickOnElement(cart_page.signOutBtn);



    }
}
