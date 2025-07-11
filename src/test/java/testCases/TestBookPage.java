package testCases;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BookPage;
import pages.HomePage;
import utilities.DriverSetUp;

import java.util.List;

public class TestBookPage extends DriverSetUp {
    HomePage home_page = new HomePage();
    BookPage book_page = new BookPage();

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
        book_page.clickOnElement(book_page.authorsTab);
//        home_page.handleModalIfPresent();
 //Scroll the "জনপ্রিয় লেখকগণ" section
        book_page.waitForElement(book_page.authorSection);
        Assert.assertEquals(book_page.getElementByText(book_page.authorSection), book_page.authorSectionTitle);
        WebElement section = book_page.getElement(book_page.authorSection);
        ((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView({block:'center'})", section);
// Try find the Author : "হুমায়ূন আহমেদ"
        for (int i = 0; i < 10; i++) {
            List<WebElement> authors = getDriver().findElements(book_page.authorName);
            if (!authors.isEmpty()) {
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

    }

}


//
//
//WebElement section = book_page.getElement(book_page.authorSection);
//        ((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView({block:'center'});", section);
//        Thread.sleep(1000);
//
/// / Step 5: Try to find and click author "হুমায়ূন আহমেদ" (within 10 scrolls)
//        for (int i = 0; i < 10; i++) {
//List<WebElement> authors = getDriver().findElements(book_page.authorName); // Dynamic search
//
//            if (!authors.isEmpty()) {
//        authors.get(0).click();
//                System.out.println("Clicked on author: হুমায়ূন আহমেদ");
//                return;
//                        }
//
//                        // Scroll the slider using Next arrow if author not found
//                        book_page.waitForElement(book_page.nextArrow);
//WebElement nextArrowBtn = book_page.getElement(book_page.nextArrow);
//            if (nextArrowBtn.isDisplayed() && nextArrowBtn.isEnabled()) {
//        nextArrowBtn.click();
//                Thread.sleep(1000);
//            } else {
//                    break;
//                    }
//                    }
//
//                    // Step 6: If author is still not found
//                    System.out.println("Author not found: হুমায়ূন আহমেদ");
//
//

