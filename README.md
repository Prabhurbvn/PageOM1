public class TestScript 
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
	

	@AfterTest
	public void Teardown()
	{
		driver.close();
	}

}
