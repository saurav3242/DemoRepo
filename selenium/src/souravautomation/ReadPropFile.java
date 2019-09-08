package souravautomation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadPropFile {

	 static WebDriver driver;
	public static void main(String[] args) throws IOException, InterruptedException {
		
		Properties prop = new Properties();
		FileInputStream ip = new FileInputStream("D:\\selenium\\src\\souravautomation\\config.properties");
		
		prop.load(ip);
		
		System.out.println(prop.getProperty("name"));
		System.out.println(prop.getProperty("age"));

		String url = prop.getProperty("URL");
		System.out.println(url);
		
		String Browsername = prop.getProperty("browser");
		 
	
		if(Browsername.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\AUTOMATION\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		}
	else if(Browsername.equals("FF")) {
		System.setProperty("webdriver.chrome.driver", "D:\\AUTOMATION\\chromedriver_win32\\chromedriver.exe");//set the path of ff,it is just for exmple
		
		}
		
	driver.get(url);	
	//driver.get(prop.getProperty("URL"));
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath(prop.getProperty("Email_xpath"))).sendKeys(prop.getProperty("Email"));
	driver.findElement(By.xpath(prop.getProperty("Password_xpath"))).sendKeys("password");

}
}
