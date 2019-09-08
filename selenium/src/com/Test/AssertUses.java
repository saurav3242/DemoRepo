package com.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AssertUses {
WebDriver driver;

@BeforeMethod
public void Setup() {
	System.setProperty("webdriver.chrome.driver", "D:\\AUTOMATION\\chromedriver_win32\\chromedriver.exe");
	
	 driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("https://www.google.com/");
}


@Test
public void GoogleTitleTest() {
	String title = driver.getTitle();  //if the below sop stemnt will not give then o/p will cm only as PASS OR FAI,here v r only gettng test case pass and fail so to validate dat it is really crct or not v r validating test case in d form of assertion
	System.out.println(title);        //BUT IF WE WILL GIVE THE BELOW BOTH STATEMNT DEN IT VL PRINT TITLE AND VALIDATE DAT title is correct or not  
	Assert.assertEquals(title, "Google" , "title is not matched"); //it is validating the title dat it is crct or nt in the form assertion
 }                                                               


@Test
public void GoogleLogoTest() {     //if the below statement will not give then o/p will only come as PASS OR FAIL only
	boolean b = driver.findElement(By.xpath("//*[@id='hplogo']")).isDisplayed();
	System.out.println(b); //if v vl nt gv ds den 
	Assert.assertTrue(b);  // it vl internally call true bt vl nt show as output true acrnd to assertion
    
}

@AfterMethod
public void tearDown() {
	driver.quit();
}
}
