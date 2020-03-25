package sample;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.offset.ElementOption;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static java.time.Duration.ofSeconds;
import static io.appium.java_client.touch.TapOptions.tapOptions;

import static io.appium.java_client.touch.offset.ElementOption.element;

public class MobileGestures extends Build {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

		AndroidDriver<AndroidElement> driver=capabilties();
		
		//for all gestures we will basically use TouchAction class
		
		//this for holding something
		 driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Views\"));");
		 driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		WebElement webelement= driver.findElementByAndroidUIAutomator("text(\"Expandable Lists\")");
		 //for "tapping" we have touse TouchAction class. it has lots of in build function for tapping
		 TouchAction tt = new TouchAction(driver);
		 tt.tap(tapOptions().withElement(element(webelement))).perform();
		 //whenever we use TouchAction class, we have to make sure that we use .build() at the end.(Similarto action class in selenium)
		 driver.findElementByAndroidUIAutomator("text(\"1. Custom Adapter\")").click();
		 WebElement people_name=driver.findElementByAndroidUIAutomator("text(\"People Names\")");
		 tt.longPress(longPressOptions().withElement(element(people_name)).withDuration(ofSeconds(2))).release().perform();
		 System.out.println(driver.findElement(By.id("android:id/title")).isDisplayed());
		 driver.findElementByAndroidUIAutomator("text(\"Sample action\")").click();
	}

}
