package souravautomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mousemovement {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\AUTOMATION\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		
		//dynamic wait because means if page or elemnt will be loaded in 2 seconds only 
		//then the rest 38 second will be ignored but in Thread.sleep all script will be cmpltely paused for specifc time 
		//given by us
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		Actions action = new Actions(driver);
		//driver.switchTo().frame(0);
		//action.moveToElement(driver.findElement(By.linkText("Add-Ons"))).build().perform();
		
		action.moveToElement(driver.findElement(By.id("highlight-addons"))).build().perform();
		//driver.findElement(By.linkText("SpiceMax ")).click();
		driver.findElement(By.xpath("//*[@id='header-addons']/ul/li[2]/a ")).click();
		
		
		
		
		
		
		
		
		
		
	}

}
