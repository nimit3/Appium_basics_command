package sample;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static java.time.Duration.ofSeconds;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import static io.appium.java_client.touch.TapOptions.tapOptions;

public class Swiping extends Build {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver = capabilties();
		 driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Views\"));");
		 driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		 driver.findElementByAndroidUIAutomator("text(\"Date Widgets\")").click();
		 driver.findElementByAndroidUIAutomator("text(\"2. Inline\")").click();
		 driver.findElements(By.className("android.widget.RadialTimePickerView$RadialPickerTouchHelper")).get(2).click();
		//below line of code will also work for selecting minuts in analog clock
		 // driver.findElementsByClassName("android.widget.RadialTimePickerView$RadialPickerTouchHelper").get(9).click();
		 Thread.sleep(500);
		 driver.findElement(By.xpath("//*[@content-desc='50']")).click();
		 
		 
	}

}
