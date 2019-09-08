package com.Test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgBasics {
	
	/*      @BeforeSuite===>setup system properly for chrome ----- 1
			@BeforeTest===>launch chrome browser ----------------- 2
			@BeforeClass===>login to app ------------------------- 3
			
			@BeforeMethod===>enter url --------------------------- 4
			@Test1===>GoogleTitleTest
			@AfterMethod===>logout from app
			
			@BeforeMethod===>enter url
			@Test2===>SearchTest
			@AfterMethod===>logout from app
			
			@AFterClass===>Close the Browser ---------------------- 5
			@AfterTest===>Delete Cookies -------------------------- 6                 */
	
@BeforeSuite
public void setup() {
	System.out.println("@BeforeSuite===>setup system properly for chrome");
	
}

@BeforeTest
public void launchBrowser() {
	System.out.println("@BeforeTest===>launch chrome browser");
}

@BeforeClass
public void login() {
	System.out.println("@BeforeClass===>login to app");
}

@BeforeMethod
public void EnterURL() {
	System.out.println("@BeforeMethod===>enter url");
}


@Test
public void googleTitleTest() {
	System.out.println("@Test1===>GoogleTitleTest");
}
@Test
public void searchTest() {
	System.out.println("@Test2===>SearchTest");
}

@AfterMethod
public void logout() {
System.out.println("@AfterMethod===>logout from app");
}

@AfterClass
public void CloseBrowser() {
	System.out.println("@AFterClass===>Close the Browser");
}


@AfterTest
public void deleteAllCookies() {
	System.out.println("@AfterTest===>Delete Cookies");
}


}
