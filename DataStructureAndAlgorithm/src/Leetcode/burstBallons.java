package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class burstBallons {
	public static void main(String[] args) {
		int [] [] points = {{10,16},{2,8},{1,6},{7,12}};
		findMinArrowShots(points);
		
		
	}

	public static int findMinArrowShots(int[][] points) {
		ArrayList<Set<Integer>> arrayList = new ArrayList<>();
		for (int i = 0; i < points.length; i++) {
		    Integer[] array = new Integer[points[i].length];
		    Arrays.setAll(array, j -> array[j]);
	        Set<Integer> set = new HashSet<>(Arrays.asList(array));
	        arrayList.add(set);
		}
		
		for (Set<Integer> set : arrayList) {
			boolean value = set.retainAll(arrayList);
		}
		
		return 0;
	}
}	
