package tests;

import org.testng.annotations.Test;
import static org.testng.AssertJUnit.assertEquals;

public class FramesTest extends BaseTest {


    @Test
    public void comparisonTextParagraphTest() {
        framesPage.open();
        framesPage.clickIFramesButton();
        assertEquals(iFramePage.getTextFromParagraph(), "Your content goes here.");
    }
}