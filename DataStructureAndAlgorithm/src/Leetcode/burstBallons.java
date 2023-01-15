package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class burstBallons {
	public static void main(String[] args) {
		int [] [] points = {{1,2},{4,5},{1,5}};
		int minArrow = 1;
		Arrays.sort(points, (a,b)->Integer.compare(a[1], b[1]));
		List<Integer> list = new ArrayList<>();
		int index = 0;
		for (int[] is : points) {
			if (index % 2 == 0) {
				list.add(is[1]);
			}else {
				list.add(is[0]);
			}
			index++;
		}
		
		int previous = list.get(0);
		
		for (Integer integer : list) {
			System.out.print(integer + " ");
		}
		for (int i = 1; i < list.size(); i++) {
			if (list.get(i) > previous) {
				minArrow++;
				previous = list.get(i);
			}
		}
			
		System.out.println(minArrow);
//		List<Integer> list = new ArrayList<>();
//		for (int i = 0; i < points.length; i++) {
//			list.add(points[i][0]);
//		}
//		Collections.sort(list);
//		int [] [] newPoints = new int [points.length] [2];
//		int k = 0;
//		for(Integer value : list) {
//			for (int i = 0; i < points.length; i++) {
//				if(value == points[i][0]) {
//					newPoints [k] = points[i]; 
//				}
//			}
//			k++;
//		}
//		findMinArrowShots(newPoints);
		
	}

	public static int findMinArrowShots(int[][] points) {
		int minNumArrows = 0;
		List<Set<Integer>> arrayList = new ArrayList<>();
		for (int i = 0; i < points.length; i++) {
		    Integer[] array = new Integer[points[i].length];
		    Arrays.setAll(array, j -> array[j]);
	        Set<Integer> set = new HashSet<>(Arrays.asList(array));
	        arrayList.add(set);
		}
		
		for (int i = 0; i < arrayList.size(); i++) {
			Set<Integer> initialSet = arrayList.get(i);
			for (int k = i+1; k < arrayList.size(); k++) {
				boolean intersection = initialSet.retainAll(arrayList.get(k));
				if (intersection) {
					minNumArrows++;
					arrayList.remove(k);
				}
			}
		}
		return 0;
	}
}	
