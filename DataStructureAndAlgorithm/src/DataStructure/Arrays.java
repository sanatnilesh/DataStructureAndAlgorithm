package DataStructure;

import Algorithm.BinarySearch;
import Algorithm.LinearSearch;

public class Arrays {

	public static void main(String[] args) {
		// Create an array in different ways (Dynamic vs Static Array)
		
		// where 10 is the size of the array we are explicitly defining size of the array.
		int array [] = new int[10];
		
		// it's value is initialize during the creation.
		int valueArray [] = {1,2,3,4,5};
		
		//traversing & printing of array
		for (int i = 0; i < valueArray.length; i++) {
			System.out.println(valueArray[i]);
		}
		
		//assigning value to the empty array
		for (int i = 0; i < array.length; i++) {	
			array[i] = i;
		}
		
		System.out.println("################Linear Search################");
		//Linear search of the element 3 in valueArray
		String index = LinearSearch.linearSearch(valueArray, 3);
		if (index == null) {
			System.out.println("Given Element not found in the array");
		}else {
			System.out.println("Element found at the position: "+ index);
		}
		
		System.out.println("################Binary Search################");
		//Binary search of the element 3 in valueArray
		String postion = BinarySearch.binarySearch(valueArray, 5);
		if (index == null) {
			System.out.println("Given Element not found in the array");
		}else {
			System.out.println("Element found at the position: "+ postion);
		}
	}

}
