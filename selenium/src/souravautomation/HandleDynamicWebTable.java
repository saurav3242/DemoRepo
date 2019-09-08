package souravautomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleDynamicWebTable {

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
		Thread.sleep(3000);
		//*[@id='vContactsForm']/table/tbody/tr[4]/td[2]/a
		//*[@id='vContactsForm']/table/tbody/tr[5]/td[2]/a 
		//*[@id='vContactsForm']/table/tbody/tr[6]/td[2]/a
		String before_xpath = "//*[@id='vContactsForm']/table/tbody/tr[";
		String after_xpath = "]/td[2]/a";
		
		for(int i=3;i<7;i++) {
		String name = driver.findElement(By.xpath(before_xpath+ i +after_xpath)).getText();
		System.out.println(name);
		if(name.contains("Test Test1")) { //i=6
			
			//*[@id='vContactsForm']/table/tbody/tr[6]/td[1]/input   //{xpath of checkbox}
			driver.findElement(By.xpath("//*[@id='vContactsForm']/table/tbody/tr["+ i +"]/td[1]/input")).click();
		}
		
		
}}}	
		
		
		
