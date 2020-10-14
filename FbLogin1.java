package TestScript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class Script 
{
	WebDriver driver;
	@BeforeTest
	public void Setup()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sairam\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://www.fb.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	@Test
	public void VerifyTitle()
	{
		System.out.println(driver.getTitle()); 
	}
	
	@Test
	public void VerifyUrl()
	{
		System.out.println(driver.getCurrentUrl()); 
	}
	@AfterTest
	public void Teardown()
	{
		driver.close();
	}

}
