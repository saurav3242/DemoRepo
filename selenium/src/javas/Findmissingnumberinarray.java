package javas;

public class Findmissingnumberinarray {

	public static void main(String args[]) {
		
		int a[] = {1,2,4,5};  //length is 4 and index value will be 0 to 3== 0,1,2,3
		
		int sum1 = 0;
		for(int i=0;i<a.length;i++) {
			sum1 = sum1+a[i];//12
		}
		
		System.out.println(sum1);//12
	
		int sum2=0;
		for(int j=1;j<=5;j++) {
		 sum2 = sum2+j;//15
		}
	System.out.println(sum1);//15
	
	System.out.println("missing number is::" + (sum1-sum2));
	}
	
	
	
}
