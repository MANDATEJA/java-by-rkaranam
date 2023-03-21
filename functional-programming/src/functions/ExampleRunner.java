package functions;

import java.util.List;

public class ExampleRunner {

	public static void main(String[] args) {
		List<String> list = List.of("Apple", "Banana", "Cabbiage", "Cat", "Bat", "Muscat");
		printList(list);
	}

	public static void printList(List<String> list) {
		list.stream().filter(element -> element.endsWith("at"))
				.forEach(element -> System.out.println("Element - " + element));
	}

}
