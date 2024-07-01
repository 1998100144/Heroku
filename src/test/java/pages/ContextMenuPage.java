package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextMenuPage extends BasePage {

    private final By BORDER = By.xpath("//div[@id='hot-spot']");
    public Alert alert;

    public ContextMenuPage(WebDriver driver) {
        super(driver);
    }
    public void open() {
        driver.get(BASE_URL + "/context_menu");
    }
    public String getText(){
        Actions action = new Actions(driver);
        action.contextClick(driver.findElement(BORDER)).perform();
        alert = driver.switchTo().alert();
        return alert.getText();
    }
    public void closeText(){
        alert.accept();
    }
}
