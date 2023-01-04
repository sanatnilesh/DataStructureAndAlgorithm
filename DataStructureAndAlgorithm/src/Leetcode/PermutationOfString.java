package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class PermutationOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean value = checkInclusion("ab","eidbaooo");
		System.out.println(value);
	}

	public static boolean checkInclusion(String s1, String s2) {
		List<String> permutatedStrings = new ArrayList<>();
		permutation(s1, "", permutatedStrings);
		for (int i = 0; i < permutatedStrings.size(); i++) {
			String str = permutatedStrings.get(i);
			if (s2.contains(str)) {
				return true;
			}
		}
		return false;

	}

	private static List<String> permutation(String string, String prefix, List<String> str) {
		// TODO Auto-generated method stub
		if (string.length() == 0) {
			str.add(prefix);
		} else {
			for (int i = 0; i < string.length(); i++) {
				String rem = string.substring(0, i) + string.substring(i + 1);
				permutation(rem, prefix + string.charAt(i), str);
			}
		}
		return str;
	}

}
