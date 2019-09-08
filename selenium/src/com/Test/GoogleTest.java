package com.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {

	WebDriver driver ;
	
	
	@BeforeMethod             //precondition 
	public  void Setup() {
        System.setProperty("webdriver.chrome.driver", "D:\\AUTOMATION\\chromedriver_win32\\chromedriver.exe");
		
		 driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		
}

	@Test(priority=1,groups="TitleTest")
	public void GoogleTitleTest() {
		
	String title = driver.getTitle();
	System.out.println("printing title of google  ===>"+ title);
	}
	
	@Test(priority=2,groups="LogoTest")
	public void GoogleLogoTest() {
	boolean b = driver.findElement(By.xpath("//*[@id='hplogo']/a/img")).isDisplayed();
	System.out.println(b);
	}
	
	@Test(priority=3,groups="LinkTest")
	public void GoogleGMailLinkTest() {
		boolean c = driver.findElement(By.linkText("Gmail")).isDisplayed();
	System.out.println(c);
	}
	
	@Test(priority=4,groups="Test")
	public void test1() {
		System.out.println("test1");
	}
	
	@Test(priority=5,groups="Test")
	public void test2() {
		System.out.println("test2");
	}
	
	@Test(priority=6,groups="Test")
	public void test3() {
		System.out.println("test3");
	}
	
	

	@AfterMethod                  //post condition
	public void tearDown() {
	System.out.println("closing all window");
		driver.quit();
	}
	
	
}
