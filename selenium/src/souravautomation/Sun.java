package souravautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sun {

	public static void main (String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\AUTOMATION\\chromedriver_win32\\chromedriver.exe");
		//ChromeDriver driver = new ChromeDriver();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath(".//*[@id='gbw']/div/div/div[1]/div[2]/a")).click();
		Thread.sleep(5000);
		
		driver.close();
		
		
		
		

	}
}


