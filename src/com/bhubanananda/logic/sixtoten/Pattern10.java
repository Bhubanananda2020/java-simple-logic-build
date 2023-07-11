package com.bhubanananda.logic.sixtoten;

/**
 * @author Bhubanananda
 *
 */
public class Pattern10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		process1();
	}

	private static void process1() {

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {

				System.out.printf(j + "" + i);
				System.out.print(" ");
			}
			System.out.println();
		}
	}

}
