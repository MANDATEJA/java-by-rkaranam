package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetRunner {

	public static void main(String[] args) {
		List<Character> characters = List.of('A', 'Z', 'A', 'B', 'Z', 'F');

		// To have unique array/list. Cannot depend on it to sort the array
		Set<Character> hashSet = new HashSet<>(characters);
		System.out.println("Hash set: " + hashSet);

		// To sort the array descending order and have unique
		Set<Character> treeSet = new TreeSet<>(characters);
		System.out.println("Tree set: " + treeSet);

		// To maintain insertion order
		Set<Character> linkedListSet = new LinkedHashSet<>(characters);
		System.out.println("Linked Hash Set: " + linkedListSet);

	}

}
