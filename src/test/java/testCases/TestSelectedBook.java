package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CartAndSignOutPage;
import pages.SelectBookFromPage;
import utilities.DriverSetUp;

import java.util.ArrayList;

public class TestSelectedBook extends DriverSetUp {
    SelectBookFromPage select_book = new SelectBookFromPage();
    @Test
    public void TestSelectBook() throws InterruptedException {
        //Load the page
        select_book.loadAPage(select_book.page_3_url);
        select_book.handleModalIfPresent();
        //check author name and book section title
        Assert.assertEquals(select_book.getElementByText(select_book.authorNamePath), select_book.authorName);
        Assert.assertEquals(select_book.getElementByText(select_book.bookSectionTitlePath), select_book.bookSectionTitle);
        //Scroll to the selected book
        select_book.scrollToElement(select_book.selectedBook);
        select_book.waitForElement(select_book.selectedBook);
        select_book.waitForClick(select_book.selectedBook);
        Thread.sleep(3000);
        //Click the selected book
        select_book.clickOnElement(select_book.selectedBook);

        //Using for closing the tab
        ArrayList<String> tabs = new ArrayList<>(getDriver().getWindowHandles());
        if (tabs.size() > 1) {
            getDriver().switchTo().window(tabs.get(1));
            getDriver().close();
            getDriver().switchTo().window(tabs.get(0));
        }


    }
}
