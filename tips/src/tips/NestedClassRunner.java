package tips;

public class NestedClassRunner {
	private int i;
	class NestedClass {
		public void method() {
			i = 6; // Nested class of a class can access instance variables of a class
		}
	}

	static class StaticClass {
		public void method() {
			// i = 7; // Static nested class of a class cannot access instance variables of a class
		}
	}

	public static void main(String[] args) {
		StaticClass staticClass = new StaticClass(); // Static Nested Class can be accessed without instance of a class

		NestedClassRunner nestedClassRunner = new NestedClassRunner();
		NestedClass nestedClass = nestedClassRunner.new NestedClass(); // Nested class cannot be access without instance of a class
	}
}
