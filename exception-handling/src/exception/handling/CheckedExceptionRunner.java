package exception.handling;

public class CheckedExceptionRunner {
	public static void main(String[] args) {
		try {
			methodOne();
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	private static void methodOne() throws InterruptedException {
		Thread.sleep(2000);

	}
}
