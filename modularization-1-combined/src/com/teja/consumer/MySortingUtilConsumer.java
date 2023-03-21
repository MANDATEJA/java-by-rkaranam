package com.teja.consumer;

import java.util.List;
import java.util.logging.Logger;

import com.teja.sorting.util.MySortingUtil;

public class MySortingUtilConsumer {

	private static Logger logger = Logger.getLogger(MySortingUtilConsumer.class.getName());

	public static void main(String[] args) {
		MySortingUtil util = new MySortingUtil();
		List<String> sortedList = util.sort(List.of("Teja", "Mounica", "Gowthami", "Ganavi"));
		logger.info(sortedList.toString());
	}
}
