package collections;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

class StringLengthComparator implements Comparator<String> {

	@Override
	public int compare(String stringOne, String stringTwo) {
		// TODO Auto-generated method stub
		return Integer.compare(stringTwo.length(), stringOne.length());
	}

}

public class QueueRunner {

	public static void main(String[] args) {
		//		Queue<String> queue = new PriorityQueue<>(new StringLengthComparator());
		Queue<String> queue = new PriorityQueue<>(new StringLengthComparator());
		queue.addAll(List.of("Zebra", "Monky", "Cat", "Fox"));
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());

	}

}
