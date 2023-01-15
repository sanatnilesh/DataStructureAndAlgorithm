package DataStructure;

import java.util.ArrayList;

/**
 * The arraylist is dyanmic array data structure. This double the size of the
 * space when the array is full of element.
 * 
 * @author Sanatkumar
 *
 */
public class ArrayListDataStructure {
	public static void main(String[] args) {
		String[] names = { "Sanat", "is", "working", "Hard" };

		String[] universities = { "Univeristy of Windsor", "University of Waterloo", "University of Ottawa",
				"University of Torronto" };
		ArrayList<String> sentence = new ArrayList<>();
		for (String string : names) {
			sentence.add(string);
		}

		for (String string : universities) {
			sentence.add(string);
		}

		System.out.println(sentence);

	}
}
