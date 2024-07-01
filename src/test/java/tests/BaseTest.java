package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.*;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    WebDriver driver;
    TyposPage typosPage;
    CheckboxPage checkboxPage;
    InputPage inputTest;
    ContextMenuPage contextMenuPage;
    DynamicControlsPage dynamicControlsPage;
    FramesPage framesPage;
    IFramePage iFramePage;
    private final static String BASE_URL_HEROKUAPP = "http://the-internet.herokuapp.com";
    @BeforeMethod
    public void setup() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        // options.addArguments("start-maximized");
        options.addArguments("headless");
        driver = new ChromeDriver(options);

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        contextMenuPage = new ContextMenuPage(driver);
        typosPage = new TyposPage(driver);
        checkboxPage = new CheckboxPage(driver);
        inputTest = new InputPage(driver);
        dynamicControlsPage = new DynamicControlsPage(driver);
        framesPage = new FramesPage(driver);
        iFramePage = new IFramePage(driver);
    }
    @AfterMethod
    public void close() {
        driver.quit();
    }
}
