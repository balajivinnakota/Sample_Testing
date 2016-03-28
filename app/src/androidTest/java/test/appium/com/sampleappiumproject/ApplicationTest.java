package test.appium.com.sampleappiumproject;

import android.app.Application;
import android.test.ApplicationTestCase;

import org.junit.Before;

import java.io.File;
import java.net.MalformedURLException;

import io.appium.java_client.AppiumDriver;

/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */
public class ApplicationTest extends ApplicationTestCase<Application> {
    public ApplicationTest() {
        super(Application.class);
    }
}