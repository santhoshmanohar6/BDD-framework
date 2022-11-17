package initilizer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class initializer {

	public static WebDriver driver;
	
	public static void openbrowser(String browser)
	{
		 
			
		
		if(browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32 (2)\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
		}
		else if (browser.equals("edge"))
		{
			System.setProperty("webdriver.edge.driver", "D:\\selenium\\edgedriver_win64 (3)\\msedgedriver.exe");
			driver=new EdgeDriver();
			driver.manage().window().maximize();
		}
		}
	
	
	public static void enterurl(String url)
	{
		driver.get(url);
	}
}
