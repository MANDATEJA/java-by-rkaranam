package concurrency;

import java.util.concurrent.atomic.AtomicInteger;


// This class is just a demonstration of operations that can be performed instead of traditional ones like increment. Check docs for
// other Atomic classes that are thread safe
public class BiCounterWithAutomicInteger {
	private AtomicInteger i = new AtomicInteger();
	private AtomicInteger j = new AtomicInteger();

	public void incrementI() {
		i.incrementAndGet();
	}

	public int getI() {
		return i.get();
	}

	public void incrementJ() {
		j.incrementAndGet();
	}

	public int getJ() {
		return j.get();
	}
}
