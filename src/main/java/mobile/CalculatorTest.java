package mobile;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.security.DrbgParameters;

public class CalculatorTest {
    public static void main(String[] args) {

    }
    public static void openCalculatorDevice(){
        DesiredCapabilities capabilities=new DesiredCapabilities();
        capabilities.setCapability("deviceName","vivo 1920");
        capabilities.setCapability("udid","26976198");
        capabilities.setCapability("platformName","Android");
        capabilities.setCapability("deviceName","12");

        capabilities.setCapability("appPackage","com.android.bbkcalculator");
        capabilities.setCapability("appActivity","com.android.bbkcalculator.Calculator");
    }
}
