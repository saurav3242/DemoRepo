package souravautomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBootstrapDropDown {

	public static void main(String[] args) throws InterruptedException {

		
System.setProperty("webdriver.chrome.driver", "D:\\AUTOMATION\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//button[contains(@class,'multiselect') and @type= 'button']")).click();
		/*List<WebElement> list = driver.findElements(By.xpath("//ul[contains(@class,'multiselect-container')]//li//a//label"));
		System.out.println(list.size());
		for(int i=0;i<=list.size();i++) {
			System.out.println(list.get(i).getText());
			if(list.get(i).getText().contains("Angular")) {
				list.get(i).click();
				//break;
				driver.close();*/      //for clikicng specific checkboxex 
		
				List<WebElement> list = driver.findElements(By.xpath("//ul[contains(@class,'multiselect-container')]//li//a//label"));
				System.out.println(list.size());
				for(int i=0;i<=list.size();i++) {
					System.out.println(list.get(i).getText());
					
						list.get(i).click();       
						//For clicking all checkboxex
			}
		}
		
		
	
	}


