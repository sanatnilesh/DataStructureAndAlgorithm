package Leetcode;
public class DetectCapital {
	public static void main(String[] args) {
		String word = "CANADA";
		System.out.println(detectWord(word));
	}

	private static boolean detectWord(String word) {
		// TODO Auto-generated method stub
		char []  array = word.toCharArray();
		char []  uppercase = new char [array.length];
		char []  lowercase = new char [array.length];
		char []  capitalizecase = new char [array.length];
		for (int i = 0; i < array.length; i++) {
			if (Character.isUpperCase(array[i])) {
				array[i] = 'u';
			}else {
				array[i] = 'l';
			}
			uppercase[i]='u';
			lowercase[i]='l';
			if (i==0) {
				capitalizecase[i]='u';
			}else {
				capitalizecase[i]='l';
			}
		}
		String finalString = String.valueOf(array);
		String upperString = String.valueOf(uppercase); 
		String lowerString = String.valueOf(lowercase);
		String capitalizeString = String.valueOf(capitalizecase);
		if (finalString.equalsIgnoreCase(upperString)) {
			return true;
		}else if (finalString.equalsIgnoreCase(lowerString)) {
			return true;
		}else if(finalString.equalsIgnoreCase(capitalizeString)) {
			return true;
		}else {
			return false;
		}

	}
	
	
}
