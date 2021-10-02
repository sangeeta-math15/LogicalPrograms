package com.daysix;

/**
 * Prime number is divided greater than 1 and divided by 1 or itself is referred
 * to as the Prime number.
 * 
 * @author CHANDRU
 *
 */

public class PrimeNumber {

	public static void main(String[] args) {
		int i, m = 0, flag = 0; // initialize a flag variable as false
		int n = 5;// it is the number to be checked
		m = n / 2;
		if (n == 0 || n == 1) {
			System.out.println(n + " is not prime number");
		} else {
			for (i = 2; i <= m; i++) {
				if (n % i == 0) {
					System.out.println(n + " is not prime number");
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				System.out.println(n + " is prime number");
			}
		}
	}
}
