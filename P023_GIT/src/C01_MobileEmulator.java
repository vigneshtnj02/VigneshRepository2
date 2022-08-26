import java.util.Optional;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v103.emulation.Emulation;

public class C01_MobileEmulator {

	public static void main(String[] args) throws InterruptedException {
		
		String url;
		
		url = "https://rahulshettyacademy.com/angularAppdemo";
		
		System.setProperty("webdriver.chrome.driver", "/Users/Viki/Documents/10_Learnings/Selenium/Selenium/Drivers/chromedriver");
		
		ChromeDriver driver = new ChromeDriver();
		
		DevTools devTools = driver.getDevTools();
		devTools.createSession();
		
		devTools.send(Emulation.setDeviceMetricsOverride(600, 1000, 50, true, Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty()));
		
		driver.get(url);
		
		driver.findElement(By.cssSelector(".navbar-toggler-icon")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Library")).click();
		
		//Additional lines to learn Git changes
	}

}
