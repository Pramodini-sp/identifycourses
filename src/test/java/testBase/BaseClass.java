package testBase;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class BaseClass {
	
public static WebDriver driver;
	

	@BeforeTest
	@Parameters({ "os", "browser" })
	public void setup(String os, String br) throws IOException

	{
		
		switch (br.toLowerCase()) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;
		default:
			System.out.println("No matching browser..");
			return;
		}

		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));

		//driver.get(p.getProperty("appURL"));
		driver.get("https://www.coursera.org/");
		driver.manage().window().maximize();
	}
	
	@AfterTest
	public void teardown() throws InterruptedException
	
	{	 
		Thread.sleep(3000);
		driver.quit();
	
	}


}
