package algorithms.implementation.divisiblesumpairs;

import java.util.Scanner;

public class DivisibleSumPairs {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Data: ");
		int n = in.nextInt();
		int k = in.nextInt();
		int a[] = new int[n];
		for (int a_i = 0; a_i < n; a_i++) {
			a[a_i] = in.nextInt();
		}

		int counter = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i < j && (a[i] + a[j]) % k == 0) {
					// System.out.println("("+i+","+j+")");
					counter++;
				}
			}
		}
		System.out.println(counter);

	}

}
