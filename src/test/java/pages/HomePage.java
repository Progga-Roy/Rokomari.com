package pages;

import org.openqa.selenium.By;

public class HomePage extends BasePage{
    public String url  =  "https://www.rokomari.com/";
    public String profileNameText = "Hello,\n880****352";
    public String welcomeText = "রকমারিতে স্বাগতম!";
    public String bookText = "বই";
    public By modalCloseBtn1 = By.xpath("//button[@class='modal_modalCloseButton__y_s5N']");
    public By modalCloseBtn2 = By.xpath("//button[contains(@class,'popup-modal__close-btn')]");
    public By welcomeTextPath = By.xpath("//p[contains(text(),'রকমারিতে স্বাগতম!')]");
    public By profileNamePath = By.xpath("//span[normalize-space()='Hello,880****352']");
    public By bookPath = By.xpath("(//span[contains(text(),'বই')])[2]");

    //button[@class='popup-modal__close-btn close-btn-outside js--popup-modal__close-btn']
    public void handleModalIfPresent() {
        handleModalIfPresent(modalCloseBtn1, modalCloseBtn2);
    }
}
