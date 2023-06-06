import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class product {

	
	public class productsearch {
		
		WebDriver driver;
		
		@BeforeMethod
		public void setup() {
			
			 driver = new ChromeDriver();
			String browsername = "chrome";
			
			if(browsername.equals("chrome")) {
				driver = new ChromeDriver();
			}
			
			else if(browsername.equals("edge")) {
				driver = new EdgeDriver();
			}
			
			else if(browsername.equals("firefox")) {
				driver = new FirefoxDriver();
			}

		}
		
	@AfterMethod
		public void tearDown() {
			
			//driver.quit();
		}
		
		
		@Test
		public void verifysearchfunctionalityandreturnrelevantsearchbykeywords() throws InterruptedException {
		driver.get("https://www.mandmdirect.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("onetrust-accept-btn-handler")).click();
		WebElement search = driver.findElement(By.xpath("//*[@id=\"mainSearchText\"]"));
		Thread.sleep(2000);
		search.clear();
		search.sendKeys("bag");
		Thread.sleep(2000);	
		
		}
}
