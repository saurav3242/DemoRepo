package code;
import java.util.*;
public class ListIterator {

	
	
	public static void main(String[] args) {
		
		LinkedList l = new LinkedList();
		l.add("laxman");
		l.add("sita");
		l.add("Ram");
		l.add("sonu");
		
		System.out.println(l);
		
		ListIterator ltr = l.iterator();
		while(ltr.hasNext()) {
        String s = (String)ltr.next();
        if(s.equals("sita")) {
        	 ltr.remove();
        }
        	System.out.println(s);
        }
		
		}
		
       
    }	
		
//}
