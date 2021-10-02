package com.daysix;

import java.util.Scanner;

public class StopWatch {

	public static void main(String args[]) {
		// read key to start the time
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter key to start the time");
		char ch = sc.next().charAt(0);
		Long start = System.currentTimeMillis();

		// read key to stop the time
		System.out.println("Enter key to stop the time");
		char stopch = sc.next().charAt(0);
		Long stop = System.currentTimeMillis();

		float timeElapsed = (float) (stop - start) / 1000;
		System.out.println("Time= " + timeElapsed + "Seconds");
	}

}
