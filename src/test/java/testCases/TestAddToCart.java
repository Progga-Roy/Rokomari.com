package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AddToCartPage;
import utilities.DriverSetUp;

public class TestAddToCart extends DriverSetUp {
    AddToCartPage add_to_cart = new AddToCartPage();
    @Test
    public void TestBookInCart(){
        add_to_cart.loadAPage(add_to_cart.page_3_url);
        Assert.assertEquals(add_to_cart.getElementByText(add_to_cart.authorNamePath),add_to_cart.authorName);
        Assert.assertEquals(add_to_cart.getElementByText(add_to_cart.bookSectionTitlePath),add_to_cart.bookSectionTitle);



    }

}
