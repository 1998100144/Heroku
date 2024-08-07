package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckboxPage extends BasePage{

    WebDriver driver;

    private final By CHECKBOX_ONE = By.xpath("//*[text()=' checkbox 1']//preceding::input");
    private final By CHECKBOX_TWO = By.xpath("//input[last()]");

    public CheckboxPage(WebDriver driver) {
        super(driver);
    }
    public void open() {
        driver.get(BASE_URL + "/checkboxes");
    }

    public boolean checkboxOneIsSelected() {
        return driver.findElement(CHECKBOX_ONE).isSelected();
    }
    public void clickChekboxeOne() {
        driver.findElement(CHECKBOX_ONE).click();
    }

    public boolean checkboxTwoIsSelected() {
        return driver.findElement(CHECKBOX_TWO).isSelected();
    }
    public void clickCheckboxeTwo() {
        driver.findElement(CHECKBOX_ONE).click();
    }
}
