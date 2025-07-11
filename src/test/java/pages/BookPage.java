package pages;

import org.openqa.selenium.By;

public class BookPage extends BasePage{
    public String url = "https://www.rokomari.com/";
    public String authorSectionTitle = "জনপ্রিয় লেখকগণ";
    public String authorNameTitle = "হুমায়ূন আহমেদ";
    //    public String url = "https://www.rokomari.com/book?ref=nm";
    public By bookPagePath = By.xpath("(//span[contains(text(),'বই')])[2]");
    //    public By authors = By.xpath("(//h3[normalize-space()='Authors']");
//    public By authors = By.xpath("//body/div[@id='ts--desktop-book-home']/div[@class='desktopBookHomePage_searchBody__tqehg']/div[@class='w-/div[@id='ts--desktop-filter-&-sort-container']/div[@class='DFiltrs_filtersContainer__HJHK6']/div[2]/div[1]");
//    public By authors = By.xpath("(//h3[normalize-space()='Authors'])[1]");
//    public By publisher = By.xpath("(//h3[normalize-space()='Publishers'])[1]");
//    public By inputBox = By.xpath("(//input[@id='filtersSearchInput'])[1]");
    public By textLabel = By.xpath("//label[contains(text(),'হুমায়ূন আহমেদ')]");
    public By bookNamePath = By.xpath("(//h1[contains(text(),'মিসির আলির গল্পমালা')]");
//    public By author = By.xpath("//a[@id='js--authors']");
//    public By author = By.xpath("(//a[@id='js--authors'])[1]");
public By authorsTab = By.xpath("//a[contains(text(),'লেখক')]");
public By authorSection = By.xpath("//h1[contains(text(),'জনপ্রিয় লেখকগণ')]");
public By previousArrow = By.xpath("//button[normalize-space()='Previous']");
public By nextArrow = By.xpath("//button[normalize-space()='Next']");

    public By authorName = By.xpath("//div[@class='authorListItem slick-slide slick-active']//a//div//h2[@class='small-sized-text text-center name-text-container'][contains(text(),'হুমায়ূন আহমেদ')]");
    //button[@class='modal_modalCloseButton__y_s5N']//*[name()='svg']//*[name()='path' and contains(@fill-rule,'evenodd')]
//    (//*[name()='path'][@fill-rule='evenodd'])[18])

}
