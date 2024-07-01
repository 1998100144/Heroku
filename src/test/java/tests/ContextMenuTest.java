package tests;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class ContextMenuTest extends BaseTest {
    @Test
    public void textAlertValid() {
        contextMenuPage.open();
        assertEquals(contextMenuPage.getText(), "You selected a context menu");
        contextMenuPage.closeText();
    }
}
