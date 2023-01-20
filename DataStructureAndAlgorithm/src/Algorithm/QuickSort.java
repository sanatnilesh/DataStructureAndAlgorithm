package Algorithm;

public class QuickSort {

	// Take any example and trace iteration by iteration..................
	public static int[] quickSort(int array[], int low, int high) {
		if (low < high) {
			int partionIndex = partition(array, low, high);
			quickSort(array, low, partionIndex - 1);
			quickSort(array, partionIndex + 1, high);

		}
		return array;
	}

	private static int partition(int[] array, int low, int high) {
		int pivot = array[high];
		int i = low - 1;
		for (int j = low; j <= high - 1; j++) {
			if (array[j] < pivot) {
				i++;
				swap(array, i, j);
			}
		}
		swap(array, i + 1, high);
		return i + 1;
	}

	private static void swap(int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
}
