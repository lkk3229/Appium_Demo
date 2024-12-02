package Demo;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class APKInstall {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		
		//Gather Desired capabilities
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		
		   capabilities.setCapability("deviceName","Emulator_11i"); //for real/virtual device give that name
	        capabilities.setCapability("platformname", "Android"); // check the plateform version of real/virtual device    
	        capabilities.setCapability("automationName","uiautomator2");
	        capabilities.setCapability("app", "C:\\Users\\lavkumar.k\\Desktop\\Appium\\appium2\\sample_apk\\calculator.apk");
	        capabilities.setCapability("platformversion", "13");
	        
	        

	        URL url = URI.create("http://127.0.0.1:4723/").toURL();
	        
	        AndroidDriver driver = new AndroidDriver(url, capabilities);
	       
	        Thread.sleep(5000);
	        System.out.println("Application Started");
	        driver.quit();//CLOSE SESSION
		
	}

}
