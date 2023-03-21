package generics;

import java.util.LinkedList;
import java.util.List;

public class GenericsRunner {

	public static <X> X doubleValue(X value) {
		return value;
	}

	public static <X extends List> void duplicate(X list) {
		list.addAll(list);
	}

	static double sumOfNumberList(List<? extends Number> numbers) {
		double sum = 0.0;
		for (Number number : numbers) {
			sum += number.doubleValue();
		}
		return sum;
	}

	public static void main(String[] args) {
		//		MyCustomList<String> listOne = new MyCustomList<>();
		//		listOne.addElement("Brown");
		//		listOne.addElement("White");
		//
		//		System.out.println("List one: " + listOne);
		//		String value = listOne.get(0);
		//		System.out.println(value);
		//
		//		MyCustomList<Integer> listTwo = new MyCustomList<>();
		//		listTwo.addElement(Integer.valueOf(8585));
		//		listTwo.addElement(Integer.valueOf(458954));
		//
		//		System.out.println("List two: " + listTwo);
		//		System.out.println(listTwo.get(0));

		List<String> stringList = new LinkedList<>(List.of("A", "B", "C"));
		duplicate(stringList);
		System.out.println(stringList);

		System.out.println(sumOfNumberList(List.of(1, 2, 3, 4, 5)));
		System.out.println(sumOfNumberList(List.of(1.1, 2.2, 3.3, 4.3, 5.5)));
		System.out.println(sumOfNumberList(List.of(1l, 2l, 3l, 4l, 5l)));
	}

}
