package testCases;

import org.testng.annotations.Test;
import pages.AuthorPage;
import utilities.DriverSetUp;

public class TestAuthorPage extends DriverSetUp {
    AuthorPage author_page = new AuthorPage();
    @Test
    public void  TestAuthorAndSelectBook() throws InterruptedException {
        author_page.loadAPage(author_page.url);
        author_page.waitForElement(author_page.categorySection);
        author_page.scrollToElements(author_page.categorySection);
        author_page.waitForElement(author_page.contemporaryNovel);
        author_page.waitForClick(author_page.contemporaryNovel);
        Thread.sleep(3000);
        author_page.clickOnElement(author_page.contemporaryNovel);
//        author_page.waitForElement(author_page.essayCollection);
//        author_page.waitForClick(author_page.essayCollection);
//        author_page.clickOnElement(author_page.essayCollection);
//        author_page.waitForElement(author_page.nextPage);
        author_page.scrollToElements(author_page.nextPage);
        author_page.waitForElement(author_page.nextPage);
        author_page.clickOnElement(author_page.nextPage);
        Thread.sleep(3000);
        System.out.println("click");
    }

}
