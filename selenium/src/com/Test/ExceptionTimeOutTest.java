package com.Test;

import org.testng.annotations.Test;

public class ExceptionTimeOutTest {

//the below is not recommended to use in project,bad code
//@Test(invocationTimeOut=2,expectedExceptions=NumberFormatException.class) 
//public void infinitelopptest() {
//	int i =1;
//	while(i==1) {
//		System.out.println(i);
//	in the abv prgrm v r using timeout cuz it vl run in infinite lup so gvn time to stop & excptn so 
	//it vl avoid termination and as Failed test case output 
//}
//}
	
@Test(expectedExceptions=NumberFormatException.class)
   
public void test1() {
	String x = "100A";
    Integer.parseInt(x);	//we cannot convert 100A string to int so exception vl come
}}

//here we are expecting numberformatexcptns for avoiding termination of test case or as Failed
//output test case so given the exceptions=numformatexcptn
//Q.hw u vl handle exception in TestNg test case widout using try catch block
//A-we hv to use "expectedException" keyword including the Exception name like AE,AIOE,SIOBE


