package sample;

import java.net.MalformedURLException;
import java.util.List;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class UIautomatortest extends Build {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver=capabilties();
		
		//AndroidUIAutomator syntax = ("attribute(value)")
		//driver.findElementByAndroidUIAutomator("attribute(\"value\")");
        driver.findElementByAndroidUIAutomator("text(\"Graphics\")").click();
       /*
        in below code is kind of similar to get multiple elements attribute, size like
        we used to do in selenium with classname, tagname etc
        but here we tried to do with anroiduiautomators. that's it
        --in selenium we used to get "webelemnt", but here we will get "androidelement"
        otherwise everyhting is similar 
        */
       int a= driver.findElementsByAndroidUIAutomator("new UiSelector().clickable(true)").size();
       //this newUiSelector(). is i guess essential here. we have to cram that. new infor just came by
       // that that new UiSelector is  actually library from android development.appium doesnt have any of that feature
       System.out.println(a);
       List<AndroidElement> dd=driver.findElementsByAndroidUIAutomator("clickable(true)");
       for (AndroidElement androidElement : dd) {
		System.out.println(androidElement.getText());
	}
	}

}
