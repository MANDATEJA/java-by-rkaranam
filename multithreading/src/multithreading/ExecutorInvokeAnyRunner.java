package multithreading;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorInvokeAnyRunner {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executorService = Executors.newFixedThreadPool(3);

		List<CallableTask> tasks = List.of(new CallableTask("Teja"), new CallableTask("Mounica"), new CallableTask("Gowthami"));

		// Invoke any on executorService returns the first result from the callableTask
		// Unlike executorService.submit() or .invokeAll(), it is not returning the future state of the task but the result itself
		String result = executorService.invokeAny(tasks);

		System.out.println(result);

		executorService.shutdown();

	}

}
