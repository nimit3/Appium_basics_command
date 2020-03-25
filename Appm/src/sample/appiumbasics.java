package sample;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class appiumbasics extends Build {
	
	public static void main(String[] args) throws MalformedURLException {
		
		AndroidDriver<AndroidElement> driver=capabilties();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		//hot locators in the appium xpath, id, class, androiduiautomator
		// in appium class name(android.widget.TextView) in uiautomatorview can be considered as a tag name
		
		//first test using xpath in apidemos app
		driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
		/*old selenium sytax also works here
		driver.findElement(By.xpath("//android.widget.TextView[@text='Preference']")).click();
		*/
		driver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();
		driver.findElement(By.id("android:id/checkbox")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='WiFi settings']")).click();
		driver.findElement(By.className("android.widget.EditText")).sendKeys("nimit");
		driver.findElement(By.xpath("//android.widget.Button[@text='OK']")).click();
		
		//new concepts
		//we can even select second element by below skills too if there are no more unique locators
		//driver.findElements(By.xpath("ff")).get(2).click();
		
		/*
		 if option is not visible in the scree and if for seeing that option if you have to scrool the window 
		 then without scrolling if you write a code it will fail and throw nosuchelement exception
		 */
		
	}
	

}
