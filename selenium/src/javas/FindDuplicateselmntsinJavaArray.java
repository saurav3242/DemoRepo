package javas;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateselmntsinJavaArray {

	public static void main(String args[]) {

String names[] = {"Java" ,"JavaScript" , "Python" , " PHP" , "C" ,"Ruby" ,"Java"};

//using Hashset:Java Collection:it stores unique values

Set<String> store = new HashSet<String>(); //Hashset giving unique address so we used and storing in set object
                                           //bcs set doesn't allow duplicates
for(String name : names) {  //for each loop

if(store.add(name)==false) { //v r adng strings and checking alrdy strng presnt or nt so if prsnt den 
	                           // will return false and will print dat duplct value
	                          //it vl check every string based on hashcode unique address
	System.out.println("Duplicate Element is " + name);
	
}
}
}
}