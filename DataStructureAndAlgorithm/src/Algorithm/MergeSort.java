package Algorithm;

public class MergeSort {
	
	public static int [] mergeSort(int array [], int low, int high){
		if (low < high) {
			int mid = (low + (high - low) / 2);
			mergeSort(array, low, mid);
			mergeSort(array, mid+1, high);
			merge(array, low, mid, high);
		}
		
		return array;		
	}

	private static void merge(int[] array, int low, int mid, int high) {
		//size of sub array
		int firstArraySize = mid - low + 1;
		int secondArraySize = high - mid;
		
		int leftarray [] = new int [firstArraySize];
		int rightarray [] = new int [secondArraySize];
		
		for (int i = 0; i < rightarray.length; i++) {
			rightarray[i] = array[mid+1+i];
		}
		
		for (int i = 0; i < leftarray.length; i++) {
			leftarray[i] = array[low+i];
		}
		
		int m = 0,n = 0;
		int k = low;
		while(m < firstArraySize && n < secondArraySize) {
			if (leftarray[m] < rightarray[n]) {
				array[k] = leftarray[m];
				m++;
			}else {
				array[k] = rightarray[n];
				n++;
			}
			k++;
		}
		
		while(m < firstArraySize) {
			array[k] = leftarray[m];
			k++;m++;
		}
		
		while(n < secondArraySize) {
			array[k] = rightarray[n];
			k++;n++;
		}
	}
}
