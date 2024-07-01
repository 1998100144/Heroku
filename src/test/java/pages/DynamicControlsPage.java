package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class DynamicControlsPage extends BasePage {
    public DynamicControlsPage(WebDriver driver) {
        super(driver);
    }
    public void open() {
        driver.get(BASE_URL + "/dynamic_controls");
    }
    private final By BUTTON_REMOVE = By.xpath("//button[text()='Remove']");
    private final By CHECKBOX = By.xpath("//input[@type='checkbox']");
    private final By ITS_GONE = By.xpath("//p[@id='message']");

    public void itsGoneWait(){
        driver.findElement(BUTTON_REMOVE).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(ITS_GONE));
    }
    public boolean checkboxIsSelected() {
        return driver.findElement(CHECKBOX).isSelected();
    }
    public int checkboxNotFind() {
        List<WebElement> checkboxFind = driver.findElements(CHECKBOX);
        return checkboxFind.size();
    }
}
