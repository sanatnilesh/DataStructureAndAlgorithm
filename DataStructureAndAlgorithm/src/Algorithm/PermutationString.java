package Algorithm;


/**
 * @author Sanatkumar Dhobi
 *	
 * This is really simple Java Code to perform string permutations using recursion.
 */
public class PermutationString {
	public static void main(String[] args) {
		String str = "abc";
		//System.out.println(str.substring(0,1) + str.substring(1+1));
		permutation(str);
		
	}
	
	public static void permutation(String str) {
		permutation(str, "");
	}

	private static void permutation(String str, String prefix) {
		//System.out.println("String :" + str + "      "+ "Prefix :"+ prefix);
		if (str.length() == 0) {
			System.out.println(prefix);
		}else {
			for (int i = 0; i < str.length(); i++) {
				String rem = str.substring(0,i) + str.substring(i+1);
				permutation(rem, prefix + str.charAt(i));
			}
		}
		
	}
}
