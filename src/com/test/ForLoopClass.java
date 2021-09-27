package com.test;

import java.util.Scanner;

public class ForLoopClass {

	@SuppressWarnings({ "resource" })
	public static void main(String[] args) {
//		System.out.println(10000 / 5000);
//
//		System.out.println(10002 / 5000);
//		System.out.println(10000 % 5000);
//
//		System.out.println(10002 % 5000);
//		
		/*
		 * int i= 0; int n = 33333; i=(n%5000)==0 ? (n/5000) : (n/5000)+1;
		 * System.out.println(i); int endSequence=0; int start;
		 * 
		 * 
		 * 
		 * for(int j=0;j<i;j++) { start=(j*5000)+1; if ((n -start)> 5000) endSequence
		 * =(endSequence%5000)==0 ? (endSequence+5000) : n%5000; else endSequence = n ;
		 * System.out.println("Start "+start); System.out.println(" End "+endSequence);
		 * }
		 */

		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		String rev = "";
		Scanner scannerInt = new Scanner(System.in);
		char[] arr = str.toCharArray();
		int j = scannerInt.nextInt();

		int count = 0;
		if (j < 10) {
			System.out.println("please enter above value 10");
			j = scannerInt.nextInt();
			System.out.println(j);
		}
		// emi calculator
		for (int i = 0; i < 3; i++) {

			count = j / 10;
			j = j - count;
			count = j;

		}
		System.out.println(count);

		// reverse String
		for (int i = arr.length - 1; i >= 0; i--) {
			rev += arr[i];

		}
		System.out.println(rev);

	}

}
