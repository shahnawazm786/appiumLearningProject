package test;

import org.testng.annotations.Test;
import page.ViewPage;

public class ViewTest extends BaseClassTest{

    ViewPage viewPage;
    @Test
    public void AccessibilityTest() throws Exception {
        viewPage=new ViewPage(driver);
        viewPage.tapAccessibilityElement();
    }


}
