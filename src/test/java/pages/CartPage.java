package pages;

import org.openqa.selenium.By;

public class CartPage extends BasePage{
    public String url = "https://www.rokomari.com/book/49/nirbachito-voter-golpo";
    public String btn = "Go to Cart ->";
    public By addToCart = By.xpath("//span[@id='js--add-to-cart-button']");
    public By tryToOrder = By.xpath("//span[contains(text(),'অর্ডার করতে এগিয়ে যান')]");
    public By nameField = By.xpath("//div[@class='shipping-form-container']//input[@id='name']");
    public By alternativePhoneField = By.xpath("//fieldset[@class='group']//input[@id='phone2']");
    public By selectCountry = By.xpath("//select[@id='js--country']");
    public By country = By.xpath("//option[contains(text(),'Bangladesh')]");
    public By selectState = By.xpath("//select[@id='js--city']");
    public By city = By.xpath("//option[contains(text(),'চট্টগ্রাম')]");
    public By selectArea = By.xpath("//select[@id='js--area']");
    public By area = By.xpath("//option[contains(text(),'ডাবল মুরিং')]");
    public By textArea = By.xpath("//fieldset[@class='mb-0']//textarea[@id='address']");
    public By cashOnDeliveryRadioBtn = By.xpath("//label[@for='COD']");
    public By paymentMethod = By.xpath("//h3[normalize-space()='Payment Method']");
    public By confirmOrderBtn = By.xpath("//button[@id='js--confirm-order']");
    public By cartQuantity = By.xpath("//span[@class='js--cart-quantity']");
    public By cartItem = By.xpath("//img[@alt='cart']");
    public By profile = By.xpath("//span[@class='user-name']");
    public By signOutBtn = By.xpath("//a[@href='/logout' and contains(text(),'Sign Out')]");







}
