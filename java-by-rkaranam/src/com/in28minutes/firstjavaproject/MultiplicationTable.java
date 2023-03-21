package com.in28minutes.firstjavaproject;

public class MultiplicationTable {
	void print( int table ) {
		//		for ( int i =1; i <= 10; i++ ) {
		//			System.out.printf("%d * %d = %d", table, i, table * i).println();
		//		}

		// This is to avoid duplication of code
		print(table, 1, 10);
	}

	// We are overloading print method here
	void print( int table, int from, int to ) {
		for ( int i =from; i <= to; i++ ) {
			System.out.printf("%d * %d = %d", table, i, table * i).println();
		}
	}
}