package utils;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumDriver {
	
	private static SeleniumDriver seleniumDriver;
	
	//initialize web driver
	private static WebDriver driver;
	
	private static WebDriverWait waitDriver;
	
	public final static int TIMEOUT=30;
	
	public final static int PAGELOADTIMEOUT=50;
	
	private SeleniumDriver() {
		driver=new ChromeDriver();
		// maximize the window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(PAGELOADTIMEOUT));
		waitDriver =new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT));
		
	}
	
	public static void openPage(String url) {
		driver.get(url);
	}
	
	public static WebDriver getDriver() {
		return driver;
	}
	
	public static void setUpDriver() {
		
		if(driver==null) {
			seleniumDriver=new SeleniumDriver();
		}
	}
	
	public static void tearDown() {
		
		if(driver==null) {
			driver.close();
			driver.quit();
		}
		seleniumDriver=null;
	}
}
