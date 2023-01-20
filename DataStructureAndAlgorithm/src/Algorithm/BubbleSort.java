package Algorithm;

public class BubbleSort {

	// Compares neighboring value and sort 
	// After one iteration the first element set it's correct index
	// In place algorithm with O(n^2)
	public static int [] bubbleSort(int array[]) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 1; j < array.length; j++) {
				if (array[j-1] > array[j]) {
					swap(array, j-1,j);
				}
			}
		}
		return array;
	}

	//Swap elements in Array
	private static void swap(int array[], int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
}
