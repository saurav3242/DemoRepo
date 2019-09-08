package souravautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementVisibilityTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\\\AUTOMATION\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("dummy site for chckbox");
		driver.findElement(By.id("take id of any button which is not visible")).isDisplayed();
		
		
		
		
		
		
	}

}
