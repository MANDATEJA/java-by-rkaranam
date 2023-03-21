package concurrency;

public class BiCounter {
	private int i = 0;
	private int j = 0;

	synchronized public void incrementI() {
		// Increment operations involves three steps
		// 1. get the variable. 2. Increment it 3. Set the variable.
		// This is not an atomic operation
		i++;
	}

	public int getI() {
		return i;
	}

	synchronized public void incrementJ() {
		// Increment operations involves three steps
		// 1. get the variable. 2. Increment it 3. Set the variable.
		// This is not an atomic operation
		j++;
	}

	public int getJ() {
		return j;
	}
}
