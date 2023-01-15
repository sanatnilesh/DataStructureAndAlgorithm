package DataStructure;

import java.util.Hashtable;
import java.util.Map;

public class HashTable {

	/**To store the key, value pair the Hash table data structure useful.
	 * The initial space is 11 and load factor is about to 0.75.
	 * Initial space = number of bucket in hash table to store values.
	 * load factor = To avoid collision rehash function need to perform which
	 * generally increases the size of the hash table. 
	 * 
	 * @author Sanatkumar
	 * **/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<Integer, String> hashtable = new Hashtable<>(2);
		
		//insert element in Hash table.
		hashtable.put(1, "Sanat");
		
		//update element with given key.
		hashtable.put(1, "Oreo");
		hashtable.put(2, "is");
		hashtable.put(3, "popular");
		hashtable.put(4, "Biscuit");
		
		//Retrieve element from the Hash Table.
		System.out.println(hashtable);
		System.out.println(hashtable.get(1));
		
		//is HashTable contains the given value
		boolean isContains = hashtable.contains("ABC");
		System.out.println("Is ABC in Hash Table? "+ isContains);
		
		//Remove value from the HashTable.
		hashtable.remove(2);
		System.out.println(hashtable);

		//Traversal in Hash Table.
		for (Map.Entry<Integer, String> entry : hashtable.entrySet()) {
			Integer key = entry.getKey();
			String val = entry.getValue();
			System.out.println(key +" " + val);
		}
	}

}
