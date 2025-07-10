package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BookPage;
import pages.HomePage;
import utilities.DriverSetUp;

public class TestBookPage extends DriverSetUp {
    HomePage home_page = new HomePage();
    BookPage book_page = new BookPage();
    @Test
    public void TestSelectAuthor() throws InterruptedException {
        home_page.loadAPage(home_page.url);
        Thread.sleep(3000);
        home_page.handleModalIfPresent();
        book_page.clickOnElement(book_page.bookPagePath);
//      book_page.loadAPage(book_page.url);
        Thread.sleep(3000);
        book_page.waitForElement(book_page.authorsTab);
        book_page.clickOnElement(book_page.authorsTab);
//        home_page.handleModalIfPresent();
        book_page.waitForElement(book_page.authorSection);
        Assert.assertEquals(book_page.getElementByText(book_page.authorSection),book_page.authorSectionTitle);
        System.out.println(book_page.authorSectionTitle);

//     book_page.waitForElement(book_page.authorName);
//        home_page.handleModalIfPresent();
//        // find author name ("হুমায়ূন আহমেদ")
//        book_page.scrollElement(book_page.authorName);
//       book_page.waitForElement(book_page.authorName);
//       book_page.clickOnElement(book_page.authorName);
//       book_page.writeOnElement(book_page.inputBox,"হুমায়ূন আহমেদ");
//       book_page.waitForElement(book_page.textLabel);
//       book_page.clickOnElement(book_page.textLabel);
//        Thread.sleep(3000);
//       home_page.scrollElement(book_page.bookPagePath);
//        Thread.sleep(3000);
//       book_page.waitForElement(book_page.bookNamePath);
//       book_page.clickOnElement(book_page.bookPagePath);



    }

}
