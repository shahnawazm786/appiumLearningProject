package test;

import org.testng.annotations.Test;
import page.ViewPage;

public class ViewTest extends BaseClassTest{

    ViewPage viewPage=new ViewPage(driver);
    @Test
    public void AccessibilityTest() throws Exception {

        viewPage.tapAccessibilityElement();
    }


}
