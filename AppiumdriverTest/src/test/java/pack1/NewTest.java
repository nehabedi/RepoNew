package pack1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import io.appium.java_client.android.AndroidDriver;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.TestListenerAdapter;
public class NewTest {
  AndroidDriver driver;
  @Test
  public void mainTest() throws MalformedURLException {
	  	File classpathRoot = new File(System.getProperty("user.dir"));
		File appDir = new File(classpathRoot, "/App/");
		File app = new File(appDir, "AmazonIndiaShopping_v6.4.0.300.apk");
	
		DesiredCapabilities capabilities = new DesiredCapabilities();
		//capabilities.setCapability(CapabilityType.BROWSER_NAME, ""); 
		capabilities.setCapability("deviceName", "Test_Device");
		capabilities.setCapability("platformVersion", "6.0");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("app", app.getAbsolutePath());
		capabilities.setCapability("appPackage", "in.amazon.mShop.android.shopping");
		capabilities.setCapability("appActivity", "com.amazon.mShop.home.HomeActivity");
		capabilities.setCapability("avdLaunchTimeout", "120000000");
		capabilities.setCapability("avdReadyTimeout", "120000000");
		//capabilities.setCapability("androidDeviceReadyTimeout", "200");
		
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.MINUTES);
	//	Thread.sleep(10000);
		driver.quit();
  }
  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

}
