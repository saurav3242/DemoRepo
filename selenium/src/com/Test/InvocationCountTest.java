package com.Test;

import org.testng.annotations.Test;

public class InvocationCountTest {


@Test(invocationCount=10)  //for executing 10 times same test case
public void sum() {
	int a = 10;
	int b = 20;
	int c = 30;
	
	c = a+b;
	System.out.println("sum=====> "+c);
}

}
