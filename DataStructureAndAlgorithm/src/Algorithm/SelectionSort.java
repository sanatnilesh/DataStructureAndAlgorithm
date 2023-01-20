package Algorithm;

public class SelectionSort {
	
	//Selection Sort In place with O(N^2) Complexity.
	//The main logic of selection sort is that to find minimum element and
	//place at the end of sorted array.
	public static int [] selectionSort(int array[]) {
		for (int i = 0; i < array.length; i++) {
			int min = array[i];
			int minPostion = i;
			for (int j = i+1; j < array.length; j++) {
				if (array[j] < min) {
					min = array[j];
					minPostion = j;
				}
			}
			swap(array, i, minPostion);	
		}
		return array;
	}

	//Swap minimum element with the unsorted array part.
	private static void swap(int[] array, int i, int minPostion) {
		int temp = array[i];
		array[i] = array[minPostion];
		array[minPostion] = temp;
	}
}
