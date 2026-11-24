package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.*;

public class Hooks {

	public static WebDriver driver;
	@Before
	
	public void BrowserLaunch()
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
		 driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		
	}
	@After
	public void BrowserClose()
	{
		if(driver!=null)
		{
			driver.quit();
		}
	}
}
