package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FramesPage extends BasePage{
    public FramesPage(WebDriver driver) {
        super(driver);
    }
    public void open() {
        driver.get(BASE_URL + "/frames");
    }
    private final By BUTTON_IFRAMES = By.xpath("//a[text()='iFrame']");

    public void clickIFramesButton() {
        driver.findElement(BUTTON_IFRAMES).click();
    }

}
