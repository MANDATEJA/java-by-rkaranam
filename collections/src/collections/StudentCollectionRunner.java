package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class AscendingComparator implements Comparator<Student> {

	@Override
	public int compare(Student studentOne, Student studentTwo) {
		// TODO Auto-generated method stub
		return Integer.compare(studentOne.getId(), studentTwo.getId());
	}

}

public class StudentCollectionRunner {

	public static void main(String[] args) {
		List<Student> students = List.of(new Student(7, "Dhoni"), new Student(8, "Kalam"), new Student(6, "Teja"));
		System.out.println(students);
		List<Student> studentArrayList = new ArrayList<>(students);

		Collections.sort(studentArrayList); // This will work only if we implement Student class as comparable
		// interface. Check Student class for implementation

		System.out.println("Decending student array List: " + studentArrayList);

		// Calling the overloaded method of Collection.sort() method below to use newly
		// implemented Compare class AscendingComparator
		//		Collections.sort(studentArrayList, new AscendingComparator());

		//		Above Collections.sort() can also be implemented as below::
		studentArrayList.sort(new AscendingComparator());

		System.out.println("Asccending student array List: " + studentArrayList);
	}

}
