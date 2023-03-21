package exception.handling;

public class ExceptionHandlingRunner {

	public static void main(String[] args) {
		System.out.println("Main started");
		methodOne();
		System.out.println("Main Ended");

	}

	private static void methodOne() {
		System.out.println("Method one started");
		methodTwo();
		System.out.println("Method one ended");
	}

	private static void methodTwo() {
		try {
			System.out.println("Method two started");
			String str = null;
			System.out.println(str.length());
			System.out.println("Method two ended");
		} catch (NullPointerException ex) {
			System.out.println("caught NullPointerException");
			ex.printStackTrace();
		} catch (Exception ex) {
			ex.printStackTrace();
			System.out.println("Exception caught at method two");
		}
	}

}
