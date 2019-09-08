package com.Test;

import org.testng.annotations.Test;

public class TestNgdependsOnMethodsTest {



@Test
public void Logintest() {
	System.out.println("login test");
    //int a =1/0;  //Airthmetic exception
}


@Test(dependsOnMethods="Logintest")
public void HomepageTest() {
	System.out.println("Homepagetest");
}


@Test(dependsOnMethods="Logintest")
public void SearchTest() {
	
	System.out.println("SearchTest");
	
	
}

@Test(dependsOnMethods="Logintest")
public void RegisterTest() {
	System.out.println("Register Test");
}


}
//1.the above dependsOnMthods say that all the below methods of Logintest are depends upon LoginTest methods so if any error will come
//in Logintest method then all others method will not get executed so if the Logintest case will be failed so other test case will be
//skipped and not be considered so TestNg will not execute the others.
//2.Other condition is if Logintest test case is Passed then may be registered page or homepage test can failed because of their incorrect code 
//like ioncorrect xpath or locator etc.