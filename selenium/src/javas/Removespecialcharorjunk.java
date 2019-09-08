package javas;

public class Removespecialcharorjunk {


public static void main (String args[])
{

	String s = "$$$&&@@ SOURAV $$$$#@" ;
	
	s = s.replaceAll("[^a-zA-Z0-9]", "");//it means i want sml a to z and A to Z and 0 -9 value else remove all
	System.out.println(s);               // and "" means replacing the spcl charctr with space
	

}

}

