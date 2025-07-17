package pages;

import org.openqa.selenium.By;

public class CartPage extends BasePage{
    public String url = "https://www.rokomari.com/book/49/nirbachito-voter-golpo";
    public String btn = "Go to Cart ->";
    public By addToCart = By.xpath("//span[@id='js--add-to-cart-button']");
    public By tryToOrder = By.xpath("//span[contains(text(),'অর্ডার করতে এগিয়ে যান')]");

}
