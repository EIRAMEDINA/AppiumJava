/**
 * 
 */
package appiumTest.appium;


import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

/**
 * @author Eira Medina
 * 22/08/2022
 * inicia la app de calculadora
 */
public class Calculator {

	
	public static AppiumDriver<MobileElement> driver;
	
	public static void main(String[] args) {
		
		try {
			openCalculator();
		} catch (Exception e) {
			System.out.println(e.getCause());
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	
	public static void openCalculator() throws Exception {
		
		DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setCapability("deviceName", "SM-A022M");
		cap.setCapability("udid", "R58R91MTQEN");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "10");
		cap.setCapability("appPackage", "com.sec.android.app.popupcalculator");
		cap.setCapability("appActivity", "com.sec.android.app.popupcalculator.Calculator");
		
		URL url = new URL("http://localhost:4723/wd/hub");
		driver = new AppiumDriver<MobileElement>(url,cap);
		
		System.out.println("aplicación iniciada .....");
	}

}
