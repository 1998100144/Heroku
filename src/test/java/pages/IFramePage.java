package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class IFramePage extends BasePage {

    private final By BUTTON_CLOSE = By.xpath("//div[@aria-label='Close']");
    private final By PARAGRAPH = By.xpath("//iframe[@id='mce_0_ifr']");
    private final By TEXT_IN_PARAGRAPH = By.xpath("//p");

    public IFramePage(WebDriver driver) {
        super(driver);
    }

    public String getTextFromParagraph() {
        driver.findElement(BUTTON_CLOSE).click();
        driver.switchTo().frame(driver.findElement(PARAGRAPH));
        return driver.findElement(TEXT_IN_PARAGRAPH).getText();
    }
}
