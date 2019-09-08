package souravautomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentURL {

public static void main (String[] args) throws  InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\AUTOMATION\\chromedriver_win32\\chromedriver.exe");
		
       WebDriver driver = new ChromeDriver();
            driver.get("https://www.google.com/");
            

      Thread.sleep(2000);
   String url =   driver.getCurrentUrl();
      if(url.contains("https")) {
    	  
    	  System.out.println("site is secure");
      }
      else {
    	  System.out.println("site is not secure");
      }
          driver.close();


}
}