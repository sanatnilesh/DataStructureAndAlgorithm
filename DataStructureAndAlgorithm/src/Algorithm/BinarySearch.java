package Algorithm;

public class BinarySearch {

	public static String binarySearch(int array[], int target) {
		int min = 0;
		int max = array.length;
		
		while(min<=max) {
			int mid = (min+max)/2;
			if (array[mid]==target) {
				return Integer.toString(mid);
			}else if(array[mid] > target) {
				max = mid -1;
			}else {
				min = mid + 1;
			}
		}
		return null;
	}
}
