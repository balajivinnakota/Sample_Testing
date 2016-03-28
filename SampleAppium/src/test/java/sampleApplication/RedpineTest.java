package sampleApplication;

import io.appium.java_client.AppiumDriver;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

public class RedpineTest {
	
	public AppiumDriver driver;
	@Before
	public void setUp() throws MalformedURLException{
		/*File classpathRoot = new File(System.getProperty("user.dir"));
		File appDir = new File(classpathRoot, "/app");
		File app = new File(appDir, "Redpine.apk");
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("browserName", "");
		capabilities.setCapability("deviceName", "4367d49d");
		
		capabilities.setCapability("platformVersion", "5.1");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("app", app.getAbsolutePath());
		capabilities.setCapability("appPackage", "com.redpine.sdk.redpineandroidsdk");
		capabilities.setCapability("appActivity", ".MainActivity");
		capabilities.setCapability("appWaitActivity", ".MainActivity");
		
		driver = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);*/
	}
	
	@Test
	public void testUI() throws InterruptedException{
		
		/*driver.findElement(By.id("username")).sendKeys("Sirimegana");
		driver.findElement(By.id("password")).sendKeys("Winbold@123");
		driver.hideKeyboard();
		driver.findElement(By.id("button")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("text1")).click();*/
	}
}
