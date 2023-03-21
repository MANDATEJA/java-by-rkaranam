package com.teja.consumer;

import java.util.List;
import java.util.logging.Logger;

import com.teja.sorting.algorithm.BubbleSort;

public class DirectConsumer {
	private static Logger logger = Logger.getLogger(MySortingUtilConsumer.class.getName());

	public static void main(String[] args) {
		BubbleSort bubbleSort = new BubbleSort();
		List<String> sortedList = bubbleSort.sort(List.of("Teja", "Mounica", "Gowthami", "Ganavi"));
		logger.info(sortedList.toString());
	}

}
