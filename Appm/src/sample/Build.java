package sample;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Build {
	
	public static AndroidDriver<AndroidElement> capabilties() throws MalformedURLException {
		//File f = new File("src");
		//File fs = new File(f, "ApiDemos-debug.apk");
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "nimdex");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");
        cap.setCapability(MobileCapabilityType.APP, "C:\\Users\\chavd\\Desktop\\java-workspace\\Appm\\ApiDemos-debug.apk");
        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        //AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
        AndroidDriver<AndroidElement> driver = new AndroidDriver<>(url,cap);
        return driver;
        
	}

}
