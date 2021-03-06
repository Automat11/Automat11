package src.test.java;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBaseR {

	protected WebDriver driver;
	
	public WebDriver getDriver() {
		return driver;
	}
	
	
	// warunki początkowe
	@BeforeMethod
	public void invokeBrowser() {
		
		System.setProperty("webdrive r.chrome.driver", "C:\\WebDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		driver.get("https://github.com/");
	}
	

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
}
