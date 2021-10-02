package com.daysix;

/**
 * digits of one number are the reverse of the digits in another number
 * 
 * @author CHANDRU
 *
 */
public class ReverseNumber {

	public static void main(String[] args) {
		int num = 1234, rev = 0;

		// run loop until num becomes 0
		while (num != 0) {

			// get last digit from num
			int rem = num % 10;
			rev = rev * 10 + rem;

			// remove the last digit from num
			num = num / 10;
		}

		System.out.println("Reversed Number: " + rev);

	}

}
