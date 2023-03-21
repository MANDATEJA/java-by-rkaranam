package tips;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AnonymousClassRunner {
	public static void main(String[] args) {
		ArrayList<String> animals = new ArrayList<>(List.of("Ant", "Ball", "Cat", "Elephant"));

		Comparator<String> lengthComparator = new Comparator<String> () { // Implementation of anonymous class

			@Override
			public int compare(String strOne, String strTwo) {
				return Integer.compare(strOne.length(), strTwo.length());
			}

		};
		Collections.sort(animals, lengthComparator);
		System.out.println(animals);
	}
}
