package test;


import org.testng.annotations.Test;
import page.ViewPage;

public class ViewTest extends BaseClassTest{

     ViewPage viewPage;//=new ViewPage(getDriver());
    @Test
    public void clickAccessibility(){
        //viewPage=new ViewPage(getDriver());
        viewPage.tapAccessibilityElement();
    }


}
