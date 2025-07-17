package pages;

import org.openqa.selenium.By;

public class BookPage extends BasePage{
    public String url = "https://www.rokomari.com/";
    public String authorSectionTitle = "জনপ্রিয় লেখকগণ";
    public String authorNameTitle = "হুমায়ূন আহমেদ";
    public By bookPagePath = By.xpath("(//span[contains(text(),'বই')])[2]");
    public By authorsTab = By.xpath("//a[contains(text(),'লেখক')]");
    public By authorSection = By.xpath("//h1[contains(text(),'জনপ্রিয় লেখকগণ')]");
    public By previousArrow = By.xpath("//button[normalize-space()='Previous']");
    public By nextArrow = By.xpath("//button[normalize-space()='Next']");
    public By authorName = By.xpath("//div[@class='authorListItem slick-slide slick-active']//a//div//h2[@class='small-sized-text text-center name-text-container'][contains(text(),'হুমায়ূন আহমেদ')]");

}
