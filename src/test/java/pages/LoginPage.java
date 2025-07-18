package pages;

import org.openqa.selenium.By;

public class LoginPage extends BasePage {

    public String url = "https://www.rokomari.com/book";
    public String profileNameText = "Hello,\n880****352";

    public By logo = By.xpath("//img[@alt='rok main logo']");
    public By loginPath = By.xpath("//a[normalize-space()='Sign In']");
    public By input = By.xpath("//input[@placeholder='Email or phone']");
    public By nextButton = By.xpath("//button[@id='js--btn-next']");
    public By loginBtn = By.xpath("//form[@id='otp-login-form']//button[@type='submit'][normalize-space()='Login']");

    public By profileNamePath = By.xpath("//span[normalize-space()='Hello,880****352']");

}
