package tests;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertFalse;
import static org.testng.AssertJUnit.assertTrue;

public class CheckboxTest extends BaseTest {

    @Test
    public void checkboxTestOne() {
        checkboxPage.open();
        assertFalse(checkboxPage.checkboxOneIsSelected());

        checkboxPage.clickChekboxeOne();
        assertTrue(checkboxPage.checkboxOneIsSelected());
    }

    @Test
    public void checkboxTestTwo()   {
        checkboxPage.open();
        assertTrue(checkboxPage.checkboxTwoIsSelected());

        checkboxPage.clickCheckboxeTwo();
        assertFalse(checkboxPage.checkboxTwoIsSelected());
    }
}
