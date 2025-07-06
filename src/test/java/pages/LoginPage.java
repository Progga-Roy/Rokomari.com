package pages;

import org.openqa.selenium.By;

public class LoginPage extends BasePage {

    public String url = "https://www.rokomari.com/book";
    public By logo = By.xpath("//img[@alt='rok main logo']");
    public By loginPath = By.xpath("//a[normalize-space()='Sign In']");
}
