package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import pages.AuthorPage;
import utilities.DriverSetUp;

public class TestAuthorPage extends DriverSetUp {
    AuthorPage author_page = new AuthorPage();
    @Test
    public void  TestAuthorAndSelectBook() {
        //Load the author page
        author_page.loadAPage(author_page.url);
        //Scroll down to the category section
        author_page.waitForElement(author_page.categorySection);
        author_page.scrollToElements(author_page.categorySection);
        // Select "সমকালীন উপন্যাস"
        author_page.waitForElement(author_page.contemporaryNovel);
        author_page.waitForClick(author_page.contemporaryNovel);
        Assert.assertTrue(author_page.visibilityState(author_page.contemporaryNovel));
        author_page.clickOnElement(author_page.contemporaryNovel);
        //Scroll down to the category section
        author_page.waitForElement(author_page.categorySection);
        author_page.scrollToElements(author_page.categorySection);
        // Select "রচনা সংকলন ও সমগ্র"
        author_page.waitForElement(author_page.essayCollection);
        author_page.waitForClick(author_page.essayCollection);
        Assert.assertTrue(author_page.visibilityState(author_page.essayCollection));
        author_page.clickOnElement(author_page.essayCollection);

        //Scroll down to the pagination
        author_page.scrollToElements(author_page.pagination);
        //Click the next page
        author_page.waitForElement(author_page.nextPage);
        author_page.waitForClick(author_page.nextPage);
        author_page.clickOnElement(author_page.nextPage);

    }

}
