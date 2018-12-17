package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;

public class TestBase {

	
	public static WebDriver driver ;
	
	@BeforeSuite
	
	public void PreSetup ()
	
	{
		
		System.setProperty("webdriver.chrome.driver", "E:\\Download\\Chrome\\chromedriver_win32\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		
	}
	
	@AfterSuite
	
	public void TearDown()
	
	{
		
		driver.quit();
	}
	
}
