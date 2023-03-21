package multithreading;

class TaskOne extends Thread {
	@Override
	public void run() { //SIGNATURE of run method for multithreading
		System.out.print("\nTaskOne started\n");
		for (int i = 0; i <= 100; i++) {
			System.out.print(i + " ");
		}
		System.out.print("\nTaskOne Done\n");

		Thread.yield();
	}
}

class TaskTwo implements Runnable {

	@Override
	public void run() {
		System.out.print("\nTask Two started\n");
		for (int i = 101; i <= 200; i++) {
			System.out.print(i + " ");
		}
		System.out.print("\nTask Two Done\n");
	}

}

public class ThreadBascisRunner {

	public static void main(String[] args) throws InterruptedException {
		// Implementation using Thread class
		System.out.print("TasKOne Kicked off\n");
		TaskOne taskOne = new TaskOne();
		// Priority of a thread should be between 1 and 10. Default(Normal) priority of thread is 5
		// Setting a priority is just a request. The request can/cannot be honored
		taskOne.setPriority(1);
		taskOne.start(); // We should not call run method here, calling run method will cause the program to run sequentially

		// Implementation using Runnable interface
		System.out.print("TasKTwo Kicked off\n");
		TaskTwo taskTwo = new TaskTwo();
		Thread taskTwoThread = new Thread(taskTwo);
		taskTwoThread.setPriority(10);
		taskTwoThread.start();

		// Wait for taskOne to complete
		// .join() method requires throws InterruptedException declaration for the main() method
		taskOne.join();
		// Wait for taskTwo to complete
		taskTwoThread.join();

		// This code gets executed only after all the threads with .join() call are completed
		System.out.print("\nTask Three started\n");
		for (int i = 201; i <= 300; i++) {
			System.out.print(i + " ");
		}
		System.out.print("\nTask Three Done\n");
		System.out.print("\nMain method done\n");

	}

}
