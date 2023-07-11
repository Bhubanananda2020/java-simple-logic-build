package com.bhubanananda.logic.sixtoten;

/**
 * The Class Pattern6.
 *
 * @author BhubananandaBhubanananda
 */
public class Pattern6 {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		type1();
		System.out.println();
		System.out.println();
		type2();
	}

	/**
	 * Type 1.
	 */
	private static void type1() {
		for (int i = 1; i <= 25; i++) {
			System.out.printf("%4d",i);
			if (i % 5 == 0) {
				System.out.println();
			}
		}
	}

	/**
	 * Type 2.
	 */
	private static void type2() {
		int n = 5;
		int k = 1;

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.printf("%4d",k);
				k++;
			}
			System.out.println();
		}
	}

}
