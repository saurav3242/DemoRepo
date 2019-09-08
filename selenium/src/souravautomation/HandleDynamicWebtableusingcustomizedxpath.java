package souravautomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleDynamicWebtableusingcustomizedxpath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\AUTOMATION\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/login.cfm");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id='loginForm']/input[1]")).sendKeys("saurav3269");
		driver.findElement(By.xpath("//*[@id='loginForm']/input[2]")).sendKeys("SOkr_3820");
		driver.findElement(By.xpath("//input[@type = 'submit']")).click();
		driver.switchTo().frame("mainpanel");
		
		driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
driver.findElement(By.xpath("//a[text()='Test Test1']//parent::td[@class='datalistrow']//preceding-sibling::td[@class='datalistrow']//input[@name='contact_id']")).click();

//later if we want to click on other text like Sourav Kumar then just replace Test Test1 and add Sourav Kumar,no need to include two for loop
//for this program










	}

}
