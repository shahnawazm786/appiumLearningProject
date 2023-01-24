package test;


import org.testng.annotations.Test;
import page.AcessibilityNodePage;
import page.ViewPage;

public class ViewTest extends BaseClassTest{

     ViewPage viewPage;//=new ViewPage(getDriver());
    AcessibilityNodePage nodePage;
    @Test
    public void clickAccessibility(){
        viewPage=new ViewPage(getDriver());
        viewPage.tapAccessibilityElement();
    }
    public void clickAccessibilityNode(){
        nodePage=new AcessibilityNodePage(getDriver());
        nodePage.clickOnLink();

    }


}
