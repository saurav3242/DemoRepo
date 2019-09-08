package javas;

public class SmallestAndLargestNumber {

	public static void main(String[] args) {
		
		
		int numbers[] = {-10,24,50,-88,6543};
		
		int largest= numbers[0]; //assigning largest num at 0th index
		int smallest = numbers[0]; //assigning smallest num at 0th index
		
		for(int i=1;i<numbers.length;i++) {
			if(numbers[i]>largest) {           //24>-10  //50>24 //-88>50(false) so it vl go to else condtn
				largest = numbers[i];//6543    //24  //50
			}
			else if(numbers[i]<smallest) {
				smallest = numbers[i];//-88
			}
		}
		System.out.println("Largestnumber is "+ largest); //6543
		System.out.println("Smallestnumber is "+ smallest); //-88
}

}
