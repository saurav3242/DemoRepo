package souravautomation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopupHandle {


	public static void main (String[] args) throws  InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\AUTOMATION\\chromedriver_win32\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.name("proceed")).click();;
		Thread.sleep(5000);
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		
		String text = alert.getText();
		
		if(text.equals("Please enter a valid user name")) {  //without these code also---- from this line 
		
		System.out.println("correct alert message");         //we can
		}
		else {                                               //run this 
			System.out.println("incorrect alert message");   // sript
		}                                                    // ---------- upto this line    
		
		alert.accept();// click on ok button
		
		//alert.dismiss(); // click on cancel button
		
		driver.close();
	}
}
