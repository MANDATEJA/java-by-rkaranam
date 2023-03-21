package multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task extends Thread {
	private int number;

	public Task(int number) {
		this.number = number;
	}

	@Override
	public void run() {
		System.out.print("\nTask " + number + " started\n");
		for (int i = number * 100; i <= number * 100 + 100; i++) {
			System.out.print(i + " ");
		}
		System.out.print("\nTask " + number + " Done\n");
	}
}

public class ExecutorServiceRunner {

	public static void main(String[] args) {
        // ExecutorService executorService = Executors.newSingleThreadExecutor();
		ExecutorService executorService = Executors.newFixedThreadPool(2);


		// newSingleThreadExecutor() - this will make sure only one thread gets executed at a time.
		// This will not stop below task three code from executing
		executorService.execute(new Task(1));
		executorService.execute(new Task(2));
		executorService.execute(new Task(3));
		executorService.execute(new Task(4));


		executorService.shutdown();

	}

}
