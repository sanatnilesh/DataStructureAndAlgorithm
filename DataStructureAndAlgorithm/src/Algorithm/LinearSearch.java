package Algorithm;

public class LinearSearch {
	
	//O(N) complexity
	public static String linearSearch(int array[], int targetElement) {
		for (int i = 0; i < array.length; i++) {
			if (targetElement == array[i]) {
				return Integer.toString(i); //return index
			}
		}
		return null;
	}
}
