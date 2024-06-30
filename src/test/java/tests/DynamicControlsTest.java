package tests;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.*;

public class DynamicControlsTest extends BaseTest{
    @Test
    public void findText (){
        dynamicControlsPage.open();
        assertFalse(dynamicControlsPage.checkboxIsNotSelected());
        dynamicControlsPage.itsGoneWait();
        assertEquals(dynamicControlsPage.checkboxNotFind(), 0);
    }
}
