package com.cucumber.automation.utils;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.android.AndroidDriver;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.Rule;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;


public class AppiumBase {

    public static WebDriver driver;
    public static WebDriverWait waitVar;

    public void createDriver() throws MalformedURLException, InterruptedException {
        //setting capabilities:
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "testDevice");
        caps.setCapability(CapabilityType.PLATFORM_NAME,"Android");
        caps.setCapability("platformVersion", "6");
        // CHANGE THIS WHEN USING A REAL DEVICE
        //caps.setCapability("avd","Pixel_C_API_25");
        caps.setCapability("autoGrantPermissions", true);
        caps.setCapability("appWaitActivity", "com.carrefour.tablet.*");

        File file = new File("/home/drf/android_tests/AppiumRecipeBook/src/test/resources/apps/example.apk");
        caps.setCapability("app", file.getAbsolutePath());



        //relative path to .app file CHECK THIS¡¡¡
        //final File classpathRoot = new File(System.getProperty("user.dir"));
        //final File appDir = new File(classpathRoot, "src/test/resources/apps/");
        //final File app = new File(appDir,"example.apk");
        //caps.setCapability("app", app.getAbsolutePath());

        // initializing driver object
        //driver = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);

        // initialize waits
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        waitVar = new WebDriverWait(driver, 10);

    }

    public void teardown() {
        //close the app
        driver.quit();
    }
}
