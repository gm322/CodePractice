package com.test;


/**
 * 
 * @author Gangadhar
 * !Doc -- Factorial class
 *
 */
public class Recurssion {
	
	/**
	 * 
	 * @param n
	 * @return
	 * exampl:1
	 */
	public static int iterativeFactorial1(int n) {
		int result = 1;

		while (n > 0) {
			result *= n;
			n -= 1;
		}

		return result;
	}
	
	/**
	 * example :2
	 */
	public static int recursiveFactorial(int n) {
		if (n > 0) {
			return n * recursiveFactorial(n - 1);
		} else {
			return 1;
		}
	}

	public static int iterativeFactorial(int n) {
		int result = 1;

		while (n > 0) {
			result *= n;
			n -= 1;
		}

		return result;
	}
	/**
	 * 
	 * @param args
	 * example 3: using String and For loop
	 */
	 public static String reverseLoop(String text) {
		    String reversed = new String("");
		    for (int i=0; i < text.length(); i++){
		      reversed = text.charAt(i) + reversed;
		    }
		    return reversed;
		  }

		  // uses recursion
		  public static String reverseRecursive(String text){
		    if (text.length() == 0) {
		      return text;
		    } else {
		      return reverseRecursive(text.substring(1)) + text.charAt(0);
		    }
		  }
	
	public static void main(String[] args) {
		int recursiveSolution = recursiveFactorial(10);
		System.out.println("The recursive solution to 10! is: " + recursiveSolution);

		int iterativeSolution = iterativeFactorial(10);
		System.out.println("The iterative solution to 10! is: " + iterativeSolution);
		  String str = new String("howdy");
	        // calling recursive function
	        String reverse = reverseRecursive(str);
	        System.out.println(reverse);
		
	}

	
}
