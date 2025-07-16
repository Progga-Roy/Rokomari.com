package pages;

import org.openqa.selenium.By;

public class AuthorPage extends BasePage{
    public String url = "https://www.rokomari.com/book/author/1/humayun-ahmed";
    public By categorySection = By.xpath("//p[normalize-space()='By Categories']");
    public By contemporaryNovel = By.xpath("//label[contains(text(),'সমকালীন উপন্যাস')]");
    public By essayCollection = By.xpath("//label[contains(text(),'উপন্যাস সমগ্র')]");
    public By pagination = By.xpath("//div[@class='pagination']");
    public By  nextPage = By.xpath("//a[normalize-space()='3']");

}
