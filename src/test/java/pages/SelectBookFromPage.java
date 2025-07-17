package pages;

import org.openqa.selenium.By;

public class SelectBookFromPage extends BasePage{
    public String page_3_url = "https://www.rokomari.com/book/author/1/humayun-ahmed?ref=mm_p0&page=3";
    public String authorName = "হুমায়ূন আহমেদ";
    public String bookSectionTitle = "হুমায়ূন আহমেদ এর বই সমূহ";
    public By authorNamePath = By.xpath("(//h4[contains(text(),'হুমায়ূন আহমেদ')])[1]");
    public By bookSectionTitlePath = By.xpath("//h1[contains(text(),'হুমায়ূন আহমেদ এর বই সমূহ')]");
    public By selectedBook = By.xpath("//body/div[@class='browse-page']/div[@class='container-fluid custom-container px-0']/div[@class='d-flex justify-content-start align-items-start']/div[@class='main-browse-content']/section[@class='browse__content']/div[@class='browse__content-books-wrapper']/div[@class='books-wrapper row']/div[@title='নির্বাচিত ভূতের গল্প হুমায়ূন আহমেদ']/div[contains(@class,'book-list-wrapper')]/a[1]");



}
