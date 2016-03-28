package com.example;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import java.util.concurrent.TimeUnit;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class AppiumTest {

    public AppiumDriver driver;
    @Before
    public void setUp() throws MalformedURLException {
        /*File classpathRoot = new File(System.getProperty("user.dir"));
        System.out.println("Classpath root:"+classpathRoot);
        File appDir = new File("/data/local/tmp/test.appium.com.sampleappiumproject.test");
        File app = new File(appDir, "app-debug.apk");*/
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("browserName", "");
        capabilities.setCapability("deviceName", "4367d49d");

        capabilities.setCapability("platformVersion", "5.1");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("appPackage", "test.appium.com.sampleappiumproject");
        capabilities.setCapability("appActivity", ".MainActivity");
        capabilities.setCapability("appWaitActivity", ".MainActivity");

        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }

    @Test
    public void testUI() throws InterruptedException{

        driver.findElement(By.id("username")).sendKeys("username");
        driver.findElement(By.id("password")).sendKeys("password");
        driver.findElement(By.id("submit")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("gettoastmessage")).click();
        Thread.sleep(4000);
        driver.findElement(By.id("logout")).click();
    }
}
