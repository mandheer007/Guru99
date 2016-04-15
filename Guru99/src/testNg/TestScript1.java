package testNg;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
public class TestScript1 {

	private static WebDriver driver;
	private static String baseUrl;
	
	@BeforeClass
	public void setUp() throws Exception
	{
		driver = new FirefoxDriver();
	    baseUrl = "http://www.demo.guru99.com/V4/";
	}

	public boolean isAlertPresent() throws Exception
	{
		try 
		{
			 Alert alert =  driver.switchTo().alert();
			 //alert.accept();
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	@Test
	public void execute() throws Exception
	{
		// launch Firefox and direct it to the Base URL
		driver.get(baseUrl);

	    // Enter username
	    driver.findElement(By.name("uid")).sendKeys("mngr26059");

	    // Enter Password
	    driver.findElement(By.name("password")).sendKeys("EzatygA");

	    // Click Login
	    driver.findElement(By.name("btnLogin")).click();
	    

	    if (isAlertPresent()) 
	    {
	        driver.switchTo().alert();
	        driver.switchTo().alert().accept();
	        driver.switchTo().defaultContent();
	    }
	}
	
	@AfterClass
	public void tearDown() throws Exception
	{
		//driver.quit();
	}
}
