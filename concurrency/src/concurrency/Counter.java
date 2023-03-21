package concurrency;

public class Counter {
	private int i = 0;

	public void increment() {
		// Increment operations involves three steps
		// 1. get the variable. 2. Increment it 3. Set the variable.
		// This is not an atomic operation
		i++;
	}

	public int getI() {
		return i;
	}
}
