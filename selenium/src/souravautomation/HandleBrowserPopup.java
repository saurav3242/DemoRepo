package souravautomation;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBrowserPopup {

	public static void main(String[] args) throws InterruptedException {

		
System.setProperty("webdriver.chrome.driver", "D:\\AUTOMATION\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.popuptest.com/goodpopups.html");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("html/body/table[2]/tbody/tr/td/font/b/a[1]")).click();
		//driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Set<String> handler = driver.getWindowHandles();//In set object(handler),two windows id are stored/available
		Iterator<String> it = handler.iterator(); //so iterating the values of windows from set object 
		
		String parentWindowid = it.next();
		System.out.println("parentWindowid "+parentWindowid );
		String childWindowid = it.next();
		System.out.println("childWindowid" +childWindowid);
		
		driver.switchTo().window(childWindowid);
		Thread.sleep(2000);
		System.out.println("childWindowPopupTitle"+driver.getTitle());
		
		
		driver.close();
		driver.switchTo().window(parentWindowid);
		Thread.sleep(2000);
		System.out.println("parentwindowid"+driver.getTitle());
		driver.close();
}
}
