/**
 * 
 */
package com.bhubanananda.logic.sixtoten;

/**
 * The Class Pattern8.
 *
 * @author Bhubanananda
 */
public class Pattern8 {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		process1();
	}

	/**
	 * Process 1.
	 */
	private static void process1() {
		int count = 2;
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.printf("%4d", count);
				count = count + 2;
			}
			System.out.println();
		}
	}
}
