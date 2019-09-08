package souravautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFileUploadPoupup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\AUTOMATION\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://html.com/input-type-file/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
	driver.findElement(By.xpath("//*[@id='fileupload']")).sendKeys("C:\\Users\\GLB-330\\Documents\\FD REPORTS\\Twitter TweetScraper [02-18-2019 13-20-16]-Reports[1550813012].csv");
		
	}
}
                 //the above code will work for Browse,upload,attach any kind of these button