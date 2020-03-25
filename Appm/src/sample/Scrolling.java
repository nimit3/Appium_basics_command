package sample;

import java.net.MalformedURLException;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Scrolling extends Build {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

		AndroidDriver<AndroidElement> driver=capabilties();
		/*
		 for scrolling we don't have any library in appium. for that we have to use
		 android development library directly. just as androiduiautomator
		 syntax = new UiScrollable(new UiSelector()).scrollIntoView(text(\"the element which you want find. it's text property will be written here\"));
		 */
		 driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Views\"));");
		 driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
	}

}
