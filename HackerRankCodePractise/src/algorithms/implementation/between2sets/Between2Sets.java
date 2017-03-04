package algorithms.implementation.between2sets;

import java.util.Scanner;

public class Between2Sets {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Values: ");
		int n = in.nextInt();
		int m = in.nextInt();
		int[] a = new int[n];
		int a_max = a[0];
		for (int a_i = 0; a_i < n; a_i++) {
			a[a_i] = in.nextInt();
			if (a[a_i] > a_max) {
				a_max = a[a_i];
			}
		}
		int[] b = new int[m];
		int b_max = b[0];
		for (int b_i = 0; b_i < m; b_i++) {
			b[b_i] = in.nextInt();
			if (b[b_i] > b_max) {
				b_max = b[b_i];
			}
		}
		int xArr[] = new int[50];
		int xArCounter = 0;

		int p = lcm(a);
		if (p < 0)
			p = 0;
		int maxVal = 0;
		if (p > 0)
			maxVal = b_max / p;
		boolean divPossible = false;
		for (int x = 1; x <= maxVal; x++) {
			int dvisor = p * x;
			for (int q = 0; q < b.length; q++) {
				if (b[q] % dvisor == 0) {
					divPossible = true;
				} else {
					divPossible = false;
					break;
				}
			}
			if (divPossible) {
				xArr[xArCounter] = dvisor;
				xArCounter++;
			}
		}

		int count = 0;
		for (int i = 0; i < xArr.length; i++) {
			if (xArr[i] != 0) {
				count++;
			}
		}

		System.out.println(count);
	}

	private static int lcm(int[] input) {
		int result = input[0];
		for (int i = 1; i < input.length; i++)
			result = lcm(result, input[i]);
		return result;
	}

	private static int lcm(int a, int b) {
		return a * (b / gcd(a, b));
	}

	private static int gcd(int a, int b) {
		while (b > 0) {
			int temp = b;
			b = a % b; // % is remainder
			a = temp;
		}
		return a;
	}
}
