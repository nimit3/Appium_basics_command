package sample;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static java.time.Duration.ofSeconds;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;


public class Drag_Drop extends Build {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver = capabilties();
		 driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Views\"));");
		 driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		 driver.findElementByAndroidUIAutomator("text(\"Drag and Drop\")").click();
		 WebElement source= driver.findElements(By.className("android.view.View")).get(0);
		 WebElement target=driver.findElements(By.className("android.view.View")).get(1);
		 TouchAction tt = new TouchAction(driver);
		 //firstvlongpress then source element then  target location(moveto) and then release 
         tt.longPress(longPressOptions().withElement(element(source))).moveTo(element(target)).release().perform();
	}

}
