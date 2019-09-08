package souravautomation;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleDynamicGoogleSearch {

	public static void main(String[] args) {
	
		
		
System.setProperty("webdriver.chrome.driver", "D:\\AUTOMATION\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@type= 'text']")).sendKeys("Testing");
		List<WebElement> list = driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class ='sbl1']"));
		System.out.println("total num of search results "+ list.size());

		for(int i=0;i<=list.size();i++) {
			
			System.out.println(list.get(i).getText());
			if(list.get(i).getText().contains("testing tools")) {
			list.get(i).click();
			break;
				
			}
			
			
		}
		
		
		
		
		
		
	}

}
