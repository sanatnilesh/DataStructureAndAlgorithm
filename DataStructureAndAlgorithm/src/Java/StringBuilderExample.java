package Java;

import java.util.Iterator;

/**
 * Why StringBuilder is required? If we have string of array and if we wanted to
 * created a sentence from that array we need to perform string concatenation
 * operation. This operation do several times of copying and have O(N^2) time
 * complexity.
 * 
 * To reduce this time complexity String can be useful. As it simply creates
 * resizeable array of all strings, copying them back to string only when
 * necessary.
 * 
 * @author Sanatkumar
 *
 */
public class StringBuilderExample {

	public static void main(String[] args) {
		String[] words = { "Sanat", "Darshan", "Manan", "Dhruv", "Ravi", "Meet" };

		long start = System.nanoTime();
		String sentence = joinWords(words);
		long end = System.nanoTime();

		System.out.println("Time :" + (end - start));
		System.out.println(sentence);

		long initial = System.nanoTime();
		StringBuilder stringBuilder = new StringBuilder();
		for (String string : words) {
			stringBuilder.append(string);
		}
		long endTime = System.nanoTime();
		System.out.println("Time :" + (endTime - initial));
		System.out.println(stringBuilder.toString());
	}

	private static String joinWords(String[] words) {
		String sentence = "";
		for (String w : words) {
			sentence = sentence + w;
		}
		return sentence;
	}

}
