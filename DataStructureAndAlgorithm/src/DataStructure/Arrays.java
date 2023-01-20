package DataStructure;

import Algorithm.BinarySearch;
import Algorithm.BubbleSort;
import Algorithm.LinearSearch;
import Algorithm.MergeSort;
import Algorithm.QuickSort;
import Algorithm.SelectionSort;

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
		
		System.out.println("#######Bubble Sort##############################");
		int arrayBubble [] = {10,5,1,9,2};
		//Sorting - we can perform various algorithm for sorting 
		//To start with we first start with Brute Force that is Bubble sort. 
		int sortArray [] = BubbleSort.bubbleSort(arrayBubble);
		for (int i = 0; i < sortArray.length; i++) {
			System.out.print(sortArray[i] + " ");
		}
		
		System.out.println();
		System.out.println("#######Selection Sort##############################");
		//Selection Sort
		int arraySelection [] = {10,5,1,9,2};
		int selectArray[] = SelectionSort.selectionSort(arraySelection);
		for (int i = 0; i < selectArray.length; i++) {
			System.out.print(selectArray[i] + " ");
		}
		
		
		//QuickSort
		System.out.println();
		System.out.println("#######Quick Sort##############################");
		//Selection Sort
		int arrayQuick [] = {10,5,1,9,2};
		int quickArray[] = QuickSort.quickSort(arrayQuick, 0, arrayQuick.length-1);
		for (int i = 0; i < quickArray.length; i++) {
			System.out.print(quickArray[i] + " ");
		}
		
		System.out.println();
		System.out.println("#######Merge Sort##############################");
		//MergeSort
		int arrayMerge [] = {10,5,1,9,2};
		int mergeArray [] = MergeSort.mergeSort(arrayMerge, 0, arrayMerge.length-1);
		for (int i = 0; i < mergeArray.length; i++) {
			System.out.print(mergeArray[i] + " ");
		}
	}

}
