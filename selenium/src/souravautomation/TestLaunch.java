package souravautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLaunch {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\AUTOMATION\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("9340025190");
		driver.findElement(By.id("pass")).sendKeys("9431412053");
		driver.findElement(By.id("u_0_2")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id='u_0_c']/a")).click();
		Thread.sleep(3000);
		
		driver.close();
		
		
		
		

	}

}
