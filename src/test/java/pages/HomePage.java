package pages;

import org.openqa.selenium.By;

public class HomePage extends BasePage{
    public String url  =  "https://www.rokomari.com/";
    public String profileNameText = "Hello,\n880****352";
    public String welcomeText = "রকমারিতে স্বাগতম!";
    public String bookText = "বই";
    public By welcomeTextPath = By.xpath("//p[contains(text(),'রকমারিতে স্বাগতম!')]");
    public By profileNamePath = By.xpath("//span[normalize-space()='Hello,880****352']");
    public By bookPath = By.xpath("//span[contains(text(),'বই')]");

}
