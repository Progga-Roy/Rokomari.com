package testCases;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AuthorPage;
import pages.BookPage;
import pages.HomePage;
import utilities.DriverSetUp;

import java.util.List;

public class TestBookPage extends DriverSetUp {
    HomePage home_page = new HomePage();
    BookPage book_page = new BookPage();
    AuthorPage author_page = new AuthorPage();

    @Test
    public void TestSelectAuthor() throws InterruptedException {
//Load the page and handle modal if present
        home_page.loadAPage(home_page.url);
        Thread.sleep(3000);
        home_page.handleModalIfPresent();
//Click on "Books" from homepage
        book_page.clickOnElement(book_page.bookPagePath);
        Thread.sleep(3000);
//Open the "লেখক" (Authors) tab  and click
        book_page.waitForElement(book_page.authorsTab);
        Thread.sleep(3000);
        book_page.clickOnElement(book_page.authorsTab);
//        home_page.handleModalIfPresent();
        //Scroll the "জনপ্রিয় লেখকগণ" section
        book_page.waitForElement(book_page.authorSection);
        Assert.assertEquals(book_page.getElementByText(book_page.authorSection), book_page.authorSectionTitle);

        book_page.scrollToElement(book_page.authorSection);
// Try find the Author : "হুমায়ূন আহমেদ"
        for (int i = 0; i < 10; i++) {
            List<WebElement> authors = book_page.getElementsFromList(book_page.authorName);
            if (!authors.isEmpty()) {
                Thread.sleep(3000);
                authors.get(0).click();
                System.out.println("Click Author : " + book_page.authorNameTitle);
                return;
            }
// If not fount  Author : "হুমায়ূন আহমেদ" in the first phase than  click arrow (next arrow) from the slider.
            WebElement nextArrowBtn = book_page.getElement(book_page.nextArrow);
            if (nextArrowBtn.isDisplayed() && nextArrowBtn.isEnabled()) {
                nextArrowBtn.click();
            } else {
                break;
            }


        }
        System.out.println(" Author not found! ");

    }
}

