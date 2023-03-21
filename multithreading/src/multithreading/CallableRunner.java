package multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class CallableTask implements Callable<String> {

	private String name;

	public CallableTask(String name) {
		this.name = name;
	}

	@Override
	public String call() throws Exception {
		Thread.sleep(1000);
		return "Hello " + name;
	}

}

public class CallableRunner {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executorService = Executors.newFixedThreadPool(1);

		Future<String> welcomeFuture = executorService.submit(new CallableTask("Teja"));
		System.out.println("New callable executed");
		// Below line of code is like awaiting on the result of the call
		String welcomeMessage = welcomeFuture.get();
		System.out.println(welcomeMessage);

		System.out.println("Main Completed");

	}

}
