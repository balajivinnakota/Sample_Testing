package sampleApplication;

import io.appium.java_client.AppiumDriver;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;


public class SampleAppiumTest {
	
	public AppiumDriver driver;
	@Before
	public void setUp() throws MalformedURLException{
		File classpathRoot = new File(System.getProperty("user.dir"));
		File appDir = new File(classpathRoot, "../../App/build/outputs/apk/App-greenhouseandroid-debug.apk");
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		
		capabilities.setCapability("browserName", "");
		capabilities.setCapability("deviceName", "Android Emulator");
		
		capabilities.setCapability("platformVersion", "5.1");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("app", appDir);
		
		driver = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}
	
	@Test
	public void testUI() throws InterruptedException{
		
		driver.findElement(By.id("username")).sendKeys("username");
		driver.findElement(By.id("password")).sendKeys("password");
		driver.hideKeyboard();
		driver.findElement(By.id("submit")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("gettoastmessage")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("logout")).click();
	}
	
	@After
    public void tearDown() throws Exception {
        driver.quit();
    }
}
